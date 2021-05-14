package cg.practicequestions;

import java.util.*;

 class Data {
	
	Integer data; 
	Data(Integer d)
	{
	data=d;
	}
	 public boolean equals(Object o)
	{
	return true;
	}
	 public int hashCode()
	{
	return 1;
	}
	}
	class Test{
	 public static void main(String ar[]){
	   Set<Data> s=new HashSet<Data>();
	   s.add(new Data(4));
	   s.add(new Data(2));
	    s.add(new Data(4));
	    s.add(new Data(1));
	   s.add(new Data(2));
	  System.out.print(s.size());
	}
	 }


