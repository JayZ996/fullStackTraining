package labwork;
import java.util.Scanner;
public class NestedSwitchCase {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a choice");
		int choice= scan.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("choice 1");
			break;
		}
		
		case 2:{
			System.out.println("choice 2, select subchoice..");
			int subchoice = scan.nextInt();
			switch(subchoice) {
			case 1:{
				System.out.println("choice 2, subchoice 1..");
				break;
			}
			case 2:{
				System.out.println("Choice 2 subchoice 2");
				break;
				
			}
			}
		
		}
		
		
		}
	}
}
