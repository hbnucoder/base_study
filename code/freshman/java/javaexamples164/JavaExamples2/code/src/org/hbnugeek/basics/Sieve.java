/*
 * Copyright (c) 2000 David Flanagan.  All rights reserved.
 * This code is from the book Java Examples in a Nutshell, 2nd Edition.
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * You may study, use, and modify it for any non-commercial purpose.
 * You may distribute it non-commercially as long as you retain this notice.
 * For a commercial use license, or to purchase the book (recommended),
 * visit http://www.davidflanagan.com/javaexamples2.
 */
package org.hbnugeek.basics;

/**
 * This program computes prime numbers using the Sieve of Eratosthenes
 * algorithm: rule out multiples of all lower prime numbers, and anything
 * remaining is a prime. It prints out the largest prime number less than or
 * equal to the supplied command-line argument. 此程序计算素数使用埃拉托色尼筛
 * 算法：排除所有低素数的倍数，以及任何 剩余是素数。它打印出最大素数小于 或等于提供的命令行参数。
 **/
public class Sieve {
	public static void main(String[] args) {
		// We will compute all primes less than the value specified on the
		// command line, or, if no argument, all primes less than 100.
		// 我们将计算小于命令行所指定的值的所有素数
		// 或者，如果没有参数，所有素数小于100。
		int max = 100;
		// Assign a default value
		try {
			max = Integer.parseInt(args[0]);
		}
		// Parse user-supplied arg
		catch (Exception e) {
		}
		// Silently ignore exceptions.忽略异常

		// Create an array that specifies whether each number is prime or not.
		// 创建数组判断是否为素数
		boolean[] isprime = new boolean[max + 1];

		// Assume that all numbers are primes, until proven
		// otherwise.假设所有数字都是素数，一次验证
		for (int i = 0; i <= max; i++)
			isprime[i] = true;

		// However, we know that 0 and 1 are not primes. Make a note of it.
		// 我们知道0和1是素数，我们赋予初始值
		isprime[0] = isprime[1] = false;

		// To compute all primes less than max, we need to rule out
		// multiples of all integers less than the square root of max.
		// 要计算小于素数的所有素数，我们需要排除
		// 所有整数的倍数小于最大平方根
		int n = (int) Math.ceil(Math.sqrt(max)); // See java.lang.Math class
		// 详见java.lang.Math类

		// Now, for each integer i from 0 to n:
		// If i is a prime, then none of its multiples are primes,
		// so indicate this in the array. If i is not a prime, then
		// its multiples have already been ruled out by one of the
		// prime factors of i, so we can skip this case.
		// 现在，对于每个整数我从0到n：
		// 如果我是素数，那么它的倍数不是素数，
		// 因此，在数组中显示此。
		// 如果我不是素数，那么它的倍数已被排除的一个
		// 我的主要因素，所以我们可以跳过这种情况。
		for (int i = 0; i <= n; i++) {
			if (isprime[i])
				// If i is a prime, 如果是素数
				for (int j = 2 * i; j <= max; j = j + i)
					// loop through multiples循环计算两倍到我数字
					isprime[j] = false;
			// they are not prime.它们不是素数
		}

		// Now go look for the largest prime:去寻找最大的素数
		int largest;
		for (largest = max; !isprime[largest]; largest--)
			;
		// empty loop body空循环体

		// Output the result打印结果
		System.out.println("The largest prime less than or equal to " + max
				+ " is " + largest);
	}
}
