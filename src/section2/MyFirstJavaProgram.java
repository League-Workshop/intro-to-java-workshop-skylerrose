package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot donnie=new Robot();
	donnie.setSpeed(40);
	donnie.penDown();
		donnie.move(150);
		donnie.turn(90);
		donnie.move(150);
		donnie.turn(90);
		donnie.move(150);
		donnie.turn(90);
		donnie.move(150);
		
	}
}
