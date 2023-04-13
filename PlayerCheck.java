package CalculatorProgram;
 

public class PlayerCheck {
	/*
	 * By initiating the assumed position of the player and check the player chance 
	 * to get snake or ladder using random 
	 */
	public static void main(String[] args) {
		 

		/*
		 * Assuming   position of player 
		 */
		int position = 33;

		/*
		 *  Get dice value
		 */

		int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

		/*
		 * To check player chance to play or get snake or ladder using random
		 */

		int value = (int) Math.floor(Math.random() * 3);


		if (value == 1) {
			position += dicenumber;
			System.out.println("Player got ladder");
			System.out.println("Player shifted forward by " + dicenumber + " number");
		} else if (value == 2) {
			position -= dicenumber;
			System.out.println("Player got snake");
			System.out.println("Player shifted backward by " + dicenumber + " number");
		} else {
			System.out.println("Player should stay on same position");
		}
	}
}