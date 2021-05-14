package cg.string;

public class StringExample6 {
	public static void main(String []args) {
		
		
		String s="Sachin";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)
		
		
		
		
		String s1="  Sachin  ";  
		System.out.println(s1);//  Sachin    
		System.out.println(s1.trim());//Sachin
		
		
		
		String s2="Sachin";  
		 System.out.println(s2.startsWith("Sa"));//true  
		 System.out.println(s2.endsWith("n"));//true
		 
		 
		 
		 String s3="Sachin";  
		 System.out.println(s3.charAt(0));//S  
		 System.out.println(s3.charAt(3));//h
		 
		 
		 
		 String s4="Sachin";  
		 System.out.println(s4.length());//6
		 
		 
		 
		 String s7=new String("Sachsdfdin");  
		 String s6=s7.intern();  
		 System.out.println(s6);//Sachin
		
		 
		 String s8=new String("rdhyftt");  
		 String s9=s8.intern();  
		 System.out.println(s9);
		 
		 
		 
		 int a=10;  
		 String ss=String.valueOf(a);  
		 System.out.println(ss+10+10);
		 
		 
		 String ss1="Java is a programming language. Java is a platform. Java is an Island.";    
		 String replaceString=ss1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		 System.out.println(replaceString);
		 
		 
		 
		 
		
	}

}
