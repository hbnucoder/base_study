package org.hbnugeek.basics;
/*
 * 功能：
 * 打印出X阶乘每个阶乘的值，X的值值不能大于20
 * 翻译:湖北师范大学极客极客俱乐部
 */
public class Factorial3 {
    // 创建一个数组以缓存值0！
    static long[] table = new long[21];
    // “静态初始化器”：初始化数组中的第一个值
    static { table[0] = 1; }  // 0的阶层为1
    // 请记住数组中初始化的最高值
    static int last = 0;

    public static long factorial(int x) throws IllegalArgumentException {
        // 检查X是否太大或太小。如果这样抛出异常。.
        if (x >= table.length)   // ".length" 是返回数组的长度
            throw new IllegalArgumentException("Overflow; x is too large.");
        if (x<0) throw new IllegalArgumentException("x must be non-negative.");

        // 计算和存储没有被存储过得值.
        while(last < x) {
            table[last + 1] = table[last] * (last + 1);
            last++;
        }
        // 返回X的每一个缓存下来.
        return table[x];
    }
}
