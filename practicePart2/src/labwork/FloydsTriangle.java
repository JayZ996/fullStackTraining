package labwork;
import java.util.Scanner;
public class FloydsTriangle {
	public static void main(String[] args) 
	 { 
	 int rows, number = 1, counter, j; 
	 //To get the user's input
	 Scanner input = new Scanner(System.in); 
	 System.out.println("Enter the number of rows for floyd's triangle:"); 
	
	 //Copying user input into an integer variable named rows
	 rows = input.nextInt(); 
	 
	 if(rows>100)
		 System.out.println("Enter a value less than 100");
	 else {
	 System.out.println("Floyd's triangle"); 
	 System.out.println("****************"); 
	 for ( counter = 1 ; counter <= rows ; counter++ ) 
	 { 
	 for ( j = 1 ; j <= counter ; j++ ) 
	 { 
	 System.out.print(number+" "); 
	 //Incrementing the number value
	number++; 
	 } 
	 //For new line
	 System.out.println(); 
	 } 
	 }}
}
