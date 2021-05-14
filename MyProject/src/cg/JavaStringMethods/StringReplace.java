package cg.JavaStringMethods;

public class StringReplace {
	public static void main(String []args) {
		
		//Java String replace(char old, char new) method example
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);
		
		
		
		
		
	//Java String replace(CharSequence target, CharSequence replacement) method example
		String ss1="my name is khan my name is java";  
		String replaceStrings=ss1.replace("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceStrings);
		
		
		
		 String str = "oooooo-hhhh-oooooo";  
	        String rs = str.replace("h","s"); // Replace 'h' with 's'  
	        System.out.println(rs);  
	        rs = rs.replace("s","h"); // Replace 's' with 'h'  
	        System.out.println(rs); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
