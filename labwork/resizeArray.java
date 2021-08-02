package week3;

import java.util.Arrays;

public class resizeArray {
	public static void main(String[] args) {
		int array[] = { 24, 63, 841, 4, 631, 3580 };
		System.out.println("Array before  " );
		for (int value : array) {
			System.out.println( value+"\n");
		}
		
		array = Arrays.copyOf(array, 11); //(arrayName,newArraySize)
		
		System.out.println("Array after resize");
		for(int value:array) {
			System.out.println(value+"\n");
		}
	}

}
