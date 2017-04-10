/*
 * 功能：
 * 这个程序打印斐波那契数列中的前20个数字
 * 翻译
 * 湖北师范大学极客俱乐部
 */
package org.hbnugeek.basics;

public class Fibonacci {
    public static void main(String[] args) {
	int n0 = 1, n1 = 1, n2;          // 初始化变量
	System.out.print(n0 + " " +      // 答应第一和第二个变量
			 n1 + " ");      

        for(int i = 0; i < 18; i++) {    // 进入循环
            n2 = n1 + n0;                // 下一个Item是前两个Item之和
            System.out.print(n2 + " ");  // 打印出这次Item的值
	    n0 = n1;                     // 第一个值变成第二个值
	    n1 = n2;                     // 当前的值变成第一个值
        }
        System.out.println();            // 系统结束
    }
}
