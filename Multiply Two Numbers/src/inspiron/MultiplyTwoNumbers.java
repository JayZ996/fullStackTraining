package inspiron;
import java.util.Scanner;
public class MultiplyTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int first=scan.nextInt();
		
		System.out.println("Enter the second number");
		int second=scan.nextInt();
		
		int product= first*second;
		
		System.out.println("The product of the two numbers is "+product);
		
		
	}

}
