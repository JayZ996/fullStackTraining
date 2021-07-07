package labwork;
import java.util.Scanner;
public class ReverseANumber {
	public static void main(String[] args) {
		int reversenum =0; 
		 System.out.println("Enter a number: "); 
		 
		 Scanner in = new Scanner(System.in); 
		 
		int num = in.nextInt(); 
		//While Loop: Logic to find out the reverse number
		while( num != 0 ) 
		 { 
		 reversenum *= 10; 
		reversenum += num%10; 
		 num /=10; 
		 System.out.println(reversenum);
		 } 
		 System.out.println("Reverse of input number is: "+reversenum); 
	}
}
