package cg.lesson2demo;
import java.util.Scanner;
public class EvenOddDisplay {
	public static void main (String args[]){
	Scanner scan=new Scanner(System.in);
	//create a scanner object for input
	System.out.print("Enter the maximum number\n");
	int num=scan.nextInt();
	//print even number using for loop without if statements
	System.out.print("Even numbers are:");
	for(int i=0; i<=num; i+=2){
	System.out.print(i+" ");
	}
	//print odd number using for loop without if statements
	System.out.print("\n\nOdd numbers are:");
	for(int i=1; i<=num; i+=2){
	System.out.print(i+" ");
	}
	scan.close();
 }
}
