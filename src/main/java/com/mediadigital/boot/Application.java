package com.mediadigital.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mediadigital.repository.VehicleRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = VehicleRepository.class)
@ComponentScan(basePackages = "com.mediadigital")
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}	