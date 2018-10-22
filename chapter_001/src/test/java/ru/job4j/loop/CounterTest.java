package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Counter.
*@author Konstantin Filchenkov
*@version $Id$.
*@since 16.10.2018
*/

public class CounterTest {
	
	/**
	*Test
	*/
	
	@Test
	public void whenOneToTenThenThirty() {
	Counter count = new Counter();
	int result = count.add(1, 10);
	assertThat(result, is(30));
	}
}