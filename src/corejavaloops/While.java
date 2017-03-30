package corejavaloops;

public class While {

	public static void main(String args[]){
		
		int counter = 0;
		
		while(counter < 10){
			System.out.println(counter);
			counter++;
			
			int ages[] = {20, 26, 30, 52};
			
			int i = 0;
			
			while(i < ages.length){
				System.out.println(ages[i++]);
			}
			
		}	
	}
}
