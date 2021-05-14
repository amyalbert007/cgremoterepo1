package ExceptionHandlingDemo;

public class ExceptionDemo2 {
	public static void main(String args[]){
	Dog dog = null;
	try {
		System.out.println(dog.dogName);
	}
	catch(NullPointerException e) {
		dog = new Dog();
		System.out.println(dog.dogName);
	    }
		
		
		
	}

}
