/*
 * 功能：
 * 这类没有定义一个main()方法，所以它不是一个完整程序。
 * 它定义了一个有用的方法，我们可以用在其他程序。
 * 翻译:湖北师范大学极客极客俱乐部
 */
package org.hbnugeek.basics;
public class Factorial {
    /** 计算X的阶乘，并且把计算出来的值返回 */
    public static int factorial(int x) {
	if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        int fact = 1;
        for(int i = 2; i <= x; i++)    // 循环
            fact *= i;                 // fact *= i相当于 fact = fact * i;
        return fact;
    }
}
