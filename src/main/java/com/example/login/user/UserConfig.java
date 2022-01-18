package com.example.login.user;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository repository) {
		
		return args -> {
			User arife = new User(
					1L,
					"arifegul",
					"arifegulyalcinn@gmail.com",
					"arifeyalcin"
					);
			User beyza = new User(
					2L,
					"beyza",
					"beyza_maden97@hotmail.com",
					"beyzamadenoglu"
					);
					
			repository.saveAll(
					List.of(arife,beyza)
			);
		};
		
	}
	
}
