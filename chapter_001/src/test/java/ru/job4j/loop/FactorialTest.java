package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is; 
import static org.junit.Assert.assertThat;

/**
*FactorialTest for test counter.
*@author Konstantin Filchenkov.
*@version $Id$.
*@since 21.10.18.
*/
public class FactorialTest {
	/**
	*method whenOneToFiveWhenOnehandredTwenty to test factorial.
	*/
	@Test
	public void whenOneToFiveWhenOnehandredTwenty() {
	Factorial factorial = new Factorial();
	int result = factorial.calc(5);
	assertThat(result, is(120));
	}	
}
