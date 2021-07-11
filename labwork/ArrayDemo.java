package labwork;

public class ArrayDemo {
public static void main(String[] args) {
	int FirstArray[]={98,36,54,85,36,4,8};
	int sum = 0;
	int sum2=0;
	int SecondArray[]=new int[3];
	
	SecondArray[0]=95;
	SecondArray[1]=5;
	
	for(int first: FirstArray) {
		sum+=first; System.out.println(first);   
		}
	System.out.println("\n");
	System.out.println("The sum of all numbers in the array is "+sum);
	System.out.println("\n");
	System.out.println("\n");
	
	
	for(int second:SecondArray) { System.out.println(second); sum2+=second; }
	System.out.println("\n");
	System.out.println("The sum of all numbers in the secondArray is "+sum2);
	
	
}
}
