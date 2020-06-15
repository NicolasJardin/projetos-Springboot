package jardin.nicolas.exemploescopo;

import jardin.nicolas.exemploescopo.dao.ClassDAO;
import jardin.nicolas.exemploescopo.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassJDBC classJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC classJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO classDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO classDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto da classe JDBC: " + classJDBC);
		System.out.println("Objeto da classe JDBC1: " + classJDBC1);

		System.out.println("Objeto da classe DAO: " + classDAO);
		System.out.println("Objeto da classe DAO1: " + classDAO1);

	}

}
