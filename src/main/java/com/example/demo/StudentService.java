package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

public class StudentService {
	List<Student> students = new ArrayList<>(
			Arrays.asList(
			new Student(1,"Ram","AI"),
			new Student(2,"Ganesh","ML")
			)
	);

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudentByRno(int rollno) {
		int index = 0;
		for (int i=0;i<students.size();i++){
			if(students.get(i).getRno()==rollno){ 
				index = i; 
				break;
			}
		}
		return students.get(index);
	}

	public void addStudent(Student newstudent){
		students.add(newstudent);
	}

	public String updateStudent(Student updatestudent){
		int index = 0;
		Boolean found = false;
		for (int i=0;i<students.size();i++){
			if(students.get(i).getRno()==updatestudent.getRno()){ 
				index = i; 
				found = true;
				break;
			}
		}
		if(!found) return "No such student exist";
		else {
			students.set(index,updatestudent);
			return "Updation is done..";
		}
	}

	public String deleteStudent(int rno){
		int index = 0;
		Boolean found = false;
		for (int i=0;i<students.size();i++){
			if(students.get(i).getRno()==rno){ 
				index = i; 
				found = true;
				break;
			}
		}
		if (found) {	
			students.remove(index); 
			return "Deleted successfully";
		} else {
			return "No such student exists";
		}
	}

	public Student getStudentsByCourse(String course) {
		int index = 0;
		for (int i=0;i<students.size();i++){
			if(students.get(i).getCourse()==course){ 
				index = i; 
				break;
			}
		}
		return students.get(index);
	}

}
