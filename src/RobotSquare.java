import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {•°°°8
public static void main(String[] args) {
	Robot rob=new Robot();
	rob.setSpeed(1000000000);
	rob.penDown();
for (int i = 0; i < 100; i++) {
	rob.move(1);
	rob.turn(360/100);
rob.setWindowColor(20,40,80);