package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInit {

	@Value("${saluto}")
	private String saluto;
	
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("Eseguito il metodo postConstruct():" + saluto);
		}
	
	@PostConstruct
	private void postConstruct1() {
		System.out.println("Eseguito il metodo postConstruct1() della classe Application");
		}
	
}

