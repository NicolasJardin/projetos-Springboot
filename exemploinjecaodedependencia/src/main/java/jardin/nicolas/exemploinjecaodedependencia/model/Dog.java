package jardin.nicolas.exemploinjecaodedependencia.model;

import jardin.nicolas.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Nicólas
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au AU");
    }

}
