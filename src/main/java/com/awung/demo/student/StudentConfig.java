package com.awung.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    // this bean is to initialize entries of the DB, cuz we clear it after every session.
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mary = new Student("Mary", "mary@example.net",  LocalDate.of(2002, Month.APRIL, 17));
            Student felix = new Student("felix", "felix@example.net",  LocalDate.of(1982, Month.SEPTEMBER, 1));

            repository.saveAll(List.of(mary, felix));   // hibernate saves these entries into DB
        };
    }
}
