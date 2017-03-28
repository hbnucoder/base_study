package org.hbnugeek;
/*
 * 矩形类
 */
public class Rectangle extends Shape {
	double width;//矩形的长
	double height;//矩形的高
	/*
	 * 无参构造函数
	 */
	public Rectangle()
	{
		super();
		width= 0;
		height = 0;
	}
	/*
	 * 有参构造函数
	 * width:长 
	 * height:高
	 */
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		super();
		this.width = width;
		this.height = height;
		
	}
	/*
	 *设置矩形长与高
	 *width:长
	 *height:高
	 */
	public void setParam(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	@Override
	double calArea() {
		// TODO Auto-generated method stub
		Area = width*height;
		return Area;
	}
	
	
}
