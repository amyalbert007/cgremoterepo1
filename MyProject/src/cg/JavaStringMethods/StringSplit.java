package cg.JavaStringMethods;

public class StringSplit {
	public static void main(String args[]){  
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		
		
		
		
		
		String ss1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:ss1.split("\\s",0)){  
		System.out.println(w);  
		} 
		
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		} 
		
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",3)){  
		System.out.println(w);  
		
		}
		
		
		
		
		
		
		
		
		String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("a", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);
		
		
		
		
		
		
		}
	
	
	
	
	

}
