package jardin.nicolas.exemploinjecaodedependencia;

import jardin.nicolas.exemploinjecaodedependencia.interfaces.AnimalInterface;
import jardin.nicolas.exemploinjecaodedependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Nicólas
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

    /**
     * @author Nicólas
     */

//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }
// ACOPLADA
//    public void execute() {
//        animalInterface = new Cat();
//        animalInterface.comunicar();
//    }


    public void execute() {
        animalInterface.comunicar();
    }

}
