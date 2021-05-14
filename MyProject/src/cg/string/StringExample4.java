package cg.string;

public class StringExample4 {
	
	public static void main(String args[]){
		
		
		//1) String Concatenation by + (string concatenation) operator
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar 
		   
		   
		   
		   
		   String s1=50+30+"Sachin"+40+(40+30);  
		   System.out.println(s1);
		   
		   //Note: After a string literal, all the + will be treated as string concatenation operator.
		   String ss1=50+30+"Sachin"+40+40+30;  
		   System.out.println(ss1);
		   
		   
		   
		   //2) String Concatenation by concat() method
		   String sss1="Sachin ";  
		   String sss2="Tendulkar";  
		   String sss3=sss1.concat(sss2);  
		   System.out.println(sss3);//Sachin Tendulkar
	}
}
