package cg.lesson2demo;
import java.util.Scanner;
public class ComparisonProgram {

	public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a number");
	int a = num.nextInt();
	if(a>=0) {
		System.out.println("Number is positive");}
	
		else {
			System.out.println("Number is Negetive");
	}
	num.close();
		
	}

}
