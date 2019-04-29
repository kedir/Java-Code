package test;
// This class shows how to use the singlton design pattern.
public class Singlton {
	
	private static Singlton obj;
	
	static{
		obj=new Singlton();
		
	}

	public static Singlton getObj() {
		return obj;
	}
	
	public void testme(){
		System.out.println("working");
	}

	public static void main(String[] args) {
		
		Singlton s = getObj();
		s.testme();
		System.out.println(obj.hashCode()+" "+s.hashCode());
		
	}

}
