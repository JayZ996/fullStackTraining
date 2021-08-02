package week3;

import java.util.Scanner;

public class ArrayUserInputProgressive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = sc.nextInt();

		int matrixVal = 1;
		int array[][] = new int[row][row];
		for (int i = 0; i < row; i++) {

			for (int j = 0; j <= i; j++) {

				array[i][j] = matrixVal;
				matrixVal++;
			}
		}

		for (int rows[] : array) {
			for (int x : rows) {
				if (x != 0) {
					System.out.print(x + "\t");
				}
			}
			System.out.println("");
		}
		sc.close();

	}
}
