package labwork;
import java.util.Scanner;
public class TraingleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base and height, respectively");
		double b = scan.nextDouble();
		double h = scan.nextDouble();
		double area = (b*h)/2;
		System.out.println("The area of your traingle is "+area);
	}
}
