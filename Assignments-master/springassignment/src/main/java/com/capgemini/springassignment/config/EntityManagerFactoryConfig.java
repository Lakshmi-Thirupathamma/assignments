package com.capgemini.springassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class EntityManagerFactoryConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManager() {
		LocalContainerEntityManagerFactoryBean factory = new
				LocalContainerEntityManagerFactoryBean();
		factory.setPersistenceUnitName("emsPersistence");
		return factory;
	}
}
