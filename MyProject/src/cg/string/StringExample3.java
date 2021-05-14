package cg.string;

public class StringExample3 {
	
	public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   
		   
		   
		   
		   String s5="Sachin";  
		   String s6="SACHIN";  
		  
		   System.out.println(s5.equals(s6));//false  
		   System.out.println(s5.equalsIgnoreCase(s6));//true
		   
		   
		   
		   String s8=new String("Sachin");
		   String s7=new String("Sachin");
		   //String compare by == operator
		   System.out.println(s1==s2);//true (because both refer to same instance)
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
		   System.out.println(s3==s8);
		   
		   
		   
		   String ss1="Sachin";  
		   String ss2="Sachin";  
		   String ss3="Ratandfdfsdfsfe3";  
		   System.out.println(ss1.compareTo(ss2));//0  
		   System.out.println(ss1.compareTo(ss3));//1(because s1>s3)  
		   System.out.println(ss3.compareTo(ss1));//-1(because s3 < s1 )  
		  
		   
		   
		 }  

}
