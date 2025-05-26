package c_student_application;

import java.util.Locale;
import java.util.Scanner;

import c_student_entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("\nName: ");
		student.name = sc.nextLine();
		System.out.print("Grades (3): ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("%nFINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
			else {
				System.out.println("PASS");
		}
		
		sc.close();
		
	}

}
