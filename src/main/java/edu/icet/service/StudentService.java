package edu.icet.service;

import edu.icet.dto.Student;


import java.util.List;
import java.util.Optional;


public interface StudentService {
    List<Student> getStudent();

    void addStudent(Student student);

    void deleteStudentById(Integer id);

    void updateStudent(Student student);


    Optional<Student> findById(Integer id);


    List<Student> findByFullName(String fullName);
}
