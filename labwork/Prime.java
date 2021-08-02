package week3;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether prime or not");
		int number = scan.nextInt();
		boolean isPrime = true;
		scan.close();

		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
			}

		}

		if (number == 1)
			System.out.println(number + " is neither prime nor composite");

		else if (isPrime)
			System.out.println(number + " is a prime number");
		else
			System.out.println("NOT A PRIME NUMBER");
	}
}