package com.bridgelabz.generics;

public class MaxNumberUC2 {
	Float  x,y,z;

	public MaxNumberUC2(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println("Given Float Value's are : ");
		System.out.print(x +" ");
		System.out.print(y +" ");
		System.out.print(z +" ");
		System.out.println(" ");
	}
	public void findMax() {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Max Number is :"+x);

		} else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			System.out.println("Max Number is :"+y);

		} else {
			System.out.println("Max Number is :"+z);
		}
	}
	public static void main(String[] args) {
		MaxNumberUC2 maxNum = new MaxNumberUC2(1f, 2f, 3f);
		maxNum.print();
		maxNum.findMax();
	}
}
