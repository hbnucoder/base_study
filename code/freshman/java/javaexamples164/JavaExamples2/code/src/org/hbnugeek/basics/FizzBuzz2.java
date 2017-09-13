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
 * This class is much like the FizzBuzz class, but uses a switch statement
 * instead of repeated if/else statements
 * 该类类似FizzBuzz类，但是用了swich_case语句，而不是if/else语句
 **/
public class FizzBuzz2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // count from 1 to 100__从1循环到100
			switch (i % 35) { // What's the remainder when divided by
								// 35?用i除以35取余为条件
			case 0: // For multiples of 35...刚好除尽
				System.out.print("fizzbuzz "); // print "fizzbuzz".打印 "fizzbuzz"
				break; // Don't forget this statement!不要忘记跳出switch,case结构
			case 5:
			case 10:
			case 15: // If the remainder is any of these
			case 20:
			case 25:
			case 30: // then the number is a multiple of 5余数是5的倍数
				System.out.print("fizz "); // so print "fizz".打印"fizz"
				break;
			case 7:
			case 14:
			case 21:
			case 28: // For any multiple of 7...当余数为7的倍数
				System.out.print("buzz "); // print "buzz".打印"buzz"
				break;
			default: // For any other number...不满足上面几种情况的
				System.out.print(i + " "); // print the number.打印出该数字
				break;
			}
		}
		System.out.println();
	}
}
