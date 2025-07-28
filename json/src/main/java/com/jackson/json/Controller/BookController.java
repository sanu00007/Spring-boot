package com.jackson.json.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.json.Model.Book;

@RestController
public class BookController {

    @GetMapping("/books")
    public Book retreiveBook(){
        return Book.builder()
        .id(1)
        .name("Apples in Forest")
        .author("Sanin")
        .year(2012)
        .build();
    }

    @GetMapping("/secondbook")
    public Book secondBook(){
        Book book = new Book(2,"Alice in Wonderland","William",1997);
        return book;
    }



    @PostMapping("/books")
    public void createBook(@RequestBody final Book book){
        System.out.println("Received Book is " + book.toString());
        
    }

   
}
