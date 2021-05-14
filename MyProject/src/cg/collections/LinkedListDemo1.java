package cg.collections;
import java.util.*;
public class LinkedListDemo1 {
	
	public static void main(String args[]){  
		
		
	
		  LinkedList<String> al=new LinkedList<String>();  
		  
		  
		  
		  System.out.println("Initial list of elements: "+al);
		  
		  
		  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  
		  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }
		   
		  
		  
		   System.out.println("After invoking add(E e) method: "+al); 
		   
		   
		   
		   
           //Adding an element at the specific position  
           al.add(1, "Gaurav");  
           System.out.println("After invoking add(int index, E element) method: "+al);
           
           
           
           LinkedList<String> al2=new LinkedList<String>();  
           al2.add("Sonoo");  
           al2.add("Hanumat");  
           //Adding second list elements to the first list  
           al.addAll(al2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);
           
           
           
           LinkedList<String> al3=new LinkedList<String>();  
           al3.add("John");  
           al3.add("Rahul");  
           //Adding second list elements to the first list at specific position  
           al.addAll(1, al3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);
           
           
           
           
         //Adding an element at the first position  
           al.addFirst("Lokesh");  
           System.out.println("After invoking addFirst(E e) method: "+al);  
           //Adding an element at the last position  
           al.addLast("Harsh");  
           System.out.println("After invoking addLast(E e) method: "+al);
		  
		  
		  
         //Removing specific element from arraylist  
           al.remove("Vijay");  
           System.out.println("After invoking remove(object) method: "+al);
           
           
           
         //Removing element on the basis of specific position  
           al.remove(0);  
           System.out.println("After invoking remove(index) method: "+al);
           
           
           
           
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("AmyAlbert");  
           ll2.add("AnkurAmit");  
      // Adding new elements to arraylist  
           al.addAll(ll2);  
           System.out.println("Updated list : "+al);   
      //Removing all the new elements from arraylist  
           al.removeAll(ll2);  
           System.out.println("After invoking removeAll() method: "+al);
           
           
           
         //Removing first element from the list  
           al.removeFirst();  
           System.out.println("After invoking removeFirst() method: "+al);  
       //Removing last element from the list  
           al.removeLast();  
           System.out.println("After invoking removeLast() method: "+al);
           
           
           
           
         //Removing all the elements available in the list       
           al.clear();  
           System.out.println("After invoking clear() method: "+al);
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	

}
