package aufgabe_4;

public class Ball {

	private int pos[] = new int[2];
	
	private String momentum;
	private int momentumStrength;
	private String color;
	
	
	
	public Ball(int x, int y, String color) {
		this.pos[0] = x;
		this.pos[1] = y;
		this.color = color;
		this.momentum = "rest";
	}
	
	public String getColor() {
		return this.color;
	}

	
	
	
	public int[] getPos() {
		return pos;
	}
	
	public void setPos(int x, int y) {
		this.pos[0] = x;
		this.pos[1] = y;
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
	
	public void setMomentum (String direction) {
		this.momentum = direction;
	}
	
	public String getMomentum() {
		return this.momentum;
	}
	
	
	
	public void setMomentumStrength(int strength) {
		this.momentumStrength = strength;
	}
	
	public int getMomentumStrength() {
		return this.momentumStrength;
	}
	
	public void reduceMomentumStrength() {
		this.momentumStrength--;
		if (this.momentumStrength <= 0) {
			this.momentum = "rest";
			this.momentumStrength = 0;
		}
	}
	
	public void checkMomentum() {
		if (this.momentumStrength == 0) {
			this.momentum = "rest";
		}
	}

}














