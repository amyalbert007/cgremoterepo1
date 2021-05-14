package io;
import java.io.*;
import java.text.Format.Field;
class Account implements Serializable
{  // static int x=99;
   // transient int y=23;
    int id=10111;
    String name="ABC";
}
public class SerializeDemo {
	public static void main(String args[])throws Exception
    {
        Account a=new Account();

 

        System.out.println(a.id+"--------"+a.name);
        FileOutputStream fos = new FileOutputStream("e:\\serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        

        oos.writeObject(a);  //serialization
	
	
    }

}
