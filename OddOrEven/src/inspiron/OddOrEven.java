package inspiron;
import java.util.Scanner;
public class OddOrEven {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scan.nextInt(); //User input is stored in num
		
		if(number%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
}
