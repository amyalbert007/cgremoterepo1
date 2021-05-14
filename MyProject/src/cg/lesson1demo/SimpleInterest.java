package cg.lesson1demo;
import java.util.*;
public class SimpleInterest {
	public static void main(String []args) {
		float p , q , r , si ;
	 Scanner num=new Scanner(System.in);
	 System.out.println("Enter p ,q ,r");
	 p=num.nextFloat();
	 q=num.nextFloat();
	 r=num.nextFloat();
	 si = (p*q*r)/100;
	 System.out.println("simple interest is "+si);
	 num.close();
		
	}

}
