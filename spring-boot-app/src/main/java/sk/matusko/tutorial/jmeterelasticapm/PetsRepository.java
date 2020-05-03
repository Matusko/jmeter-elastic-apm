package sk.matusko.tutorial.jmeterelasticapm;

import org.springframework.data.repository.PagingAndSortingRepository;
import sk.matusko.tutorial.jmeterelasticapm.models.Pet;

public interface PetsRepository extends PagingAndSortingRepository<Pet, Long> {
}
