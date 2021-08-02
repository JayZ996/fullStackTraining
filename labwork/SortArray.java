package week3;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take input from user
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int temp = 0;
		System.out.println("Enter " + n + " elements into the array");
		int array[] = new int[n];
		// initialize array
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// display elements of array
		System.out.println("Before SORT \n");
		for (int value : array) {
			System.out.println(value + " ");
		}

		// sorting in ascending order
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println();
		// Displaying elements of array after sorting
		System.out.println("ASCENDING sort");
		for (int value : array) {
			System.out.println(value + "");
		}

		System.out.println("\n");
		// sorting in descending order
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println();
		// Displaying elements of array after sorting
		System.out.println("DESCENDING sort");
		for (int value : array) {
			System.out.println(value + "");
		}

		sc.close();
	}
}
