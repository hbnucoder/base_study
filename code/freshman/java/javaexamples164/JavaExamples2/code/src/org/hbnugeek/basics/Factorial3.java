package org.hbnugeek.basics;

public class Factorial3 {
    // 计算方法3 
	static long[] table = new long[21];
    // 新建静态数组，含有21个元素
    static { table[0] = 1; }  
    // 初始值为一
    // 璇疯浣忔暟缁勪腑鍒濆鍖栫殑鏈�珮鍊�    
    static int last = 0;

    public static long factorial(int x) throws IllegalArgumentException {
        // 妫�煡X鏄惁澶ぇ鎴栧お灏忋�濡傛灉杩欐牱鎶涘嚭寮傚父銆�
        if (x >= table.length)   // ".length" 鏄繑鍥炴暟缁勭殑闀垮害
            throw new IllegalArgumentException("Overflow; x is too large.");
        if (x<0) throw new IllegalArgumentException("x must be non-negative.");

        // 璁＄畻鍜屽瓨鍌ㄦ病鏈夎瀛樺偍杩囧緱鍊�
        while(last < x) {
            table[last + 1] = table[last] * (last + 1);
            last++;
        }
        // 杩斿洖X鐨勬瘡涓�釜缂撳瓨涓嬫潵.
        return table[x];
    }
}
