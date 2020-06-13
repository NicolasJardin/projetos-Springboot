package jardin.nicolas.exemploinjecaodedependencia;

import jardin.nicolas.exemploinjecaodedependencia.model.Cat;
import jardin.nicolas.exemploinjecaodedependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Nicólas
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

//		1 maneira - acoplada
//		Pet pet = new Pet();
//		pet.execute();

//		2- maneira menos acoplada
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet1.execute();


//        3 maneira



	}

}
