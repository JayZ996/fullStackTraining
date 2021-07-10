package labwork;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Choose from the following options:");
		System.out.println("1. International Flight Bookings");
		System.out.println("2. Domestic Flight Bookings");
		System.out.println("3. Speak to our advisor");
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1:{
			System.out.println("You've chosen International flight booking");
			break;
		}
		
		case 2:{
			System.out.println("You've chosen Domestic Flight Booking");
			break;
		}
		
		case 3:{
			System.out.println("You've chosen to speak to our advisor");
			break;
		}
		default:
			System.out.println("Wrong input");
		}
	}
}
