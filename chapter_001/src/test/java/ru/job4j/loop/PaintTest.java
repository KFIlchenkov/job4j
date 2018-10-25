package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 *@author Konstatin Filchenkov (filchenkov86@gmail.com).
 *@version $ID$
 *@since 25.10.18
 */

public class PaintTest {
	@Test
	public void whenPyramid4Right() {
		Paint paint = new Paint();
		String rst = paint.rightTrl(4);
		System.out.println(rst);
		assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("^   ")
				.add("^^  ")
				.add("^^^ ")
				.add("^^^^")
				.toString()
		));
	}

	@Test
	public void whenPyramid4Left() {
		Paint paint = new Paint();
		String rst = paint.leftTrl(4);
		System.out.println(rst);
		assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^")
				.add("  ^^")
				.add(" ^^^")
				.add("^^^^")
				.toString()
		));
	}

	@Test
	public void whenPyramid4Pyramid() {
		Paint paint = new Paint();
		String rst = paint.piramid(4);
		System.out.println(rst);
		assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^   ")
				.add("  ^^^  ")
				.add(" ^^^^^ ")
				.add("^^^^^^^")
				.toString()
		));
	}
}

