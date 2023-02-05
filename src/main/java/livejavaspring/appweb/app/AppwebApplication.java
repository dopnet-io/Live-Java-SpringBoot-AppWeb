package livejavaspring.appweb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"livejavaspring.appweb.entity"})
@EnableJpaRepositories(basePackages = {"livejavaspring.appweb.repository"})
@ComponentScan(basePackages = {"livejavaspring.appweb.controller"})
public class AppwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppwebApplication.class, args);
	}

}
