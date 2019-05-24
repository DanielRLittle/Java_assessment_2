package adventureGame;

public class Player extends Characters{

	public String name;
	public int health;

	public Player(String name, int health, float horizontal, float vertical) {
		super(horizontal, vertical);
		this.name = name;
		this.health = health;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setHorizontal(float horizontal) {
		this.horizontal = horizontal;
	}

	public void setVertical(float vertical) {
		this.vertical = vertical;
	}

	public void move(String dir) {
		float hor = this.getHorizontal();
		float ver = this.getVertical();
		boolean run = true;
		while (run == true) {
			if(dir.equals("N") || dir.equals("E") ||dir.equals("S") ||dir.equals("W")) {
				run = false;
			}
			else {
				System.out.println("Please pick a valid direction!");
				dir = Game.input();
			}
		}
		if (dir.equals("N")) {
			this.setVertical(ver += 5);
		}
		else if (dir.equals("E")) {
			this.setHorizontal(hor += 5);
		}
		else if (dir.equals("S")) {
			this.setVertical(ver -= 5);
		}
		else {
			this.setHorizontal(hor -= 5);
		}
		
	}

}
