package CalculatorProgram;

public class NumberOfDiceRoll {

	public static void main(String[] args) {
		/*
		 * player starts at zero
		 */

		int position = 0 , count =0 ;

		/*
		 *  Method uses while loop to get the player to the winning position
		 */

		while (position != 100) {

			/*
			 * Generating the Dice value using Random
			 */

			int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

			/*
			 *     player chance to play or get snake or ladder 
			 */

			int value = (int) Math.floor(Math.random() * 3);

			/*
			 *   Options for player using if condition
			 */

			if (value == 1) {

				/*
				 *  As per the problem requirement if the player goes above 100 the he stays 
				 *  in the same position till he reaches the winning position (100)
				 */
				if (position < 95) {
					position += dicenumber;
					System.out.println("Player got ladder");
					System.out.println("Player shifted forward by " + dicenumber + " number");
				} else if ((position == 95 && dicenumber == 5) || (position == 96 && dicenumber == 4)
						|| (position == 97 && dicenumber == 3) || (position == 98 && dicenumber == 2)
						|| (position == 99 && dicenumber == 1)) {
					position += dicenumber;
					System.out.println("Player got ladder");
					System.out.println("Player shifted forward by " + dicenumber + " number");
				} else {
					continue;
				}
			} else if (value == 2) {
				position -= dicenumber;
				System.out.println("Player got snake");
				System.out.println("Player shifted backward by " + dicenumber + " number");

				/*
				 * As per problem statement if value of position is less than zero
				 * player should start from zero position
				 */
				if (position < 0) {
					position = 0;
				}

			} else {
				System.out.println("Player  stays on same position");
			}
			
			System.out.println("Current position of the  player " + position);
			count++;

		}
		/*
		 * Displaying the number of times the Dice was rolled to get 
		 * to the winning position
		 */
		
		System.out.println(count + " Times the Dice was rolled for the player to reach the winning position");
		
	}
}
	
