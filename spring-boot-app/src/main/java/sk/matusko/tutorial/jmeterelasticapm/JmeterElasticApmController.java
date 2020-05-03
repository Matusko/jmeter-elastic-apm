package sk.matusko.tutorial.jmeterelasticapm;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.matusko.tutorial.jmeterelasticapm.models.Pet;

@RestController
public class JmeterElasticApmController {

    private JmeterElasticApmService jmeterElasticApmService;

    public JmeterElasticApmController(JmeterElasticApmService jmeterElasticApmService) {
        this.jmeterElasticApmService = jmeterElasticApmService;
    }

    @GetMapping("/pets")
    public Page<Pet> pagePets() {
        return this.jmeterElasticApmService.pagePets();
    }

    @GetMapping("/pet-delayed")
    public Pet delayedPet() {
        return this.jmeterElasticApmService.delayedPet();
    }

}
