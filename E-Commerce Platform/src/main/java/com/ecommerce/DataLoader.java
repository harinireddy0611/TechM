package com.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.count() == 0) { 

                
                User admin = User.builder()
                        .username("admin")
                        .password(passwordEncoder.encode("adminpass"))  
                        .role("ROLE_ADMIN")
                        .build();

                
                User customer = User.builder()
                        .username("customer")
                        .password(passwordEncoder.encode("customerpass"))  
                        .role("ROLE_CUSTOMER")
                        .build();

                
                userRepository.save(admin);
                userRepository.save(customer);

                System.out.println("Sample users inserted into H2 database!");
            }
        };
    }
}
