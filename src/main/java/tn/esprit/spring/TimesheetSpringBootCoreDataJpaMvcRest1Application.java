package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAspectJAutoProxy
public class TimesheetSpringBootCoreDataJpaMvcRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(TimesheetSpringBootCoreDataJpaMvcRest1Application.class, args);
	}

}