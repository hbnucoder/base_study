/*
 * 功能
 * 这个程序显示在用户输入值进行阶乘
 * 翻译
 * 湖北师范大学极客俱乐部
 */
package org.hbnugeek.basics;
import java.io.*; // Import all classes in java.io package.  Saves typing.

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
            // Read a line from the user
            String line = in.readLine();
            // If we reach the end-of-file, 
	    // or if the user types "quit", then quit
            if ((line == null) || line.equals("quit")) break;
            // Try to parse the line, and compute and print the factorial
            try { 
                int x = Integer.parseInt(line);
                System.out.println(x + "! = " + Factorial4.factorial(x)); 
            }
            // If anything goes wrong, display a generic error message
            catch(Exception e) { System.out.println("Invalid Input"); }
        }
    }
}
