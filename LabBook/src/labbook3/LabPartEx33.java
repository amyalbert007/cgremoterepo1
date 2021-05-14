package labbook3;
import java.util.Scanner;
public class LabPartEx33 {
		    static boolean positiveString(String s) {
		        int n = s.length();
		 
		        for (int i = 1; i < n; i++) {
		            if (s.charAt(i) < s.charAt(i - 1)) {
		                return false;
		            }
		        }
		        return true;
		    }
		    public static void main(String[] args) {
		    	Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string");
				String str = sc.nextLine();
		        if (positiveString(str)) {
		           System.out.println("String is positive");
		        } else {
		            System.out.println("String is not positive");
		        }
		    }
		}


