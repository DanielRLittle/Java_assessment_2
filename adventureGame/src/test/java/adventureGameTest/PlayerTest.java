package adventureGameTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import adventureGame.Player;

public class PlayerTest {
	Player p;
	
	@Before
	public void setup() {
		p = new Player(null, 0, 0, 0);
	}
	
	@Test
	public void move() {
		assertEquals("Move error", p.horizontal += 5, "E");
	}
}
