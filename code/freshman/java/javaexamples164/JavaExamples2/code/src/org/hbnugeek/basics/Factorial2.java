/*
 * 功能：
 * 这类显示一个计算阶乘的递归方法。此方法根据公式反复调用自身：n！= N *（n-1）！
 * 翻译:湖北师范大学极客极客俱乐部
 */
package org.hbnugeek.basics;
public class Factorial2 {
    public static long factorial(long x) {
	if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        if (x <= 1) return 1;              // 当x<=1 的时候递归停止
        else return x * factorial(x-1);    // 递归的调用本身
    }
}
