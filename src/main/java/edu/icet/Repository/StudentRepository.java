package edu.icet.Repository;

import edu.icet.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Integer> {


    List<Student> findByFullName(String fullName);
}
