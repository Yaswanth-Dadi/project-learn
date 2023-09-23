package com.yash.reactive.repository;

import com.yash.reactive.entity.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

    Flux<Student> findStudentByFirstnameIgnoreCase(String firstname);
}
