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
                   SoaUser Oscar = new SoaUser("Oscar Vergara",
                            "Oscar.vergara1994@gmail.com"
                    );

                   SoaUser Alex = new SoaUser("Alex Rodriguez",
                    "Alex.Rod@gmail.com"
                    );

                   repository.saveAll(
                           List.of(Oscar, Alex)
                   );
        };
    }
}
