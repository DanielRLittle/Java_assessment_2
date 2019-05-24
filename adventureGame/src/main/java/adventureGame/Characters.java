package adventureGame;

public abstract class Characters {
	public float horizontal;
	protected float vertical;
	
	public Characters(float horizontal, float vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}

	float[] coords; 
	public float[] getPos() {
		float [] coords = {this.getHorizontal(), this.getVertical()};
		
		return coords;
		
	}
	public void printPos() {
		float [] coords = {this.getHorizontal(), this.getVertical()};
		System.out.println(coords[0] + ", " + coords[1]);
	}
	public float getHorizontal() {
		return horizontal;
	}
	
	public float getVertical() {
		return vertical;
	}



}
