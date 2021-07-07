package inspiron;

public class TypeCasting {
	public static void main(String[] args) {
		byte b=10;
		
		int i=b; // will accept - automatic type promotion
		
		//byte c = i; //will not accept - because lower type cannot be put in higher
		
		byte d = (byte)i; // Type casting makes it possible to store compatible types.
		
		byte x=10;
		byte y = 20;
		
		//byte product= x*y; 
		/* Error is thrown because when two bytes are used in a 
		arthmetic operation, the result will be integer*/
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(i);
		System.out.println(b);
		System.out.println(d);
	}
}
