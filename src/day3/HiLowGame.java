package day3;



	 import java.util.Random;

import javax.swing.JOptionPane;

	// Copyright Wintriss Technical Schools 2013
	public class HiLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int ran = new Random().nextInt(1001);
			// 2. Print out the random variable above
			System.out.println(ran);
			// 11. do the following 10 times
			for(int i=0; i<10; i++){
				// 1. ask the user for a guess using a pop-up window, and save their response 
String num=JOptionPane.showInputDialog("guess a number between 0-1000");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
int ans=(Integer.parseInt(num));
				// 5. if the guess is correct
				if(ans==ran){
// 6. win
					JOptionPane.showMessageDialog(null,"You won. You got it in "+i+++" try's");
				}				
				// 7. if the guess is high
				
				if(ans>ran){
					// 8. tell them it's too
					JOptionPane.showMessageDialog(null,"tooooooo HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIGH");
					
				}	
					// 9. if the guess is low
				if(ans<ran){
				
					// 10. tell them it's too low
					JOptionPane.showMessageDialog(null,"It's toooooo LOOOOOOOOOOOOOOOOOOOOOOOOOW");
				}
			// 12. tell them they lose
		}
			JOptionPane.showMessageDialog(null,"HA you LOOOSe it was"+ran);
			
	}
		
	}




