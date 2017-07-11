package day1.robot;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class TriangleShell {

	// 1. Create a new Robot
	Robot k = new Robot();

	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		k.setSpeed(1000);
		// 4. make a variable to hold the length of the triangle and set it to
		// 50
		int length = 50;
		// 7. Do the following (up to step 10) 60 times
		for (int I = 0; I < 100; I++) {

			// 9. Change the color of the pen to a random color
			k.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
			length += 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 10. Turn the tortoise 6 degrees to the right
			k.turn(6);
			k.setPenColor(0, 200, 255);

		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable
	 * for the size of the triangle.
	 */
	private void drawTriangle(int length) {

		k.penDown();
		k.move(length);
		k.turn(360 / 3);
		k.move(length);
		k.turn(360 / 3);
		k.move(length);
		k.turn(360 / 3);

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
