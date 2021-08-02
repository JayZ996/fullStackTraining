package week3;

import java.util.Scanner;

public class AvgInSeparateMethod {

	static double calAvg(int a[], int n) {
		double sum = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int n;
		double avg = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers?");
		n = sc.nextInt();

		int a[] = new int[n];

		System.out.println(" Enter " + n + " numbers");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		avg = calAvg(a, n) / n; // avg = sum /n

		System.out.println("The average of the " + n + " numbers you added is " + avg);
		sc.close();
	}
}
