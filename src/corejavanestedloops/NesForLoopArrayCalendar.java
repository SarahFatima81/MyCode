package corejavanestedloops;

public class NesForLoopArrayCalendar {

	public static void main(String[] args) {
		
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i= 0; i < months.length; i++){
			System.out.println(months[i]);
			
		for(int j= 0; j <= days[i]; j++){
			System.out.print(j+" ");
		}
		    System.out.println();
		}

	}

}
