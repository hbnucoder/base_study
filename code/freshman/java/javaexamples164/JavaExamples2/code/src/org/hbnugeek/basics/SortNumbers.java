/*
 * Copyright (c) 2000 David Flanagan.  All rights reserved.
 * This code is from the book Java Examples in a Nutshell, 2nd Edition.
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * You may study, use, and modify it for any non-commercial purpose.
 * You may distribute it non-commercially as long as you retain this notice.
 * For a commercial use license, or to purchase the book (recommended),
 * visit http://www.davidflanagan.com/javaexamples2.
 */
package org.hbnugeek.basics;

/**
 * This class demonstrates how to sort numbers using a simple algorithm
 * 本类演示如何使用简单算法对数字进行排序
 **/
public class SortNumbers {
	/**
	 * This is a very simple sorting algorithm that is not very efficient when
	 * sorting large numbers of things 这是一个用于小数据排序的计算，不适合大数据
	 **/
	public static void sort(double[] nums) {
		// Loop through each element of the array, sorting as we go.__循环筛选排序
		// Each time through, find the smallest remaining element, and move it
		// 每次筛选，保留最合适的元素，进行移动
		// to the first unsorted position in the array.
		// 逐行筛选排序
		for (int i = 0; i < nums.length; i++) {
			int min = i;
			// holds the index of the smallest element
			// find the smallest one between i and the end of the array
			// 从第i个开始到最后一个，循环寻找最小的元素
			for (int j = i; j < nums.length; j++) {
				if (nums[j] < nums[min])
					min = j;
			}
			// Now swap the smallest one with element i
			// 最小的元素和第i个元素互换值
			// This leaves all elements between 0 and i sorted.
			// 将数组中的所有元素进行重新排序
			double tmp;
			tmp = nums[i];
			nums[i] = nums[min];
			nums[min] = tmp;
		}
	}

	/** This is a simple test program for the algorithm above */
	public static void main(String[] args) {
		double[] nums = new double[10];
		// Create an array to hold numbers__创建新数组对象
		for (int i = 0; i < nums.length; i++)
			// Generate random numbers__
			/*
			 * Java中存在着两种Random函数：一、java.lang.Math.Random;
			 * 调用这个Math.Random()函数能够返回带正号的double值，该值大于等于0.0且小于1.0，
			 * 即取值范围是[0.0,1.0)的左闭右开区间，返回值是一个伪随机选择的数，在该范围内（近似）均匀分布。
			 */
			nums[i] = Math.random() * 100;
		sort(nums); // Sort them__排序
		for (int i = 0; i < nums.length; i++)
			// Print them out__依次打印
			System.out.println(nums[i]);
	}
}
