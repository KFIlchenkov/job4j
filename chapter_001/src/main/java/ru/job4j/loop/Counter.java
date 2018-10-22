package ru.job4j.loop;

/**
*Counter.
*@author Konstantin Filchenkov
*@version $Id$.
*@since 16.10.2018
*/

public class Counter {
	
	/**
	*add - sum of even numbers
	 *@return rusult - sum of even number.
	 * @param start - first number.
	 * @param finish - second number.
	*/	
	
	public int add(int start, int finish) {
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
			result += i;	
			}
		}
		return result;
	}
	
}
