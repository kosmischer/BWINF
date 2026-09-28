package aufgabe_4;

import java.util.ArrayList;
import java.util.List;

public class logic {

	private List<Ball> blueBallList = new ArrayList<>();
	private List<Ball> redBallList = new ArrayList<>();
	private Ball goal;
	
	public logic() {
		goal = new Ball(goalBallPos()[0], goalBallPos()[1], true);
		}
	
	public void placeBall(int x, int y, boolean isBlue) {
		if (isBlue) {
			blueBallList.add(new Ball(x, y));
			} else {
			redBallList.add(new Ball(x, y));
			}
		}
	
	public void pushBall(Ball ball) {
		//Move east
		if(ball.getPos()[0] == 1) {ball.setMomentum("east");}
		//move west
		if(ball.getPos()[0] == 11) {ball.setMomentum("west");}
		//move south
		if(ball.getPos()[1] == 1) {ball.setMomentum("south");}
		//move north
		if(ball.getPos()[1] == 11) {}ball.setMomentum("north");
	}
	
	
	//Momentum ist wichtig für die bälle die angestoßen werden, nach jedem tick soll geprüft wreden 
	//ob ein ball momentum in eine richtung hat und dann in die richtung moven. Wenn dort ein ball 
	//ist soll das momentum übertragen werden bis kein ball momentum hat.
	
	
	
	
	
	
	
	
	
	
	public int[] goalBallPos() {
		int[] goalBallPos = new int[2];
		goalBallPos[0] = (int)(Math.random() * 7) + 4;
		goalBallPos[1] = (int)(Math.random() * 7) + 4;
		
		//ALternativ:
		//goalBallPos[0] = (int)(Math.random() * 13)
		//goalBallPos[1] = (int)(Math.random() * 13)
		
		return goalBallPos;
	}
}
	


