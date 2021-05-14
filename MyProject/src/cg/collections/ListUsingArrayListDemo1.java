package cg.collections;
import java.util.*;
public class ListUsingArrayListDemo1 {
	
	public static void main(String args[]){  
		 //Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes"); 
		 
		 
		 
		 
		 //Iterating the List element using for-each loop  
		 for(String fruit:list)  
		  System.out.println(fruit);  
		 
		 
		 
		//Creating Array  
		 String[] array={"Java","Python","PHP","C++"};  
		 System.out.println("Printing Array: "+Arrays.toString(array));  
		 //Converting Array to List  
		 List<String> list1=new ArrayList<String>();  
		 for(String lang:array){  
		 list1.add(lang);  
		 }  
		 System.out.println("Printing List: "+list1);  
		   
		  
		  
		 
		 
		 List<String> fruitList = new ArrayList<>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry");    
		 //Converting ArrayList to Array  
		 String[] array1 = fruitList.toArray(new String[fruitList.size()]);    
		 System.out.println("Printing Array1: "+Arrays.toString(array1));  
		 System.out.println("Printing ArrayList: "+fruitList);  
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 //The get() method returns the element at the given index, whereas the set() method changes or replaces the element.
		//Creating a List  
		 List<String> list2=new ArrayList<String>();  
		 //Adding elements in the List  
		 list2.add("Mango");  
		 list2.add("Apple");  
		 list2.add("Banana");  
		 list2.add("Grapes");  
		 //accessing the element    
		 System.out.println("Returning element: "+list2.get(1));//it will return the 2nd element, because index starts from 0  
		 //changing the element  
		 list2.set(1,"Dates");  
		 //Iterating the List element using for-each loop  
		 for(String fruit:list2)  
		  System.out.println(fruit);  
		  
		 
		 
		 
		 
		 
		 //Sorting the list  
		  Collections.sort(list2);  
		   //Traversing list through the for-each loop  
		  for(String fruit:list2)  
		    System.out.println(fruit);
		  
		  
		  
		  
		  
		  List<String> al=new ArrayList<String>();    
	        al.add("Amit");    
	        al.add("Vijay");    
	        al.add("Kumar");    
	        al.add(1,"Sachin");    
	        ListIterator<String> itr=al.listIterator();    
	        System.out.println("Traversing elements in forward direction");    
	        while(itr.hasNext()){    
	              
	        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
	        }    
	        System.out.println("Traversing elements in backward direction");    
	        while(itr.hasPrevious()){    
	          
	        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
	        }    
		 
		}  

}
