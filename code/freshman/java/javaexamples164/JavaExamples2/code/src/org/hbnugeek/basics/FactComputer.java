/*
 * 功能：
 * 计算并显示命令行上指定的数的阶乘。它处理可能的用户输入错误与尝试/捕获。
 * 翻译:湖北师范大学极客极客俱乐部
 */
package org.hbnugeek.basics;

public class FactComputer {
	public static void main(String[] args) {
		// 计算阶乘
		// 如果出现异常，请按下面的catch条款处理。
		try {
			// args如果为NULL，就会抛出ArrayIndexOutOfBoundsException异常
			int x = Integer.parseInt(args[0]);
			System.out.println(x + "! = " + Factorial4.factorial(x));
		}
		// 用户没有输入参数
		// 如果 args[0]没有定义或为空，就会抛出异常，.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You must specify an argument");
			System.out.println("Usage: java FactComputer <number>");
		}
		// 参数不是数字。被Integer.parseInt抛出异常。
		catch (NumberFormatException e) {
			System.out.println("The argument you specify must be an integer");
		}
		// 参数小于0. Factorial4.factorial()抛出异常
		catch (IllegalArgumentException e) {
			// 显示factorial()这个方法抛出来的信息
			System.out.println("Bad argument: " + e.getMessage());
		}
	}
}
