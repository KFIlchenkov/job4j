package ru.job4j.loop;

/**
 *@author Konstatin Filchenkov (filchenkov86@gmail.com).
 *@version $ID$
 *@since 25.10.18
 */

public class Paint {
	public String rightTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}

	public String leftTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= weight - column - 1) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}

	public String piramid(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = 2 * height - 1;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= height - column - 1 && row + height - 1 >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
}