package week3;

public class Print2DArray {
	public static void main(String[] args) {
		final int[][] matrix = { { 1, 2, 3,4 }, { 5, 6,7,8 }, { 8, 9,10,11 } };
		for (int row[]:matrix) { // this equals to the row in our matrix.
			for (int x:row) { // this equals to the column in each row.
				System.out.print(x + " ");
			}
			System.out.println("\n"); // change line on console as row comes to end in the matrix.
		}
	}
}