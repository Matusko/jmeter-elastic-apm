package sk.matusko.tutorial.jmeterelasticapm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sk.matusko.tutorial.jmeterelasticapm.models.Pet;

import java.util.Random;
import java.util.concurrent.TimeUnit;

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

    @Cacheable(cacheNames = "petsCache")
    public Page<Pet> cachedPagePets() {
        return this.petsRepository.findAll(Pageable.unpaged());
    }

    Pet delayedPet() {
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(10) + 1);
        }
        catch(InterruptedException ex) {
            log.error(ex.getMessage(), ex);
            Thread.currentThread().interrupt();
        }
        return new Pet(8L, "Connie", "yellow", "snake");

    }


}
