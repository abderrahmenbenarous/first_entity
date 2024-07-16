package tn.esprit.first_entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FirstEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstEntityApplication.class, args);
    }

}
