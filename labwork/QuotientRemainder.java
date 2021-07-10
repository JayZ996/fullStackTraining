package labwork;
import java.util.Scanner;
public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the dividend");
		int dividend=scan.nextInt(); //user input is recorded
		
		System.out.println("Enter the divisor");
		int divisor=scan.nextInt(); //user input is recorded
		
		int quotient = dividend/divisor; 
		int remainder = dividend%divisor; 
		
		System.out.println("Quotient is " +quotient);
		System.out.println("Remainder is " +remainder);
	}
}
