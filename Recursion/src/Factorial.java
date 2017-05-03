import java.util.Scanner;


public class Factorial {

	public static int factorial (int n) {
		int sum=1;
		for(int i=1; i<=n; i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your number: ");
		int number = scan.nextInt();

		System.out.println("Factorial of " + number + " is "+ factorial(number));

	}
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
}
