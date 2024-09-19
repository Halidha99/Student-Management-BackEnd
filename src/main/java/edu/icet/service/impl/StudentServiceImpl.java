package edu.icet.service.impl;


import edu.icet.Repository.StudentRepository;
import edu.icet.dto.Student;
import edu.icet.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override
    public List<Student> getStudent() {
        List<Student> stdList = repository.findAll();

        return  stdList;
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Optional<Student> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Student> findByFullName(String fullName) {
        return repository.findByFullName(fullName);
    }


}
