package cg.lesson4demo;

import java.util.regex.*;

public class Regex4 {
	public static void main(String []args) {
	Pattern p = Pattern.compile("[ab]");
	Matcher m = p.matcher("ajdjAbKJaHADaSHbHNKbaCJOaIb");
	while(m.find()) {
		System.out.print(m.start()+"...."+m.group());}
  
   }
}
	
