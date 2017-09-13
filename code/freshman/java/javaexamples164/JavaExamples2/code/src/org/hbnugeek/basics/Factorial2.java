/*
 * 鍔熻兘锛� * 杩欑被鏄剧ず涓�釜璁＄畻闃朵箻鐨勯�褰掓柟娉曘�姝ゆ柟娉曟牴鎹叕寮忓弽澶嶈皟鐢ㄨ嚜韬細n锛� N *锛坣-1锛夛紒
 * 缈昏瘧:婀栧寳甯堣寖澶у鏋佸鏋佸淇变箰閮� */
package org.hbnugeek.basics;
public class Factorial2 {
    public static long factorial(long x) {
	if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        if (x <= 1) return 1;              // 褰搙<=1 鐨勬椂鍊欓�褰掑仠姝�       
        else return x * factorial(x-1);    // 閫掑綊鐨勮皟鐢ㄦ湰韬�    
        }
}
