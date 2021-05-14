package cg.collections;
import java.util.*;
public class ListUsingAddBooks{
	
	int id;  
	String name,author,publisher;  
	int quantity;  
	public ListUsingAddBooks(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}     
	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<ListUsingAddBooks> list=new ArrayList<ListUsingAddBooks>();  
	    //Creating Books  
	    ListUsingAddBooks b1=new ListUsingAddBooks(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    ListUsingAddBooks b2=new ListUsingAddBooks(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
	    ListUsingAddBooks b3=new ListUsingAddBooks(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(ListUsingAddBooks b:list){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	     
	}  
	}
}
