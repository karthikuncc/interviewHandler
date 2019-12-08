package com.app.interview.interviewhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "com.app.interview.*")
@EntityScan(basePackages = { "com.app.interview.model" })
@EnableJpaRepositories("com.app.interview.repository")
public class InterviewHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewHandlerApplication.class, args);
	}

}
