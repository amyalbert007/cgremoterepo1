package cg.lesson4demo;
import java.util.Scanner;
import java.util.regex.*;
public class Regex1 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[A-Z][a-z\\s]{1,16}+[A-Z][a-z\\\\s]{1,16}+$");
		System.out.println("Please Enter your name");
		String name=scanner.next();
		
		Matcher matchname = pattern.matcher(name);
		
		if(matchname.find()) {
			System.out.println("Name is : "+name);
		
		}
		else {
			System.out.println("invalid input");}
		
		Scanner scan =new Scanner(System.in);
		Pattern pat = Pattern.compile("^[0-9]{10}$");
		System.out.println("Please enter your mobile no");
		String mob=scan.next();
		
		Matcher match = pat.matcher(mob);
	    if(match.find()) {
			long mobn=Long.parseLong(mob);
			System.out.println("Mobile No. : "+mobn);
		}
		else {
			System.out.println("invalid input");
		}
	    Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      Pattern patt = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.com]+$");
	      String email = sc.next();
	      Matcher matchemail =patt.matcher(email);
	      if(matchemail.find()) {
	         System.out.println("Email-id is "+email);
	      } else {
	         System.out.println("Email-id is not valid");}
		
	}

}
