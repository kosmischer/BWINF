/*
Notizen:

	Momentum ist wichtig für die bälle die angestoßen werden, nach jedem tick soll geprüft wreden 
	ob ein ball momentum in eine richtung hat und dann in die richtung moven. Wenn dort ein ball 
	ist soll das momentum übertragen werden bis kein ball momentum hat.
	

















 */



package aufgabe_4;

import java.util.ArrayList;
import java.util.List;

public class logic {

	private List<Ball> ballList = new ArrayList<>();

	private Ball goal;
	

	
	public logic() {
		goal = new Ball(goalBallPos()[0], goalBallPos()[1], "goal");
		goal.setThrown(true);
		ballList.add(goal);
		}
	
	public void placeBall(int x, int y, boolean isBlue) {
		if (isBlue) {
			ballList.add(new Ball(x, y, "blue"));
			} 
		if (!isBlue) {
			ballList.add(new Ball(x, y, "red"));
			}
		}
	
	public void pushBall(Ball ball) {
		//Move east
		if(ball.getPos()[0] == 1) {
			ball.setThrown(true);
			ball.setMomentum("east");
			ball.setMomentumStrength((int) (Math.random() * 6));
			ball.checkMomentum();
			}
		    
		//move west
		if(ball.getPos()[0] == 11) {
			ball.setThrown(true);
			ball.setMomentum("west");
			ball.setMomentumStrength((int) (Math.random() * 6));
			ball.checkMomentum();
			}
		//move south
		if(ball.getPos()[1] == 1) {
			ball.setThrown(true);
			ball.setMomentum("south");
			ball.setMomentumStrength((int) (Math.random() * 6));
			ball.checkMomentum();
			}
		//move north
		if(ball.getPos()[1] == 11) {
			ball.setThrown(true);
			ball.setMomentum("north");
			ball.setMomentumStrength((int) (Math.random() * 6));
			ball.checkMomentum();
			}
	}
	
	

	
	
	public void tick() {
	
		for (Ball ball : ballList) {
			if (!ball.getMomentum().equals("rest")) {
				int x = ball.getPos()[0];
				int y = ball.getPos()[1];
				
				int newx=0;
				int newy=0;
				
				if (ball.getMomentum().equals("east")) {
					newx = x + 1;
					newy = y;
				}
				if (ball.getMomentum().equals("west")) {
					newx = x - 1;
					newy = y;
					}
				if (ball.getMomentum().equals("south")) {
					newx = x;
					newy = y + 1;
					}
				if (ball.getMomentum().equals("north")) {
					newx = x;
					newy = y - 1;
					}
				
				
				for (Ball otherBall : ballList) {
					if (otherBall.getPos()[0] == newx && otherBall.getPos()[1] == newy) {
						//there is a ball in the way, transfer momentum
						otherBall.setMomentum(ball.getMomentum());
						otherBall.setMomentumStrength(1);
						ball.setMomentumStrength(1);
						}
						else {
							ball.setPos(newx, newy);
							ball.reduceMomentumStrength();
						}
					}
				}
			}
		}
	
	
	
	
	
	public int[] goalBallPos() {
		int[] goalBallPos = new int[2];
		goalBallPos[0] = (int)(Math.random() * 7) + 4;
		goalBallPos[1] = (int)(Math.random() * 7) + 4;
		
		//ALternativ:
		//goalBallPos[0] = (int)(Math.random() * 13)
		//goalBallPos[1] = (int)(Math.random() * 13)
		
		return goalBallPos;
	}
	
	public List<Ball> getBallList() {
		return ballList;
	}
	public void replaceBall(Ball newBall, int index) {
		ballList.set(index, newBall);
	}
}
	


