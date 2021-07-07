package inspiron;
import java.util.Scanner;
public class PrintASCIIValue {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a char");
		char ch = scan.next().charAt(0); 
		
		//char ch='H';
		int ascii=ch;
		
		int castAscii= (int) ch;
		
		//DeSystem.out.println("The ASCII value of " +ch +" is "+ascii);
		System.out.println("The ASCII value of " +ch +" is "+castAscii);
	}

}
