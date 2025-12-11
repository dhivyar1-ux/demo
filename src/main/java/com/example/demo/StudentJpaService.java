package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentJpaService {
	@Autowired
	StudentRepo repo;
	
	public List<Student> getStudents() {
		return repo.findAll();
	}

	public Student getStudentByRno(Integer rollno) {
		return repo.findById(rollno).orElse(new Student());
	}

	public void addStudent(Student newstudent){
		repo.save(newstudent);
	}

	public String updateStudent(Student updatestudent){
		repo.save(updatestudent);
		return "Updated successfully";
	}

	public String deleteStudent(Integer rno){
		repo.deleteById(rno);
		return "Deleted successfully";
	}

	public List<Student> getStudentsByCourse(String course) {
		return repo.findByCourse(course);
	}
}
