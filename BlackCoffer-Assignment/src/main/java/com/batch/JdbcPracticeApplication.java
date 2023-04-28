package com.batch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcPracticeApplication implements CommandLineRunner{
	
//	@Autowired
//	private UserDao dao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		this.dao.fetchAndPrintData();	
	}

}
 