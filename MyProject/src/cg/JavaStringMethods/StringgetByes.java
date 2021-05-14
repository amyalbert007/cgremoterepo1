package cg.JavaStringMethods;

public class StringgetByes {
	
	
	
	public static void main(String args[]){  
		String s1="ABCDEFG";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}  
		
		
		String ss1 = "ABCDEFG";  
        byte[] barrs = ss1.getBytes();  
        for(int i=0;i<barr.length;i++){  
            System.out.println(barrs[i]);  
        }  
        // Getting string back   
        String s2 = new String(barrs);  
        System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
