package day5;


public class TypeConversion {
	public static void main(String[] args) {
		System.out.println("Type Casting \n Implicit Casting");
		//byte to shot conversion
		byte a =8;
		short b=a;
		System.out.println("byte to short is:"+b);
		//short to int
		short c=20000;
		int d=c;
		System.out.println("short to int :"+d);
		//int to long
		int e=345566;
		long f=e;
		System.out.println("int to long is :"+f);
		//char to int
		char h='A';
		int i=h;
		System.out.println("char to int is:"+i);
		System.out.println("..................................");
		System.out.println("Explicit casting");
		//long to int 
		long j=456789653;
		int k=(int)j;
		System.out.println("long to int is:"+k);
		//int to short 
		int l=345667;
		short m=(short)l;
		System.out.println("int to short is :"+m);
		//byte to short
		byte n=33;
		short o=(short)n;
		System.out.println("byte to short is:"+o);
		//char to int
		char p='F';
		int q=(int)p;
		System.out.println("char to int  is:"+q);
		
		
		
		
	}

}
