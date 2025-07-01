package day6;

import java.util.Scanner;

public class TrafficFine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle type 2 or 4 wheeler:");
		int key=sc.nextInt();
		switch(key) {
		case 2:
			System.out.println("enter your speed:");
			int a=sc.nextInt();
			System.out.println("enter speed limit:");
			int b=sc.nextInt();
			int c= a-b;
			if(c>1 && c<=10) {
				System.out.println("Fine amount 500");
			}else if(c>=10 && c<=20) {
				System.out.println("Fine amount 1000");
			}else if(c>=20) {
				System.out.println("Fine amount 2000");
			}
		case 4:
			System.out.println("enter your speed:");
			int d=sc.nextInt();
			System.out.println("enter speed limit:");
			int e=sc.nextInt();
			int f= d-e;
			if(f>1 && f<=10) {
				System.out.println("Fine amount1000");
			}else if(f>=10 && f<=20) {
				System.out.println("Fine amount 2000");
			}else if(f>=20) {
				System.out.println("Fine amount 3000");
			}
		default:
			System.out.println("drive safe");
		}
		
	}

}
