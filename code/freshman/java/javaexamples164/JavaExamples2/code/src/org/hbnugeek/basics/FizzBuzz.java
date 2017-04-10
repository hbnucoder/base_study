
package org.hbnugeek.basics;

/*功能
 * 这个程序是一个游戏，游戏规则就是从1数到100，当数到能够被5整除时就显示单词“fizz"
 * 当数到能被7整除的时候就显示"buzz"
 * 当数到既能被5整除也能被7整除的时候显示“Fizzbuzz"
 * 其他的情况就直接输出当前的数字
 * 翻译
 * 湖北师范大学极客俱乐部
 */
public class FizzBuzz {                      // 所有的对象都是类
    public static void main(String[] args) { // 每一个程序都必须要一个main()的入口点
        for(int i = 1; i <= 100; i++) {           // 计数开始从1到100进行循环
            if (((i % 5) == 0)&& ((i % 7) == 0))  // 当数能被5和7同时整除
                System.out.print("fizzbuzz");    
            else if ((i % 5) == 0)                // 当数只能被5整除的时候
		System.out.print("fizz"); 
            else if ((i % 7) == 0)                // 当数只能被7整除的时候
		System.out.print("buzz"); 
            else System.out.print(i);             // 不能同时被5和7整除的情况
            System.out.print(" ");                
        }
        System.out.println();
    }
}
