/*
 * 功能
 * 这个程序显示在用户输入值进行阶乘
 * 翻译
 * 湖北师范大学极客俱乐部
 */
package org.hbnugeek.basics;
import java.io.*; // 导入java.io里面的所有类

/**
 * This program displays factorials as the user enters values interactively
 **/
public class FactQuoter {
    public static void main(String[] args) throws IOException {
        // 定义一个存储用户输入信息的缓存
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        // 一直做循环
        for(;;) {
            // 显示提示信息
            System.out.print("FactQuoter> ");
            // 读取用户输入信息
            String line = in.readLine();
            // 如果达到文件的尾或者用户直到输入"quit" 	    
            if ((line == null) || line.equals("quit")) break;
            // 解析用户输入信息，并计算和打印阶乘
            try { 
                int x = Integer.parseInt(line);
                System.out.println(x + "! = " + Factorial4.factorial(x)); 
            }
            // 如果出现异常，就显示错误信息
            catch(Exception e) { System.out.println("Invalid Input"); }
        }
    }
}
