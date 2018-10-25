package ru.job4j.loop;
/**
*Factrial.
*@author Konstantin Filchenkov (filchenkov86@gmail.com).
*@version $Id$.
*@since 24.10.18.
*/
public class Factorial {
	/** method used for calculation factorial.
	*@param n - number.
	*/
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
