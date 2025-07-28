package com.test.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.Model.Student;
import com.test.test.Repository.StudentRepository;

@RestController

public class DataInsertor {
    @Autowired
    private StudentRepository repo;


    @PostMapping("/student")
    private Student addStudent(@RequestBody Student student){
        System.out.println("Student is inserted: "+student);
        return  repo.save(student);
    }
    
    @GetMapping("/student")
    private List<Student> getStudent(){
        System.out.println("Student is Displayed");
        return repo.findAll();
    }

    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable int id){
        System.out.println("Student is Deleted");
        repo.deleteById(id);
    }

    @PutMapping("/student")
    private Student updateStudent(@RequestBody Student student){
        System.out.println("Student is updated");
        return repo.save(student);

    }


}
