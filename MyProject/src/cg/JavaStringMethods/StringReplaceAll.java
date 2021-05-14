package cg.JavaStringMethods;

public class StringReplaceAll {
	
	public static void main(String args[]){  
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		
		
		
		String ss1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceStrings=ss1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceStrings); 
		
		
		String s11="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString1=s11.replaceAll("\\s","");  
		System.out.println(replaceString1);
		
		
		
		
		
		
		
		}

}
