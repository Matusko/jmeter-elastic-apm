package sk.matusko.tutorial.jmeterelasticapm;

import co.elastic.apm.api.ElasticApm;
import co.elastic.apm.api.Span;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sk.matusko.tutorial.jmeterelasticapm.models.Pet;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
@Service
public class JmeterElasticApmService {

    private PetsRepository petsRepository;
    private Random random = new Random();

    public JmeterElasticApmService(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    Page<Pet> pagePets() {
        return this.petsRepository.findAll(Pageable.unpaged());
    }

    Pet delayedPet() {

        Span parent = ElasticApm.currentSpan();

        Span span = parent.startSpan();
        try {
            span.setName("delayedPetAction");
            try {
                int randInt = random.nextInt(4000);
                TimeUnit.MILLISECONDS.sleep(randInt);

                if (randInt > 3000) {
                    throw new TimeoutException("Execution timeouted");
                }

            } catch (InterruptedException ex) {
                log.error(ex.getMessage(), ex);
                Thread.currentThread().interrupt();
            }
        } catch (Exception e) {
            span.captureException(e);
            throw new RuntimeException(e);
        } finally {
            span.end();


        }

        return new Pet(8L, "Connie", "yellow", "snake");

    }
}