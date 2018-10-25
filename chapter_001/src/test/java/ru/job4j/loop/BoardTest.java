package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *BoardTest.
 *@author Konstantin Filchenkov (filchenkov86@gmail.com).
 *@version $Id$.
 *@since 24.10.18.
 */
public class BoardTest {
	/**
	 * method to test board tree to tree.
	 */
	@Test
	public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringsWithTreeColsAndTreeRows() {
		Board board = new Board();
		String result = board.paint(3, 3);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x%s x %sx x%s", line, line, line);
		assertThat(result, is(expected));
	}

	/**
	 * method to test board four to five.
	 */
	@Test
	public void whenPaintBoardWithWidthFiveAndHeightFourThenStringsWithFiveColsAndFourRows() {
		Board board = new Board();
		String result = board.paint(5, 4);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
		assertThat(result, is(expected));
	}
}