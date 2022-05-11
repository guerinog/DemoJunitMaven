package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	private Log logger = LogFactory.getLog(this.getClass());
	
	@BeforeEach
	void setUp() throws Exception {
		logger.debug("Inizio");
		logger.debug("Fine");
	}

	@AfterEach
	void tearDown() throws Exception {
		logger.debug("Inizio");
		logger.debug("Fine");
	}

	private int somma(int a, int b) {
		return a+b;
	}
	private int sottrazione(int a, int b) {
		return a-b;
	}
	
	@Test
	public void testSomma() {
		logger.debug("Inizio testSomma");
		int a=5, b=3;
		int s = somma(a, b);
		assertEquals(8,s,"somma non corretta");
		logger.debug("Fine testSomma");
	}
	
	@Test
	public void testSottrazione() {
		logger.debug("Inizio testSottrazione");
		int a=5, b=3;
		int s = sottrazione(a, b);
		assertEquals(2,s,"sottrazione non corretta");
		logger.debug("Fine testSottrazione");
	}
}
