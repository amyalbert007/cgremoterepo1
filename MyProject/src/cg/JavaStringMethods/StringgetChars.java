package cg.JavaStringMethods;

public class StringgetChars {
	
	public static void main(String args[]){  
		 String str = new String("hello javatpoint how r u");  
		      char[] ch = new char[10];  
		      try{  
		         str.getChars(6, 16, ch, 0);  
		         System.out.println(ch);  
		      }catch(Exception ex){System.out.println(ex);}  
		      
		      
		      
		      String sstr = new String("Welcome to Javatpoint");  
		        char[] csh  = new char[20];  
		        try {  
		            sstr.getChars(1, 26, ch, 0);  
		            System.out.println(csh);  
		        } catch (Exception e) {  
		            System.out.println(e);  
		        }      
		      
		      
		      
		      
		      
		      
		      
		      
		}
	
	
	

}
