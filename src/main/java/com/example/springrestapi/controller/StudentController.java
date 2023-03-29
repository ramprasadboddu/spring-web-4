package com.example.springrestapi.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestapi.Service.StudentService;
import com.example.springrestapi.data.entity.Student;
 @RestController
public class StudentController{
	
 

	 private final StudentService studentService;


	    public StudentController(@Autowired StudentService studentService) {
	        this.studentService = studentService;
	    }

	    @GetMapping("/student")
	    public  Iterable<Student> all() {
	        return studentService.all();
	    }

	    @GetMapping("/student/{id}")
	    public Student get( int id ) {
	      
			return studentService.getstudent(id);
	    }

	    @PostMapping("/student")
	    public void save(@RequestBody Student student) {
	        studentService.save(student);
	    }

	    @PutMapping("/student")
	    public void update(@RequestBody Student student) {
	        studentService.save(student);
	    }

	    @DeleteMapping("/student/{id}")
	    public void delete(@PathVariable  int id) {
	        studentService.delete(id);
	    }
}
