package com.ruanko;
/*
 * 形状的抽象类
 */
public abstract class Shape {
	protected double Area;//形状的面积
    abstract double calArea();//计算面积的函数
    public Shape() {
		Area= 0;
	}
}