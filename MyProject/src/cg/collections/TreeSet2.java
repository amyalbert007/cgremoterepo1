package cg.collections;
import java.util.*;
public class TreeSet2 {
	
	//Let's see an example to retrieve and remove the highest and lowest Value.
	 public static void main(String args[]){
	TreeSet<Integer> set=new TreeSet<Integer>();  
    set.add(24);  
    set.add(66);  
    set.add(12);  
    set.add(15);  
    System.out.println("Highest Value: "+set.pollFirst());  
    System.out.println("Lowest Value: "+set.pollLast());

}
}
