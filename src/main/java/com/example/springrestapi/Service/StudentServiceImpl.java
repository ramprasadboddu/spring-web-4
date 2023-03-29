package com.example.springrestapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrestapi.data.StudentRepository;
import com.example.springrestapi.data.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImpl(@Autowired StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Iterable<Student> all() {
		return studentRepository.findAll();
	}

	@Override
	public Student getstudent(int id) {
		return studentRepository.findById(id);
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
