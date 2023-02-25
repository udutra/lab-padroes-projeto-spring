package one.digitalInovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Projeto Spring Boot gerado via Spring Initializer
 * Os seguintes módulos selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *  
 * @author Guilherme
 */

@EnableFeignClients
@SpringBootApplication
@ComponentScan({"one.digitalInovation.gof.controller", "one.digitalInovation.gof.model", "one.digitalInovation.gof.service", "one.digitalInovation.gof.service.impl"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
