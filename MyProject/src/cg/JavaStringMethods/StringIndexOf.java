package cg.JavaStringMethods;

public class StringIndexOf {
	
	
	public static void main(String args[]){  
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3  
		
		
		
		
		
		
		String ss1 = "This is indexOf method";         
        // Passing Substring    
        int index = ss1.indexOf("method"); //Returns the index of this substring  
        System.out.println("index of substring "+index); 
		
		
		
		
		
		
		
		
        String s11 = "This is indexOf method";         
        // Passing substring and index  
        int index11 = s11.indexOf("method", 10); //Returns the index of this substring  
        System.out.println("index of substring "+index11);  
        index11 = s11.indexOf("method", 20); // It returns -1 if substring does not found  
        System.out.println("index of substring "+index11);
		
		
		
		
        String as1 = "This is indexOf method";         
        // Passing char and index from  
        int aindex = as1.indexOf('e', 12); //Returns the index of this char  
        System.out.println("index of char "+aindex);
		
		
		
		
		
		
		
		
		
		}

}
