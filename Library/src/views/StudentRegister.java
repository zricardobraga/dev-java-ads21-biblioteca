package views;

import java.util.Scanner;

import controllers.StudentController;
import models.Student;

public class StudentRegister {
	private static Scanner sc = new Scanner(System.in);
	private static Student student;
	
	public static void render() {
		System.out.println("\n".repeat(10));
		student = new Student();
		System.out.println("\n -- REGISTER STUDENTS --");
		System.out.println("\nEnter Student Name: ");
		student.setName(sc.nextLine());
		System.out.println("\nEnter Student Address: ");
		student.setAddress(sc.nextLine());
		System.out.println("\nEnter Student CPF: ");
		student.setCpf(sc.next());
		
		if(StudentController.register(student)) {
			System.out.println("Student successfully registered!");
		} else {
			System.out.println("Student already registered! Enter a new CPF!");
		}
	}
}	
	
