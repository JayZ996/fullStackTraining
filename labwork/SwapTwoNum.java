package labwork;
import java.util.Scanner;
public class SwapTwoNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first");
		float first = scan.nextFloat();
		
		System.out.println("Enter second");
		float second = scan.nextFloat();
		
		System.out.println("==BEFORE SWAP VALUES==");
		System.out.println("First num = " +first);
		System.out.println("second num = " +second);
		
		float temp = first;
		first = second;
		second = temp;
		
		System.out.println("==after SWAP VALUES==");
		System.out.println("First num = " +first);
		System.out.println("second num = " +second);
		
	}
}
