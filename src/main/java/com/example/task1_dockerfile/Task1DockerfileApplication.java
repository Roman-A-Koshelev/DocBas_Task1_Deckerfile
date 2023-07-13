package com.example.task1_dockerfile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
@EnableJpaRepositories
public class Task1DockerfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task1DockerfileApplication.class, args);
	}

}
