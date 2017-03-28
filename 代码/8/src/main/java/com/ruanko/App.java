package com.ruanko;
public class App {
//	private static Scanner input;
	public static void main(String[] args) {
		
		Shape[] s = new Shape[2];
        // 将矩形、圆形放入数组中
        s[0] = new Rectangle(5, 6);
        s[1] = new Circle(2);
 
        // 输出面积
        System.out.println("矩形的面积是：" + s[0].calArea());
        System.out.println("圆形的面积是：" + s[1].calArea());
	}
}


