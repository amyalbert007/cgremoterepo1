package cg.lesson1demo;
import java.util.Scanner;
public class demo2 {
	public static void main(String []args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);
        kb.close();
	}

}
