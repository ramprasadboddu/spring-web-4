package com.example.springrestapi.data;

import org.springframework.data.repository.CrudRepository;

import com.example.springrestapi.data.entity.Student;

public interface StudentRepository extends CrudRepository< Student,Integer> {
	Student findById( int id );

 
}
