package com.example.springrestapi.Service;

import java.util.List;

import com.example.springrestapi.data.entity.Student;

 

public interface StudentService {
	   Iterable<Student> all();

	    

	    void save( Student student );

	    void delete( int  Id );

		 
		Student getstudent(int Id);
}
