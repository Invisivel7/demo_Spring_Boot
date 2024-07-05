package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student maria = new Student(
			"Maria Joaquim",
			"maria@gmail.com",
			LocalDate.of(2000, Month.JANUARY, 5)
			);
			Student alex = new Student(
			"Alex José",
			"alex@gmail.com",
			LocalDate.of(1990, Month.DECEMBER, 12)
			);	
			
			repository.saveAll(
					List.of(maria, alex)
					);
		};
	}

}
