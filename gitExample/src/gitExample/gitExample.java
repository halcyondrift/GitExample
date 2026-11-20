package gitExample;

import java.util.Scanner;

public class gitExample {
	
	public static int add (int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static int subt (int a, int b) {
		int c = a-b;
		return c;
	}
	
	public static int mult (int a, int b) {
		int c = a*b;
		return c;
	}
	
	public static int div (int a, int b) {
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the first number.");
		int num1 = scan.nextInt();
		System.out.println("Please input the second number.");
		int num2 = scan.nextInt();
		System.out.println("Please input the code for the chosen operation:");
		System.out.println("0: Addition");
		System.out.println("1: Subtraction");
		System.out.println("2: Multiplication");
		System.out.println("3: Division");
		int code = scan.nextInt();
		if (code==0) {}
		else if (code==1) {
			System.out.println(subt(num1,num2));
		}
		else if (code==2) {
			System.out.println(mult(num1,num2));
		}
		else if (code==3) {}
		else {}
	}

}
