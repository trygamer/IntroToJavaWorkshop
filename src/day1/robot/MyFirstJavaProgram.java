package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot kevin=new Robot();
		kevin.penDown();
		kevin.setRandomPenColor();
		kevin.move(100);
		kevin.turn(90);
		kevin.move(100);
		kevin.turn(90);

	
		
		
	}
}
