package aufgabe_4;

public class Ball {

	private int pos[] = new int[2];
	private boolean isGoal;
	
	
	
	public Ball(int x, int y) {
		this.pos[0] = x;
		this.pos[1] = y;
		this.isGoal = false;
	}
	
	public Ball(int x, int y, boolean isGoal) {
		this.pos[0] = x;
		this.pos[1] = y;
		this.isGoal = isGoal;
	}
	
	
	public int[] getPos() {
		return pos;
	}
	
	public void setPos(int x, int y) {
		this.pos[0] = x;
		this.pos[1] = y;
	}
	
	public boolean isGoal() {
		return isGoal;
	}
	
	public void moveRight(int value) {
		this.pos[0]+= value;
	}
	
	public void moveLeft(int value) {
		this.pos[0]-= value;
	}
	
	public void moveUp(int value) {
		this.pos[1]-= value;
	}
	
	public void moveDown(int value) {
		this.pos[1]+= value;
	}
	
	
	
	
	
	
	
	
	
	
	
}














