package cg.JavaStringMethods;

public class lastIndexOf {
	public static void main(String args[]){  
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  
		
		
		
		
		String str = "This is index of example";  
        int index = str.lastIndexOf('s',5);  
        System.out.println(index);
        
        
        
        
        
        String sstr = "This is last index of example";  
        int indexs = sstr.lastIndexOf("of");  
        System.out.println(indexs); 
		
		
		
		
		
		
        String str1 = "This is last index of example";  
        int index2 = str1.lastIndexOf("of", 25);  
        System.out.println(index2);  
        index2 = str.lastIndexOf("of", 10);  
        System.out.println(index2); // -1, if not found
		
		
		
		
		
		
		
		}
	
	
	
	

}
