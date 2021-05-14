package cg.collections;
import java.util.*;
public class HashSet1 {
	
	 public static void main(String args[]){ 
		 
		 
		 
		  //Creating HashSet and adding elements 
		 // the elements iterate in an unordered collection.
		    HashSet<String> set=new HashSet();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");  
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		           
		           
		           
		           
		           
		         //Creating HashSet and adding elements 
		           //we see that HashSet doesn't allow duplicate elements.
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Ravi");  
		           set1.add("Vijay");  
		           set1.add("Ravi");  
		           set1.add("Ajay");  
		           //Traversing elements  
		           Iterator<String> itr=set1.iterator();  
		           while(itr.hasNext()){  
		            System.out.println(itr.next());  
		           }
		           
		           
		           
		           HashSet<Integer> setd=new HashSet();  
		           setd.add(4);    
		           setd.add(2);    
		           setd.add(4);   
		           setd.add(1);  
		           setd.add(2);  
		           System.out.print(setd.size());
		           
		           
		           
		           
		           
		           
		 }
	 

}
