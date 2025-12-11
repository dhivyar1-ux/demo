package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired
	StudentJpaService studentService;
	
	@GetMapping("list")
	public List<Student> getStudentList() {
		return studentService.getStudents();
	}
	
	@GetMapping("{rno}")
	public Student getStudentByRno(@PathVariable("rno") Integer rollno) {	
		return studentService.getStudentByRno(rollno);
	}

	@GetMapping("search")
	public List<Student> getStudentsByCourse(@RequestParam String course) {
		return studentService.getStudentsByCourse(course);
	}
	
	@PostMapping("insert")
	public String addStudent(@RequestBody Student student){
		studentService.addStudent(student);
		return "success";
	}

	@PutMapping("update")
	public String updateStudent(@RequestBody Student student){
		return studentService.updateStudent(student);
	}

	@DeleteMapping("{rno}")
	public String deleteStudent(@PathVariable Integer rno){
		return studentService.deleteStudent(rno);
	}
	//create - post, read - get ,update - put,delete - delete
}
