package CalculatorProgram;
 

public class RollDicePlayer {
	 
	public static void main( String args[] ) {   
	 
	int min = 1;  
	int max = 6 ;  
	 
	/*
	 * Generate random   value from 1 to 6  
	 */
	System.out.println("Player Dice Value "+min+" to "+max+ ":");  
	int a = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(a);  
	}  
		 

}
