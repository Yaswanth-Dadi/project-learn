package com.yash.reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "student")
public class Student {

    @Id
    private int id;

    private String firstname;

    private String lastname;

    private int age;
}
