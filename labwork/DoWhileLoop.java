package labwork;
import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		
		do {
			System.out.println("The value of num is "+num);
			num++;
			//System.out.println("\n");
		} while(num<=100);
	}
}
