package ExceptionHandlingDemo;

public class TestFinallyBlock2 {
	
	
	//Let's see the java finally example where exception occurs and not handled.
	public static void main(String args[]){  
		  try{  
		   int data=25/0;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println(e);}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }
	
	
	
	
	

}
