package io;
import java.io.*;
import java.text.Format.Field;

public class DeserializeDemo {
	public static void main(String args[])throws Exception
    {
	FileInputStream fis = new FileInputStream("e:\\serial.txt");

	 

    ObjectInputStream ois = new ObjectInputStream(fis);



    Object o=ois.readObject(); //deserialization
    
    //System.out.println(o.getClass().getDeclaredFields().toString());
    //Field f[]=o.getClass().getDeclaredFields();



    
    Account a1=(Account)o;
    System.out.println(a1.id+"--------"+a1.name);
    }

}
