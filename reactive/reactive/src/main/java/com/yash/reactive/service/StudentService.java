package com.yash.reactive.service;

import com.yash.reactive.entity.Student;
import com.yash.reactive.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Flux<Student> getStudentByFirstname(final String firstname) {
        return studentRepository.findStudentByFirstnameIgnoreCase(firstname);
    }

    //To fetch all the students
    public Flux<Student> getAllStudents() {
        return studentRepository.findAll().delayElements(Duration.ofSeconds(1));
    }

    //To fetch student by ID
    public Mono<Student> getStudentById(final int id) {
        return studentRepository.findById(id);
    }

    //To add student in the database
    public Mono<Student> saveStudent(final Student student) {
        return studentRepository.save(student);
    }
}
