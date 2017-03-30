package corejavanestedloops;

public class NesForLoopArrayExample {

	public static void main(String[] args) {
		
		int sxAge = 20;
		   int sxHeight = 6;		   
		   int sxDetails[] = {sxAge, sxHeight};
		   		   
		   int ssAge = 18;
		   int ssHeight = 5;		   
		   int ssDetails[] = {ssAge, ssHeight};
		   
		   int zfAge = 25;
		   int zfHeight = 6;
		   int zfDetails[] = {zfAge, zfHeight};
		   
		   int ageHeightDetails[][] = {sxDetails, ssDetails, zfDetails};
		   
		   for(int i =0; i < ageHeightDetails.length; i++){
			   
			   for(int j = 0; j < ageHeightDetails[i].length; j++){
				   
				   System.out.println("ageHeightDetails["+i+"]["+j+"]" + "       " + ageHeightDetails[i][j]);
			   }
			   
			    System.out.println("-----------------------------------------");
			    }

            String names[] = {"Sam", "Harry", "Lisa"};
            int ageHeightDetails1[][] = {{20, 6}, {35, 7}, {18, 5}};
            
            for(int i = 0; i < names.length; i++){
            	System.out.println(names[i]);
            	for(int j = 0; j < ageHeightDetails[i].length; j++){
            		System.out.println(ageHeightDetails1[i][j]+"  ");
            	}
            	
            	System.out.println("-----------------------");
            }
            
            
            }
	}

	
