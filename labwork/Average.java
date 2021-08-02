package week3;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double sum = 0; // declare variables
		System.out.println("How many numbers do you want?");
		n = sc.nextInt();// ask user how many values they wanna input

		double array[] = new double[n]; //create an array
		System.out.println("Enter " + n + " Numbers");
		for (int i = 0; i < n; i++) { //loop n times to accept values
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) { //calculate sum of all values in array
			sum += array[i];
		}

		double avg = sum / n; //cal avg

		System.out.println("The average of the numbers is " + avg);
		sc.close();

	}
}
