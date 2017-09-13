package org.hbnugeek;
import java.lang.Math;
/*
 * 圆形类
 */
public class Circle extends Shape {
	protected double r;//圆形的半径
	/*
	 * 无参构造函数
	 */
	public Circle() {
		super();
	}
	/*
	 * 有参构造函数
	 * r:圆形半径
	 */
	public Circle(double r) {
		// TODO Auto-generated method stub
		super();
		this.r = r;
	}
	public void setParam(double r)
	{
		this.r = r;
	}
	@Override
	double calArea() {
		Area = Math.PI *r*r;
		return Area;
	}
	
}