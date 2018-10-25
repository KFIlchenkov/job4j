package ru.job4j.loop;
/**
 *Board.
 *@author Konstantin Filchenkov (filchenkov86@gmail.com).
 *@version $Id$.
 *@since 24.10.18.
 */
public class Board {
	/**
	 *method paint used for paint chess board.
	 *@author Konstantin Filchenkov (filchenkov86@gmail.com).
	 *@param width - width of screen items.
	 *@param height - height of screen items.
	 */
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((j + i) % 2 == 0) {
					screen.append("x");
				} else {
					screen.append(" ");
				}
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}