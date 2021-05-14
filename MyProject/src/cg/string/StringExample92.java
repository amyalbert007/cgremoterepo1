package cg.string;

public class StringExample92 {
	
	//Java Program to demonstrate the use of StringBuffer class.  
	  
	    public static void main(String[] args){  
	        StringBuffer buffer=new StringBuffer("hello");  
	        buffer.append("java");  
	        System.out.println(buffer);  
	        
	        
	        
	        
	        
	        
	      //Java Program to demonstrate the use of StringBuilder class.  
	    
	                StringBuilder builder=new StringBuilder("hello");  
	                builder.append("java");  
	                System.out.println(builder);  
	        
	        
	        
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	              //Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
	               
	                        long startTime = System.currentTimeMillis();  
	                        StringBuffer sb = new StringBuffer("Java");  
	                        for (int i=0; i<10000; i++){  
	                            sb.append("Tpoint");  
	                        }  
	                        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	                        startTime = System.currentTimeMillis();  
	                        StringBuilder sb2 = new StringBuilder("Java");  
	                        for (int i=0; i<10000; i++){  
	                            sb2.append("Tpoint");  
	                        }  
	                        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	        
	        
	        
	        
	        
	     
	}
	
	

}
