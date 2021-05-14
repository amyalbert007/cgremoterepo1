package cg.lesson4demo;
import java.util.regex.*;
public class Regex2 {
	public static void main(String []args){
		int count=0;
		
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababbaba");
		while(m.find()) {
			count++;
			System.out.println(m.start());
		}
		System.out.println("The number of occurrences is :"+count);
	}

}
