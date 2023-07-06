package com.awung.demo.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequiredArgsConstructor
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @GetMapping("api/v1/student")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("api/v1/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
}
