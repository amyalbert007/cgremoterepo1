package cg.JavaStringMethods;

public class CompareTo {
	
	public static void main(String args[]){  
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
		
		
		
		
		
		
		String ss1="hello";  
		String ss2="";  
		String ss3="me";  
		System.out.println(ss1.compareTo(ss2));  
		System.out.println(ss2.compareTo(ss3));
		String ss5 = "Hello";
		System.out.println(ss1.compareTo(ss5));
		
		
		}

}
