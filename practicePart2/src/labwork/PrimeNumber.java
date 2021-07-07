package labwork;

public class PrimeNumber {
	public static void main(String[] args) {
		String primeNumbers = " ";
		
		for(int i=1;i<100;i++) {
			int counter = 0;
			for(int num=i;num>=1;num--) {
				if(i%num==0) {
					counter++;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + "\n ";
				//System.out.println(primeNumbers);
				
			}
		}
		System.out.println("Prime nos from 1 to 100");
		System.out.println(primeNumbers);
	}
}
