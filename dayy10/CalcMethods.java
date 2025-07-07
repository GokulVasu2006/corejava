package dayy10;

import java.util.Scanner;

public class CalcMethods{
	int a;;
	int b;
	public void add(int a,int b) {
		System.out.println("addition :"+((a+b)));
	}
	public void sub(int a,int b) {
		System.out.println("subraction :"+((a-b)));
	}
	public void mul(int a,int b) {
		System.out.println("multiplication :"+((a*b)));
	}
	public void div(int a,int b) {
		System.out.println("division :"+((a/b)));
	}
	public void mod(int a,int b) {
		System.out.println("modulus :"+((a%b)));
	}
	public static void main(String[] args) {
		CalcMethods cal=new CalcMethods();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		cal.add(a, b);
		cal.sub(a, b);
		cal.div(a, b);
		cal.mul(a, b);
		cal.mod(a, b);
	}
	
}