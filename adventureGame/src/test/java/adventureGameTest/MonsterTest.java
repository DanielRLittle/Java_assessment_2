package adventureGameTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import adventureGame.Game;
import adventureGame.Monster;
import adventureGame.Player;

public class MonsterTest {
	Monster m;
	
	@Before
	public void setup() {
		m = new Monster(0, 0);
	}
	
	@Test
	public void setHorizontal() {
		Player player = new Player(null, 0, 0, 0);
		assertEquals("Error", 0, null);
	}
}
