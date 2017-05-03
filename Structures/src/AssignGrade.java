import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the score:");
		double score =  scan.nextDouble();

		System.out.print("Your grade is ");

		if(score<0.0 || score>100.0) {
			System.out.print(" not calculable ");
		}
		else if(score< 50.0) {
			System.out.print("5.0 ");
		}
		else if(score <= 55.0) {
			System.out.print(" 4.0 ");
		}
		else if(score <= 60.0) {
			System.out.print(" 3.7 ");
		}
		else if(score <= 65.0) {
			System.out.print(" 3.3 ");
		}
		else if(score <= 70.0) {
			System.out.print(" 3.0 ");
		}
		else if(score <= 75.0) {
			System.out.print(" 2.7 ");
		}
		else if(score <= 80.0) {
			System.out.print(" 2.3 ");
		}
		else if(score <= 85.0) {
			System.out.print(" 2.0 ");
		}
		else if(score <= 90.0) {
			System.out.print(" 1.7 ");
		}
		else if(score <= 95.0) {
			System.out.print(" 1.3 ");
		}
		else {
			System.out.print(" 1.0 ");
		}

		System.out.println();

		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}
