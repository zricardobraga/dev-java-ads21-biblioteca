package views;

import java.util.Scanner;

import controllers.StudentController;
import models.Student;

public class FindStudentByCpf {
	
	private static Scanner sc = new Scanner(System.in);
	private static Student student;
	private static String cpfStudent;
	
	public static void render() {
		student = new Student();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH STUDENT --\n");
		System.out.println("\nEnter CPF Student: ");
		cpfStudent = sc.next();
		student = StudentController.searchByCpf(cpfStudent);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("Student not found");
		}
	}
}
