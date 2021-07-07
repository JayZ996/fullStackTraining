package labwork;
import java.util.Scanner;
public class SquareArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side");
		double side = scan.nextDouble();
		
		double area = side*side;
		System.out.println("The area of your square is "+area);
	}
}
