package dayy10;

import java.util.Scanner;

public class EmployeeOops {
	int id;
	String name;
	long number;
	float salary;
	public static void main(String[] args) {
		EmployeeOops emp1=new EmployeeOops();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details of emp 1: ");
		emp1.id=sc.nextInt();
		sc.nextLine();
		emp1.name=sc.nextLine();
		emp1.number=sc.nextLong();
		emp1.salary=sc.nextFloat();
		System.out.println("emp 1 id:"+emp1.id);
		System.out.println("emp 1 name:"+emp1.name);
		System.out.println("emp 1 number:"+emp1.number);
		System.out.println("emp 1 salary:"+emp1.salary);
		System.out.println();
		EmployeeOops emp2=new EmployeeOops();
		emp2.id=2;
		emp2.name="vishal";
		emp2.number=9843292192l;
		emp2.salary=6000f;
		System.out.println("emp 2 id:"+emp2.id);
		System.out.println("emp 2 name:"+emp2.name);
		System.out.println("emp 2 number:"+emp2.number);
		System.out.println("emp 2 salary:"+emp2.salary);
		System.out.println();
		EmployeeOops emp3=new EmployeeOops();
		emp3.id=3;
		emp3.name="vignesh";
		emp3.number=9843292192l;
		emp3.salary=7000f;
		System.out.println("emp 3 id:"+emp3.id);
		System.out.println("emp 3 name:"+emp3.name);
		System.out.println("emp 3 number:"+emp3.number);
		System.out.println("emp 3 salary:"+emp3.salary);
		System.out.println();
		EmployeeOops emp4=new EmployeeOops();
		emp4.id=4;
		emp4.name="pradeep";
		emp4.number=9843292192l;
		emp4.salary=8000f;
		System.out.println("emp 4 id:"+emp4.id);
		System.out.println("emp 4 name:"+emp4.name);
		System.out.println("emp 4 number:"+emp4.number);
		System.out.println("emp 4 salary:"+emp4.salary);
		System.out.println();
	
	
	}
	
	

}
