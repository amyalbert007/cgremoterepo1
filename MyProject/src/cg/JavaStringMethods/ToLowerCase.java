package cg.JavaStringMethods;
import java.util.Locale;
public class ToLowerCase {public static void main(String args[]){  
	String s1="JAVATPOINT HELLO stRIng";  
	String s1lower=s1.toLowerCase();  
	System.out.println(s1lower);  
	
	
	String s = "JAVATPOINT HELLO stRIng";    
    String eng = s.toLowerCase(Locale.ENGLISH);  
    System.out.println(eng);  
    String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot  
    System.out.println(turkish);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
