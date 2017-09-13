/*
 * 功能：
 * 打印出所有的命令行参数。
 * 翻译:湖北师范大学极客极客俱乐部
 */
package org.hbnugeek.basics;
public class Echo {
    public static void main(String[] args) {
        int i = 0;                           // 初始化循环变量
        while(i < args.length) {             // 循环知道数组结束
            System.out.print(args[i] + " "); // 打印出每个参数
            i++;                             // 循环变量自增
        }
        System.out.println();                // 终止
    }
}
