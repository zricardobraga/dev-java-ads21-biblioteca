package views;

import java.util.Scanner;

import controllers.StudentController;
import models.Student;

public class StudentDelete {
	
	private static Scanner sc = new Scanner(System.in);
	private static Student student;
	private static String cpfStudent;
	
	public static void render() {
		System.out.println("\n".repeat(10));
		student = new Student();
		System.out.println("\n -- DELETE STUDENT --");
		System.out.println("\nEnter Student CPF: ");
		cpfStudent = sc.next();
		if(StudentController.delete(cpfStudent, student)) {
			System.out.println("Student successfully deleted");
		}
	}
}
