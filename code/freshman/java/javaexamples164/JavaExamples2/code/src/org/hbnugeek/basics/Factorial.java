package org.hbnugeek.basics;//打包语句

public class Factorial {
	/**
	 * 用于检测输入值是否符合要求，并且抛出提示
	 *  */
	public static int factorial(int x) {
		if (x < 0)
			throw new IllegalArgumentException("x must be >= 0");
		int fact = 1;
		for (int i = 2; i <= x; i++)
			fact *= i; // fact *= i相当于fact = fact * i;
		return fact;
	}
}
