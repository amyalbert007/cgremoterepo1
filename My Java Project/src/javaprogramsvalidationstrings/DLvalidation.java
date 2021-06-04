package javaprogramsvalidationstrings;
import java.util.regex.*;
public class DLvalidation {
	public static boolean isValidLicenseNo(String str)
    {
        
        String regex = "^(([A-Z]{2}[0-9]{2})"
                       + "( )|([A-Z]{2}-[0-9]"
                       + "{2}))((19|20)[0-9]"
                       + "[0-9])[0-9]{7}$";
 
       
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }
	 public static void main(String args[])
	    {
	 
	        // Test Cases
	        String str1 = "HR-0619850034761";
	        System.out.println(isValidLicenseNo(str1));

	        String str2 = "UP14 20160034761";
	        System.out.println(isValidLicenseNo(str2));

	        String str3 = "12HR-37200602347";
	        System.out.println(isValidLicenseNo(str3));

	        String str4 = "MH27 30123476102";
	        System.out.println(isValidLicenseNo(str4));

	        String str5 = "GJ-2420180";
	        System.out.println(isValidLicenseNo(str5));
	    }
	 
	 
	 
	 
	 
	 
	 
	 /*Given string str, the task is to check whether the given string is a valid Indian driving license number or not by using Regular Expression.
The valid Indian driving license number must satisfy the following conditions: 

It should be 16 characters long (including space or hyphen (-)).
The driving license number can be entered in any of the following formats:
HR-0619850034761
 OR 
HR06 19850034761
The first two characters should be upper case alphabets that represent the state code.
The next two characters should be digits that represent the RTO code.
The next four characters should be digits that represent the license issued year.
The next seven characters should be any digits from 0-9.
Note: In this article, we will check the license issued year from 1900-2099. It can be customized to change the license issued year.

 Approach: The idea is to use Regular Expression to solve this problem. The following steps can be followed to compute the answer: 

Get the String.
Create a regular expression to check valid Indian driving license number as mentioned below:
regex = “^(([A-Z]{2}[0-9]{2})( )|([A-Z]{2}-[0-9]{2}))((19|20)[0-9][0-9])[0-9]{7}$”; 

Where: 
^ represents the starting of the string.
( represents the starting of group 1.
( represents the starting of group 2.
[A-Z]{2} represents the first two characters should be upper case alphabets.
[0-9]{2} represents the next two characters should be digits.
) represents the ending of the group 2.
( ) represents the white space character.
| represents the or.
( represents the starting of group 3.
[A-Z]{2} represents the first two characters should be upper case alphabets.
– represents the hyphen.
[0-9]{2} represents the next two characters should be digits.
) represents the ending of the group 3.
) represents the ending of the group 1.
((19|20)[0-9][0-9]) represents the year from 1900-2099.
[0-9]{7} represents the next seven characters should be any digits from 0-9.
$ represents the ending of the string.
Match the given string with the Regular Expression, In Java, this can be done by using Pattern.matcher().
Return true if the string matches with the given regular expression, else return false.
	  
	  * */

}
