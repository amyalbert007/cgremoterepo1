package labbook3;
import java.util.Scanner;

public class LabPart3Ex1 {
	static void myMethod1() {
		Scanner string=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = string.nextLine();
		//String str1="Great Power";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
               
            if(i%2==0) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            
        }    
        System.out.println("String after case conversion : " + newStr);    
    }
		
		
	public static void main(String []args) {
		myMethod1();
	}
	
	

}
