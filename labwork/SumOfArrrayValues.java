package labwork;
import java.util.Scanner;
public class SumOfArrrayValues {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int array[]=new int[5];
	int sum = 0;
	System.out.println("Enter "+array.length+" array values");
	
	for(int i =0;i<array.length;i++) {
		array[i]=scan.nextInt();
		
		sum+=array[i];
		
	}
	scan.close();
	System.out.println("sum is "+sum);
}
}
