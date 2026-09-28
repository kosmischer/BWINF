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
	


