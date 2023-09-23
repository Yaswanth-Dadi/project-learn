package com.yash.reactive;

import com.yash.reactive.entity.Student;
import com.yash.reactive.repository.StudentRepository;
import com.yash.reactive.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class ReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentService studentService) {
//        return args -> {
//            for (int i = 3; i <= 50; i++) {
//                studentService.saveStudent(
//                        Student.builder()
//                                .firstname(i + " Sham")
//                                .lastname(i + " Yaswanth")
//                                .age(i)
//                                .build()
//                ).subscribe();
//            }
//        };
//    }
}
