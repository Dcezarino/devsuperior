package com.devsuperior.aulaid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aulaid.service.PayService;

@SpringBootApplication
public class AulaidSpringApplication implements CommandLineRunner {

	@Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(AulaidSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Resultado: " + payService.finalPrice(300.0, "SC"));

	}

}
