package corejavastrings;

public class StringsChar {

	public static void main(String[] args) {
		
		String message = "Hello World!!";
		
		message = message.concat(" What a beautiful day!!!");
		
		System.out.println(message);
		
		
			  
	   char[] characters = message.toCharArray();
	   
	   for (char c : characters){
		   System.out.println(c);
		   
		   //System.out.print(c); also gives the message in one line
		   
		   
		   
		   
		   
	   }

	}

}
