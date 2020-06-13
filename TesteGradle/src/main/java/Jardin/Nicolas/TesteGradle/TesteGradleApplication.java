package Jardin.Nicolas.TesteGradle;

import Jardin.Nicolas.TesteGradle.model.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteGradleApplication.class, args);

		Calculadora calculadora = new Calculadora();
		calculadora.setNumero1(10);
		calculadora.setNumero2(5);
		System.out.println(calculadora);

		Calculadora calculadora1 = new Calculadora(15,10);
		System.out.println(calculadora1);
	}

}
