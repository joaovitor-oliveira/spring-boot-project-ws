package com.joaovitor.springstudy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joaovitor.springstudy.entities.User;
import com.joaovitor.springstudy.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Canela", "canela@gmail.com", "999999999", "987654321");
		User u2 = new User(null, "M", "m@gmail.com", "888888888", "123456789");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
