package jardin.nicolas.testeMaven;

import jardin.nicolas.testeMaven.model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteMavenApplication.class, args);

		Aluno aluno = new Aluno();

		aluno.setNota1(10);
		aluno.setNota2(9);
		System.out.println(aluno);
	}

}
