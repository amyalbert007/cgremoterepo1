package cg.string;

public class StringExample8 {
	
	public static void main(String args[]){ 
		
		
		//The StringBuilder append() method concatenates the given argument with this string.
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		
		
		//The StringBuilder insert() method inserts the given string with this string at the given position.
		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  
		
		
		
		//The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.
		StringBuilder sb2=new StringBuilder("Hello");  
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);//prints HJavalo
		
		
		
		//The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.
		StringBuilder sb3=new StringBuilder("Hello");  
		sb3.delete(1,3);  
		System.out.println(sb3);//prints Hlo
		
		
		
		
		
		//The reverse() method of StringBuilder class reverses the current string.
		StringBuilder sb4=new StringBuilder("Hello");  
		sb4.reverse();  
		System.out.println(sb4);//prints olleH
		
		
		
		
		/*/The capacity() method of StringBuilder class returns the current capacity of the Builder.
		The default capacity of the Builder is 16. If the number of character increases from its current capacity,
		it increases the capacity by (oldcapacity*2)+2.
		For example if your current capacity is 16, it will be (16*2)+2=34.*/
		StringBuilder sb5=new StringBuilder();  
		System.out.println(sb5.capacity());//default 16  
		sb5.append("Hello");  
		System.out.println(sb5.capacity());//now 16  
		sb5.append("java is my favourite language");  
		System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		
		
		
		
		
		
		/*The ensureCapacity() method of StringBuilder class ensures that the given capacity is the minimum to the current capacity.
		If it is greater than the current capacity, 
		it increases the capacity by (oldcapacity*2)+2.
		For example if your current capacity is 16, it will be (16*2)+2=34.*/
		StringBuilder sb6=new StringBuilder();  
		System.out.println(sb6.capacity());//default 16  
		sb6.append("Hello");  
		System.out.println(sb6.capacity());//now 16  
		sb6.append("java is my favourite language");  
		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb6.ensureCapacity(10);//now no change  
		System.out.println(sb6.capacity());//now 34  
		sb6.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb6.capacity());//now 70
		
		

		
		
		
		
		
		
		}

}
