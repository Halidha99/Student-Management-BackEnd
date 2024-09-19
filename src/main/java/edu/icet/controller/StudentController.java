package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudent();
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestPart("student") Student student,@RequestPart("image")MultipartFile file) throws IOException {
        student.setImage(file.getBytes());
        service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        service.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestPart("student") Student student,@RequestPart("image") MultipartFile file) throws IOException {
        student.setImage(file.getBytes());

        service.addStudent(student);
    }

    @GetMapping("/find-by-id/{id}")
    public Optional<Student> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/find-By-Name/{fullName}")
    public List<Student> findByFullName(@PathVariable String fullName) {
        return service.findByFullName(fullName);
    }
}
