package com.bridgelabz.generics;

public class MaxStringUC3 {
	String x,y,z;

	public MaxStringUC3(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println("Given String's are : ");
		System.out.print(x +", ");
		System.out.print(y +", ");
		System.out.print(z +" ");
		System.out.println(" ");
	}
	public void findMax() {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Max String is : "+x);

		} else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			System.out.println("Max String is : "+y);

		} else {
			System.out.println("Max String is : "+z);
		}
	}
	public static void main(String[] args) {
		MaxStringUC3 maxNum = new MaxStringUC3("Apple","Peach","Banana");
		maxNum.print();
		maxNum.findMax();
	}
}
