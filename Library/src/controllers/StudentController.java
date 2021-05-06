package controllers;

import java.util.ArrayList;

import models.Student;

public class StudentController {
	
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	public static boolean register(Student student) {
		for(Student studentRegister: students) {
			if(studentRegister.getCpf().equals(student.getCpf())) {
				return false;
			}
		}
		students.add(student);
		return true;
	}
	
	public static ArrayList<Student> list(){
		return students;
	}
	
	public static Student searchByCpf(String cpf) {
		for(Student registeredStudent: students) {
			if(registeredStudent.getCpf().equals(cpf)) {
				return registeredStudent;
			}
		}
		return null;
	} 
	
	public static boolean edit(String cpf, Student oldStudent, Student newStudent) {
		for(Student registeredStudent: students) {
			if(registeredStudent.getCpf().equals(cpf)) {
				var index = students.indexOf(oldStudent);
				students.set(index, newStudent);
				return true;
			}
		}
		return false;
	}
	
	public static boolean delete(String cpf, Student student) {
		for(Student registeredStudent: students) {
			if(registeredStudent.getCpf().equals(cpf)) {
				students.remove(student);
				return true;
			}
		}
		return false;
	}
}
