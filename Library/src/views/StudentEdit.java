package views;

import java.util.Scanner;
import controllers.StudentController;
import models.Student;

public class StudentEdit {
	
	private static Scanner sc = new Scanner(System.in);

	public static void render() {
		
	        System.out.println("\n" .repeat(15));
	        System.out.println("\n-- STUDENT EDIT --\n");
	        System.out.println("\nEnter CPF Student: ");
	        var cpf = (sc.next());

	        if(cpf == null) {
	            System.out.println("Student not found");
	        }
	        var oldStudent = StudentController.searchByCpf(cpf);
	        var newStudent = new Student();

	        System.out.println("\nFill the new values");

	        System.out.println("\nEnter Student Name: ");
	        newStudent.setName(sc.next());
	        System.out.println("\nEnter CPF Student: ");
	        newStudent.setCpf(sc.next());
	        System.out.println("\nEnter Student Address: ");
	        newStudent.setAddress(sc.next());

	        StudentController.edit(cpf, oldStudent, newStudent);

	        System.out.println("\nStudent successfully edited!!");

	   }
	
}
