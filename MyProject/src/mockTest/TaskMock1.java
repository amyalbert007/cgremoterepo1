package mockTest;
class Activity{
	String string1;
	String string2;
	String operator;
	Activity(String string1,String string2,String operator){
		super();
		this.string1=string1;
		this.string2=string2;
		this.operator=operator;
		
		
	}
}
public class TaskMock1 {
	public String handleException(Activity a) throws Exception {
		String msg = null;
		if(a.string1.equals(null) || a.string2.equals(null))
			throw new NullPointerException("Null values found");
		else if(!a.operator.equals("+") && !a.operator.equals("-"))
			throw new Exception(a.operator);
		else
			msg = "No Exception Found";
		return msg;
		
	}
	public String doOperation(Activity a) {
		String result = null;
		switch(a.operator) {
		case"+":{
			result =a.string1+a.string2;
			break;
		}
		case"-":{
			if(a.string1.contains(a.string2))
				result = a.string1.replace(a.string2,"");
			break;
				
				
			
			
			
		}
		}
		return result;
	}
	public static void main(String []args) throws Exception{
		Activity a1 = new Activity("AmitKumar","Kumar","-");
		TaskMock1 t = new TaskMock1();
		System.out.println(t.doOperation(a1));
		System.out.println(t.handleException(a1));
	}

}
