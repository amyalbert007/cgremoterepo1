package cg.JavaStringMethods;
import java.util.Locale;
public class ToUpperCase {
	
	public static void main(String args[]){  
		String s1="hello string";  
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper); 
		
		
		String s = "hello string";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);//will print I with dot on upper side  
        System.out.println(english);
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
