﻿/*
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
 * This program echos the command-line arguments backwards.
 * 
 **/
public class Reverse {
	public static void main(String[] args) {
		// Loop backwards through the array of arguments
		// 倒着循环输出
		for (int i = args.length - 1; i >= 0; i--) {
			// Loop backwards through the characters in each argument
			// 反向循环输出元素
			for (int j = args[i].length() - 1; j >= 0; j--) {
				// Print out character j of argument i.
				// 依次打印
				System.out.print(args[i].charAt(j));
			}
			System.out.print(" ");
			// Add a space at the end of each argument.
			//循环结束时候输出空格
		}
		System.out.println();
		// And terminate the line when we're done.
		//运行结束输出空行作为分界
	}
}