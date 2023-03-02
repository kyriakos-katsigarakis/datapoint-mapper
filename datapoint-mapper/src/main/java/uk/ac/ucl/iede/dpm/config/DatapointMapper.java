package uk.ac.ucl.iede.dpm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import uk.ac.ucl.iede.dpm.controller.MainController;

@Configuration
@SpringBootApplication
//@EntityScan("uk.ac.ucl.iede.dpm.dom")
//@EnableJpaRepositories({"uk.ac.ucl.iede.dpm.dom","uk.ac.ucl.iede.dpm.dao"})
@ComponentScan(basePackageClasses = {MainController.class})
public class DatapointMapper {

	public static void main(String[] args) {
		SpringApplication.run(DatapointMapper.class, args);
	}
}