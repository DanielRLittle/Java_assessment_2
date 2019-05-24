package adventureGame;

import java.util.Scanner;

public class Game {
	static Player player = new Player(null, 120, 0, 0);
	static Monster monster = new Monster(0,0);
	static double distance = 0;
	
	
	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	
	public static double distCalc() {
		if (distance == 0) {
			float hordist = player.getHorizontal() - monster.getHorizontal();
			float verdist = player.getVertical() - monster.getVertical();
			distance = Math.sqrt(verdist*verdist + hordist*hordist);
			return distance;
		}
		else {
			distance -= 5;
			return distance;
		}
		
	}
	
	public static void w8() {
		String wait = input();
	}
	public static void gameMoving() {
		boolean run = true;
		monster.setHorizontal();
		monster.setVertical();
		while(run == true) {
			System.out.println("Which direction would you like to go, N/E/S/W?");
			String dir = input();
			player.move(dir);
			System.out.print("Your position is: ");
			player.printPos();

			monster.move();
			if(distance <= 5) {
				monster.hit();
				run = false;
			}
		}
	}
	
	public static void game() {
		System.out.println("Please expand the console for the best player experience. Press enter to keep continuing through the game.");
		w8();
		System.out.println("*Player wakes up*");
		w8();
		System.out.println("What? Where am I?");
		w8();
		System.out.println("Ahh, is that sweat?!");
		w8();
		System.out.println("What was my name, I can barely remember? *Please enter name*");
		player.setName(input());
		String namey = player.getName();
		System.out.println(namey+"! Yes I remember now, my name is "+namey+".");
		w8();
		System.out.println("That's not sweat, it's water, am I in a swamp?!");
		w8();
		System.out.println("*You find a compass in your hand, it points North but also has a bright glowing green arrow pointing East");
		System.out.println(" There is also a faint red glow that seems to be getting increasingly brighter, that can't be good!*");
		w8();
		System.out.println("Survive as long as you can!");
		w8();
		Game.gameMoving();
//		System.out.println("I guess I will head East...");
//		player.move("E");
//		w8();
//		System.out.println("You find a letter. The greeen arrow is now pointing a different direction; and the red light on your compass has become brighter too.");
		
	}
}
