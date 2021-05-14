package cg.lesson3demo;

public class Constructor1 {
	String name;
	int roll_no;
	Constructor1(String name,int roll_no){
		this.name=name;
		this.roll_no=roll_no;
	}
	public static void main(String []args) {
		Constructor1 s1=new Constructor1("Amit ",100);
		Constructor1 s2=new Constructor1("Ankur ",110);
		System.out.println(s1.name+s1.roll_no);
		System.out.println(s2.name+s2.roll_no);
	}

}
