package jardin.nicolas.exemplopostconstructpredestroy;

import jardin.nicolas.exemplopostconstructpredestroy.dao.ClientDAO;
import jardin.nicolas.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * @author Nicólas
 * @version 1.0
 * @since 6/11/2020 - 3:27 PM
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Nick", "Fury"));

		System.out.println("ClientDAO : " + clientDAO);
		System.out.println("Client : " + clientDAO.getClient().toString());
	}

}
