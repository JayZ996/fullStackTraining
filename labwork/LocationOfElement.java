package week3;

import java.util.Scanner;

public class LocationOfElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take input from user
		System.out.println("Enter array size");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " elements into the array");
		int array[] = new int[n];
		// initialize array
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// display elements of array
		System.out.println("\n \n");
		for (int value : array) {
			System.out.println(value + " ");
		}

		System.out.println("\nEnter the element you wish to know the position of which ");
		int element = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				System.out.println(element + " is at position " + ++i);
			} 
			else {System.out.println("NOT FOUND");break;}
			

		}
		sc.close();
	}
}
