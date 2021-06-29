package views;

import java.util.Scanner;

import controllers.StudentController;

public class StudentDelete {

	    private static Scanner sc = new Scanner(System.in);

	    public static void render() {

	        System.out.println("\n" .repeat(15));
	        System.out.println("\n-- DELETE STUDENT --\n");
	        System.out.println("\nEnter Student CPF: ");
	        var cpf = (sc.next());

	        var studantFound = StudentController.searchByCpf(cpf);

	        if(studantFound == null) {
	            System.out.println("Studant not found!");
	        }

	        StudentController.delete(cpf, studantFound);
	        System.out.println("Studant successfully deleted!");

	    }
	}
