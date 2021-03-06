package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
//import org.springframework.validation.Validator;
import javax.validation.Validator; //zmieniamy bibliotekÄ™ dla Validatora
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Arrays;

@SpringBootApplication
public class TodoAppApplication /*implements RepositoryRestConfigurer*/ {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

//	@Override
//	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
//		validatingListener.addValidator("beforeCreate", validator());
//		validatingListener.addValidator("beforeSave", validator());
//
//	}

	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}
}
