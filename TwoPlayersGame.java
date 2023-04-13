package CalculatorProgram;

public class TwoPlayersGame {

	public static void main(String[] args) {
		int player = 1;
		int count1 = 0;
		int count2 = 0;
		int count = 0;
		
		for (; player <= 2; player++) {
			int position = 0;
			
			while (position != 100) {

				/*
				 *  Generating the Dice value using Random
				 */

				int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

				/*
				 * player chance to play or get snake or ladder 
				 */

				int value = (int) Math.floor(Math.random() * 3);

				/*
				 * Options for player using if condition
				 */

				if (value == 1) {

					/*
					 * As per the problem requirement if the player goes above 100 the he stays 
					 *  in the same position till he reaches the winning position (100)
					 */
					if (position < 95) {
						position += dicenumber;
						// System.out.println("Player got ladder");
						// System.out.println("Player shifted forward by " + dicenumber + " number");
					} else if ((position == 95 && dicenumber == 5) || (position == 96 && dicenumber == 4)
							|| (position == 97 && dicenumber == 3) || (position == 98 && dicenumber == 2)
							|| (position == 99 && dicenumber == 1)) {
						position += dicenumber;
						// System.out.println("Player got ladder");
						// System.out.println("Player shifted forward by " + dicenumber + " number");
					} else {
						continue;
					}

					/*
					 * If player get a ladder he get one more chance
					 */

					int position2 = getrandom();
					position += position2;
				} else if (value == 2) {
					position -= dicenumber;

					/*
					 * As per problem statement if value of position is less than zero
					 * player should start from zero position
					 */
					if (position < 0) {
						position = 0;
					}

				} else {
					continue;
				}
                count++;
			}
			
			/*
			 * Counting dice roll for declaring winner
			 */
			if (player == 1) {
				count1 = count;
				System.out.println("Roll of dice needed to win player1 " + count);
			} else if (player == 2) {
				count2 = count;
				System.out.println("Roll of dice needed to win player2 " + count);
			}

		}
		if (count1 < count2) {
			System.out.println("Player one is winner");
		} else {
			System.out.println("Player two is winner");
		}
	}

	/*
	 * This method is created  if player got a ladder he get another chance to play
	 */

	public static int getrandom() {

		int dice = (int) Math.floor(Math.random() * 6 + 1);

		int result = (int) Math.floor(Math.random() * 3);

		if (result == 1) {
			return dice;
		} else if (result == 2) {
			return -dice;
		} else {
			return 0;
		}
	}
}
