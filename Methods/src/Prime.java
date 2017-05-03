import java.util.Scanner;


public class Prime {

	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your number: ");
		int number = scan.nextInt();

		if(isPrime(number)==true) {
			System.out.println("This number is prime.");}
		else System.out.println("This number is not prime.");
		
		//todo: write a method which tells you if a given number is a prime or not
		
	}
	
}
