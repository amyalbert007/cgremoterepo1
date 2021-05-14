package cg.JavaStringMethods;
import java.util.*;
public class EqualsMethod {
	
	
	public static void main(String args[]){  
		String s1="javatpoint";  
		String s2="javatpoint"; 
		String s5="Javatpoint";
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		System.out.println(s1.equals(s5));
		
		
		
		
		
		String ss1 = "javatpoint";    
        String ss2 = "javatpoint";    
        String ss3 = "Javatpoint";  
        System.out.println(ss1.equals(ss2)); // True because content is same    
        if (ss1.equals(ss3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");
		
		
		
		
        String str1 = "Mukesh";  
        ArrayList<String> list = new ArrayList<>();  
        list.add("Ravi");   
        list.add("Mukesh");  
        list.add("Ramesh");  
        list.add("Ajay");  
        for (String str : list) {  
            if (str.equals(str1)) {  
                System.out.println("Mukesh is present");  
            }  
        }  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
