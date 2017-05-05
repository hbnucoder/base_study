/*
 * Copyright (c) 2000 David Flanagan.  All rights reserved.
 *@ David Flanagan版权所有
 * This code is from the book Java Examples in a Nutshell, 2nd Edition.
 * 此代码来源于果壳第二版的JAVA示例
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * 该代码提供AS_IS，没有任何表示或暗示的保证
 * You may study, use, and modify it for any non-commercial purpose.
 * 你可以用于学习、使用、模仿、用作任何非商业目的
 * You may distribute it non-commercially as long as you retain this notice.
 * 只要你记住了这则申明，你就可以将它利用于非商业用途
 * For a commercial use license, or to purchase the book (recommended),
 * 如果你想要用于商业用途必须认证或者购买该书（推荐）
 * visit http://www.davidflanagan.com/javaexamples2.
 * 详情见 http://www.davidflanagan.com/javaexamples2
 */
package org.hbnugeek.basics;

import java.io.*; // We're doing input, so import I/O classes
//--导入java.io包里的所有类

/**
 * This program reads lines of text from the user, encodes them using the
 * trivial "Rot13" substitution cipher, and then prints out the encoded lines.
 * 该程序先从用户处读取输入字符串，进行编码，替换，然后打印出被编码后的字符串。
 **/
public class Rot13Input {
	public static void main(String[] args) throws IOException {
		// Get set up to read lines of text from the user
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (;;) { // Loop forever--无限循环
			System.out.print("> "); // Print a prompt--打印符号
			String line = in.readLine(); // Read a line--读取行
			if ((line == null) || line.equals("quit")) // If EOF or
														// "quit"...--如果行为空或者行的内容是"quit"（退出）
				break; // ...break out of loop--跳出循环
			StringBuffer buf = new StringBuffer(line); // Use a
														// StringBuffer--创建新的StringBuffer对象
			/*
			 * 注意： 1.如果要操作少量的数据用 = String 2.单线程操作字符串缓冲区 下操作大量数据 = StringBuilder
			 * 3.多线程操作字符串缓冲区 下操作大量数据 = StringBuffer
			 */
			for (int i = 0; i < buf.length(); i++)
				// For each character...--循环检测
				buf.setCharAt(i, rot13(buf.charAt(i)));// ..read, encode,
														// store--读取，编码，储存
			System.out.println(buf); // Print encoded line--打印已编码字符串
		}
	}

	/**
	 * This method performs the Rot13 substitution cipher. It "rotates" each
	 * letter 13 places through the alphabet. Since the Latin alphabet has 26
	 * letters, this method both encodes and decodes.
	 * 该方法用于替换字母。字母在此处将会被替换。26个拉丁字母的大小写听过此方法都可以被编码和解码
	 **/
	public static char rot13(char c) {
		if ((c >= 'A') && (c <= 'Z')) {
			// For uppercase letters
			// --如果是A~Z的大写字母
			c += 13;
			// Rotate forward 13
			// --向后推进13位
			if (c > 'Z')
				c -= 26;
			// And subtract 26 if necessary
			// --如果是大于Z的字母，则向前退26位
		}
		if ((c >= 'a') && (c <= 'z')) {
			// Do the same for lowercase letters
			// --小写字母同理
			c += 13;
			if (c > 'z')
				c -= 26;
		}
		return c;
		// Return the modified letter
		// --返回被修改的字母
	}
}
