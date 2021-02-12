package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProjectApplication.class, args);
		
		String password = "pass";
		String password1 = "word";
		String password2 = "login";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println("===========================================");
		System.out.println(hashedPassword);
		System.out.println("===========================================");
		hashedPassword = passwordEncoder.encode(password1);
		System.out.println("===========================================");
		System.out.println(hashedPassword);
		System.out.println("===========================================");
		hashedPassword = passwordEncoder.encode(password2);
		System.out.println("===========================================");
		System.out.println(hashedPassword);
		System.out.println("===========================================");
	}
}
