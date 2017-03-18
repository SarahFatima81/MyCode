package corejavaloops;

public class Switch {
	
	public static void main(String args[]){
		
		int age = 3;
		
		switch(age){
		
		case 1:
			System.out.println("You can crawl");
		    break;
		case 2:	
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You are naughty");
			break;
		default:
			System.out.println("I don't know your age");
		}
	}

}
