package com.test.csvpostgres;


import com.test.csvpostgres.config.ConfigProperties;
import com.test.csvpostgres.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class CsvPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvPostgresApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
