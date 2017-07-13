package day3;

// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic_8_Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int hello =new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(hello);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("type in a yes or no question");
	// 5. If the random number is 0
if(hello == 0){
	// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null,"Yes");
}
	// 6. If the random number is 1
if(hello == 1){
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null,"No");
}
	// 7. If the random number is 2
if(hello == 2){
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog(null,"maybe you should ask Google?");
}
// 8. If the random number is 3
if(hello == 2){
	// -- write your own answer
	JOptionPane.showMessageDialog(null,"I dought it.");
}}}


