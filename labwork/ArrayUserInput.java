package week3;

import java.util.Scanner;

public class ArrayUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = sc.nextInt();
		System.out.println("Enter cols");
		int col = sc.nextInt();
		int enteredValue = 1;
		int array[][] = new int[row][col];
		// System.out.println("\nEnter " + n + " values \n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = enteredValue;
				enteredValue++;
			}
		}

		for (int rows[] : array) {
			for (int x : rows) {
				System.out.print(x + "\t ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
