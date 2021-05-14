package cg.JavaStringMethods;

public class StringIntern {
	
	public static void main(String args[]){  
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference variables are pointing to different instance  
		System.out.println(s2==s3);//true because reference variables are pointing to same instance  
		
		
		
		
		
		
		
		String ss1 = "Javatpoint";  
        String ss2 = ss1.intern();  
        String ss3 = new String("Javatpoint");  
        String ss4 = ss3.intern();          
        System.out.println(ss1==ss2); // True  
        System.out.println(ss1==ss3); // False  
        System.out.println(ss1==ss4); // True       
        System.out.println(ss2==ss3); // False  
        System.out.println(ss2==ss4); // True        
        System.out.println(ss3==ss4); // False
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	

}
