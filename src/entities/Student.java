package entities;

public class Student {

	public String name;
	public double firstTrimester;
	public double secondTrimester;
	public double thirdTrimester;
	public double media;
	public String situation;
	
	public double anualMedia() {
		media = firstTrimester + secondTrimester + thirdTrimester;
		return media;
	}
	
	public double missingPoints() {
		return 60.0 - media;
	}
	
	public void finalGrades() {
		if (media >= 60.0) {
			situation = "PASS";
			System.out.println("FINAL GRADE = " + String.format("%.2f", media));
			System.out.println(situation);
		} else {
			situation = "FAILED";
			System.out.println("FINAL GRADE = " + String.format("%.2f", media));
			System.out.println(situation);
			System.out.println("MISSING " + String.format("%.2f", missingPoints()) + " POINTS");
		}
	}
}
