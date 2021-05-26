package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = teclado.nextLine();
		System.out.println("First Trimester: ");
		student.firstTrimester = teclado.nextDouble();
		System.out.println("Second Trimester: ");
		student.secondTrimester = teclado.nextDouble();
		System.out.println("Third Trimester: ");
		student.thirdTrimester = teclado.nextDouble();
		
		System.out.println();
		student.anualMedia();
		student.finalGrades();
		
		teclado.close();
	}

}
