package com.springboot.practice.one.springboot01.models;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudentsList() {
        return List.of(
                new Student(
                        1L,
                        "Miriam",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21,
                        "miriam@gmail.com"
                )
        );
    }
}
