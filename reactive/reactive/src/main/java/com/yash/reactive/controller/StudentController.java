package com.yash.reactive.controller;

import com.yash.reactive.entity.Student;
import com.yash.reactive.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Mono<Student> findStudentById(@PathVariable final int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping()
    public Mono<Student> saveStudent(@RequestBody final Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/firstname")
    public Flux<Student> getStudentByFirstname(
            @RequestParam(name = "firstname", required = false) String firstname
    ) {
        return studentService.getStudentByFirstname(firstname);
    }
}
