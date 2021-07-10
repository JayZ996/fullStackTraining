package labwork;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		double r = scan.nextDouble();
		double area = Math.PI*r*r;
		System.out.println("The area of your circle is "+area);
	}
}
