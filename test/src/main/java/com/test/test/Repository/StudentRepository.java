package com.test.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.test.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
