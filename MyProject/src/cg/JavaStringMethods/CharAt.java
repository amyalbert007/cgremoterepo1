package cg.JavaStringMethods;

public class CharAt {
	
	public static void main(String []args) {
		
		
		
		String s1 = "amyalbert007";
		char ch1 = s1.charAt(1);
		System.out.println(ch1);
		
		
		/*char ch2 = s1.charAt(17);
		System.out.println(ch2);*/
		
		
		String str = "Welcome to Javatpoint portal";      
	    int strLength = str.length();      
	    // Fetching first character  
	    System.out.println("Character at 0 index is: "+ str.charAt(0));      
	    // The last Character is present at the string length-1 index  
	    System.out.println("Character at last index is: "+ str.charAt(strLength-1));
		
	    
	    
	    
	    String str1 = "Welcome to Javatpoint portal";          
        for (int i=0; i<=str1.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str1.charAt(i));  
            }  
        } 
        
        
        
        
        
        String str2 = "Welcome to Javatpoint portal";  
        int count = 0;  
        for (int i=0; i<=str2.length()-1; i++) {  
            if(str2.charAt(i) == 't') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);   
		
	}

}
