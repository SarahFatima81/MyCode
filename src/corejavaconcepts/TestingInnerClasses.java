package corejavaconcepts;

public class TestingInnerClasses {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.name);
        OuterClass.InnerClassOne ico = oc.new InnerClassOne();
        ico.callInnerOne();
		 OuterClass.InnerClassTwo ict = new OuterClass.InnerClassTwo();
		 ict.callInnerTwo();
	}

}

class OuterClass{
	String name = "Mark";
	
public class InnerClassOne{
	public void callInnerOne(){
		System.out.println("He is an Engineer.");	
	}
	
}
static class InnerClassTwo{
	public void callInnerTwo(){
		System.out.println("He works in GE.");
	}
	
}	
}