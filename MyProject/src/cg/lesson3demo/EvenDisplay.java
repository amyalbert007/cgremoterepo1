package cg.lesson3demo;
import java.util.Scanner;
public class EvenDisplay {
 public static void main(String []args) {
	 Scanner num=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int a = num.nextInt();
	 for(int i=0;i<=a;i++) {
		 if(i%2==0) {
			 System.out.print(" "+i);
		 }
	 }
	 num.close();
 }
}
