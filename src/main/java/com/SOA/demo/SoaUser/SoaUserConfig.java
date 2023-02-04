package com.SOA.demo.SoaUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SoaUserConfig {
    @Bean
    CommandLineRunner commandLineRunner(SoaUserRepository repository) {
        return args -> {
                   SoaUser Oscar = new SoaUser(
                           "Oscar",
                           "Vergara",
                           "Oscar.vergara1994@gmail.com",
                           "password1"
                    );

                   SoaUser Alex = new SoaUser(
                            "Alex",
                            "Rodriguez",
                            "Alex.Rod@gmail.com",
                            "password2"
                    );

                   repository.saveAll(
                           List.of(Oscar, Alex)
                   );
        };
    }
}
