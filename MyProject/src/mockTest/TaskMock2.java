package mockTest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Header{
	String from;
	String to;
	public Header(String from,String to) {
		super();
		this.from=from;
		this.to=to;
		
	}
}
class Email{
	Header header;
	String body;
	String greetings;
	public Email(Header header,String body,String greetings) {
		super();
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}
class EmailOperations{
	public int emailVerify(Email e) {
		Pattern pattern =Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher email1 = pattern.matcher(e.header.from);
		Matcher email2 = pattern.matcher(e.header.to);
		int result;
		if(email1.find() && email2.find()) {
			result=2;
			return result;
		}
		else if(email1.find() || email2.find()) {
			result=1;
			return result;
			
		}
		else {
			result=0;
			return result;
		}
		
	}
	public String    bodyEncryption(Email e) {
		String f="";
		char ch;
		int a;
		for(int i=0;i<e.body.toString().length();i++) {
			ch=e.body.toString().charAt(i);
			if(Character.isLetter(ch)) {
				a=ch+3;
				if(Character.isUpperCase(ch)&&a>90 || Character.isLowerCase(ch)&&a>122) {
					a=a-26;
					
				}
				ch = (char) a;
			}
			f=f+ch;
		}
		return f;
		
	}
	public String greetingMessage(Email e) {
		String name=(e.header.from).substring(0,e.header.from.indexOf('@'));
		String greeting=e.greetings+" ";
		String result=greeting.concat(name);
		return result;
		
	}
}
public class TaskMock2 {
	public static void main(String[] args) {
		Header h=new Header("Abcsdfsdsdvfs@gmail.com","xyz@gmail.com");
		Email e=new Email(h,"This is Full stack training","Regards");
		EmailOperations eo=new EmailOperations();
		System.out.println(eo.emailVerify(e));
		System.out.println(eo.greetingMessage(e));
		System.out.println(eo.bodyEncryption(e));
	}

}
