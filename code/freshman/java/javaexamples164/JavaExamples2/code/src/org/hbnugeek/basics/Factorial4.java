package org.hbnugeek.basics;

/*
 * 
 * 功能：
 * 这个版本的程序使用任意精度的整数，它可以计算无限大的值，没有上限。
 * 它使用一个ArrayList对象缓存的计算值，而不是一个固定大小的数组。
 * ArrayList是数组，但可以长到任何尺寸。
 * factorial()方法被声明为“同步”
 * 它可以在多线程程序中安全使用。
 * 看了java.math.biginteger和java.util.arraylist在研究这类。java 1.2之前，使用Vector代替ArrayList
 * 翻译：
 * 湖北师范大学极客俱乐部
 */
//在这个例子中导入一些其他类。
// 一旦导入一个类，我们就不必输入它的全名。
import java.math.BigInteger;  // 导入java.math.BigInteger类
import java.util.*;  // 导入所有java.util的类


public class Factorial4 {
    protected static ArrayList table = new ArrayList(); // 创建缓存
    static { // 初始化缓存的第一个元素!0 = 1.
	table.add(BigInteger.valueOf(1));
    }

    /** factorial() 这个方法, 使用 BigIntegers这个类存放 ArrayList */
    public static synchronized BigInteger factorial(int x) {
        if (x<0) throw new IllegalArgumentException("x must be non-negative.");
        for(int size = table.size(); size <= x; size++) {
            BigInteger lastfact = (BigInteger)table.get(size-1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return (BigInteger) table.get(x);
    }

    /*
     * 一个简单的main()方法，我们可以使用作为一个独立的测试程序
	 *  我们factorial()方法。
     *
     * */
     
    public static void main(String[] args) {
        for(int i = 0; i <= 50; i++)
	    System.out.println(i + "! = " + factorial(i));
    }
}
