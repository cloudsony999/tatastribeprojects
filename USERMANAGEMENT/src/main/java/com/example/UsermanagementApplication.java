package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class UsermanagementApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsermanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		User u = new User();
		u.setName("amitava");
		u.setEmail("a@gmail.com");
		userRepository.save(u);
		User u1 = new User();
		u1.setName("samik");
		u1.setEmail("s@gmail.com");
		userRepository.save(u1);
		User u2 = new User();
		u2.setName("demo");
		u2.setEmail("u@gmail.com");
		userRepository.save(u2);
		User u3 = new User();
		u3.setName("test");
		u3.setEmail("t@gmail.com");
		userRepository.save(u3);
		System.out.println("-----------data saved------------");
	}

}
