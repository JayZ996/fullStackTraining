package insp;
import java.util.Scanner;
public class Switch_Case {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a choice");
		int i= scan.nextInt();
		
		
		switch (i) {
		
		case 1:{
			System.out.println("Option1");
			break;}
			
		case 2:{
			System.out.println("Option2");
			break;
		}
			
		case 3:{
			System.out.println("Option3");
			break;
		}
		
		default:{
			System.out.println("Wrong input");
			}
		
		
	}
	
}
}
