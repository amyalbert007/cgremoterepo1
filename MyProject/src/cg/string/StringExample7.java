package cg.string;

public class StringExample7 {
	public static void main(String args[]){ 
		
		
		
		
	//1.The append() method concatenates the given argument with this string.
	StringBuffer sb=new StringBuffer("Hello ");  
	sb.append("Java");//now original string is changed  
	System.out.println(sb);//prints Hello Java
	
	
	//2The insert() method inserts the given string with this string at the given position.
	StringBuffer sb1=new StringBuffer("Hello ");  
	sb1.insert(1,"Java");//now original string is changed  
	System.out.println(sb1);//prints HJavaello
	
	
	//3The insert() method inserts the given string with this string at the given position.
	StringBuffer sb2=new StringBuffer("Hello");  
	sb2.replace(1,3,"Java");  
	System.out.println(sb2);//prints HJavalo
	
	
	
	
	//4The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
	StringBuffer sb3=new StringBuffer("Hello");  
	sb3.delete(1,3);  
	System.out.println(sb3);//prints Hlo
	
	
	//5The reverse() method of StringBuilder class reverses the current string.
	StringBuffer sb4=new StringBuffer("Hello");  
	sb4.reverse();  
	System.out.println(sb4);//prints olleH
	
	
	
	/*The capacity() method of StringBuffer class returns the current capacity of the buffer. 
	 * The default capacity of the buffer is 16. If the number of character increases from its current capacity, 
	 * it increases the capacity by (oldcapacity*2)+2.
	 *  For example if your current capacity is 16, it will be (16*2)+2=34.*/
	StringBuffer sb5=new StringBuffer();  
	System.out.println(sb5.capacity());//default 16  
	sb5.append("Hello");  
	System.out.println(sb5.capacity());//now 16  
	sb5.append("java is my favourite language");  
	System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
	System.out.println(sb5.length());
	sb5.append("javais my favourite language ");
	System.out.println(sb5.capacity());
	System.out.println(sb5.length());
	sb5.append("javais my favourite language hhgh fdsfzdsfff sfdzsdfsdfszdf");
	System.out.println(sb5.capacity());
	
	
	
	
	/*The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity. 
	 * If it is greater than the current capacity, 
	 * it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
	 */
	StringBuffer sb6=new StringBuffer();  
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