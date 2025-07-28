package com.test.test.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
   // @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;
}
