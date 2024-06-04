package com.elife.projet_ff;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;





@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProjetFfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetFfApplication.class, args);

	}

}
