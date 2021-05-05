package views;

import controllers.StudentController;
import models.Student;

public class ListStudent {
	
	public static void render() {
		System.out.println("\n-- LIST STUDENT --\n");
		for(Student registeredStudent : StudentController.list()) {
			System.out.println(registeredStudent);
		}
	}

}
