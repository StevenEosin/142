package Assignments;

import Assignments.TurnCounter;
import org.junit.Test;
import org.testng.Assert;


public class TurnCounterTest {
	@Test
	public void oneTurnPerChoiceTest() {
		TurnCounter tc = new TurnCounter(1, 3);
		Assert.assertEquals(tc.getChoice(), 0);
		tc.countTurn();
		Assert.assertEquals(tc.getChoice(), 1);
		tc.countTurn();
		Assert.assertEquals(tc.getChoice(), 2);
		tc.countTurn();
		// Resets to 0
		Assert.assertEquals(tc.getChoice(), 0);
	}

	@Test
	public void multipleTurnsPerChoiceTest() {
		TurnCounter tc = new TurnCounter(4, 3);
		for (int i = 0; i < 4; i++) {
			Assert.assertEquals(tc.getChoice(), 0);
			tc.countTurn();
		}
		for (int i = 0; i < 4; i++) {
			Assert.assertEquals(tc.getChoice(), 1);
			tc.countTurn();
		}
		for (int i = 0; i < 4; i++) {
			Assert.assertEquals(tc.getChoice(), 2);
			tc.countTurn();
		}
		// Resets to 0
		Assert.assertEquals(tc.getChoice(), 0);
	}
}
