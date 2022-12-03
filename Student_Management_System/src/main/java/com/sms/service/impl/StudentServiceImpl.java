package com.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll() ;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
	
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		
		studentRepository.deleteById(id);
		
	}

}
