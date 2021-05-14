package cg.lesson4demo;

import java.util.regex.*;

public class Regex3 {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababbbabaab");
		while(m.find()) {
			count++;
			System.out.println(m.start()+"...."+m.end()+"...."+m.group());
		}
     System.out.println("count :"+count);
	}

}
