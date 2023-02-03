package com.SOA.demo;

import com.SOA.demo.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class BookStoreBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreBackEndApplication.class, args);
	}



}
