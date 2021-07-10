package labwork;
import java.util.Scanner;
public class CheckPrime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		boolean isPrime=true;
		int num = scan.nextInt();
		scan.close();
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(+num+" is Prime");
		else
			System.out.println(num+" is not Prime");
		
	}
}
