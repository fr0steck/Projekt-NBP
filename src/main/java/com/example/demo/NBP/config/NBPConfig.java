package com.example.demo.NBP.config;

import com.example.demo.NBP.repository.NBPRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NBPConfig {

        @Bean
        CommandLineRunner commandLineRunner(NBPRepository repository) {
            return args -> repository.findAll();
        }
}
