package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].miniaturize();
			robots[i].setSpeed(100);
			robots[i].penDown();
		}
		int robotY = 0;
		for (int i = 0; i < robots.length; i++) {
			robots[i].moveTo(500, 15 * i + 5);
			robots[i].setAngle(90);
		}
		Random random = new Random();
		int[] ys = { 0, 0, 0, 0, 0 };
		int highest = 0;
		while (highest < 361) {
			for (int i = 0; i < robots.length; i++) {
				robotY = random.nextInt(50);
				for (int j = 0; j < robotY; j++) {
					robots[i].turn(1);
					robots[i].move(5 - i);
				}
				ys[i] = ys[i] + robotY;
			}
			for (int i = 0; i < ys.length; i++) {
				if (ys[i] > highest) {
					highest = ys[i];
				}
			}
		}
		for (int i = 0; i < ys.length; i++) {
			System.out.println(ys[i]);
		}
	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
