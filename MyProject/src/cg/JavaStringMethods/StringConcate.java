package cg.JavaStringMethods;

public class StringConcate {
	
	
	public static void main(String args[]){  
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  
		
		
		
		
		
		
		
		
		
		String str1 = "Hello";  
        String str2 = "Javatpoint";  
        String str3 = "Reader";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);
		
		
		
		
		
		
        String sstr1 = "Hello";  
        String sstr2 = "Javatpoint";  
        String sstr3 = "Reader";  
        // Concatenating Space among strings  
        String sstr4 = sstr1.concat(" ").concat(sstr2).concat(" ").concat(sstr3);  
        System.out.println(sstr4);         
        // Concatenating Special Chars        
        String sstr5 = sstr1.concat("!!!");  
        System.out.println(sstr5);         
        String sstr6 = sstr1.concat("@").concat(sstr2);  
        System.out.println(sstr6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
