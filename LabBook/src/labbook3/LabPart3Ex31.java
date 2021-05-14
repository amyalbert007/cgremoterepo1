package labbook3;

import java.util.Scanner;

public class LabPart3Ex31 {
	static void myMethod6() {
		Scanner string=new Scanner(System.in);
		System.out.println("Enter a string");
		String str = string.nextLine();
		System.out.println(str.concat(str));
		
		
		
	}
	static void myMethod() {
		String str4 = "Amit";
		str4 = str4.concat(str4);
		System.out.println(str4);
		
	}
	
	
	
	
	static void myMethod1() {
		Scanner string=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = string.nextLine();
		String alphabetS = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder(str1);

	    for(int i=0; i<str1.length(); i++){
	        char currChar = str1.charAt(i);

	        int idx = alphabetS.indexOf(currChar);
	        if (idx != -1) 
	        if (i%2==0)

	            {
	        sb.setCharAt(i, '#');
	        
	        }

	    }
	    System.out.println(sb);

	}
	static void myMethod16() {
		Scanner string=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = string.nextLine();
		//String str1="Great Power";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
               
            if(i%2==1) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            
        }    
        System.out.println("String after case conversion : " + newStr);    
    }
	
	
	
	
	
	
	
	
	
	public static void main(String []args) {
		myMethod6();
		myMethod1();
		myMethod16();
	}

}
