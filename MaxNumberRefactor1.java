package com.bridgelabz.generics;

public class MaxNumberRefactor1<T extends Comparable<T>> {
	T x,y,z;

	public MaxNumberRefactor1(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println("Given are : ");
		System.out.print(x +" ");
		System.out.print(y +" ");
		System.out.print(z +" ");
		System.out.println(" ");
	}
	public void findMax() {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Max : "+x);

		} else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			System.out.println("Max : "+y);

		} else {
			System.out.println("Max : "+z);
		}
	}
	public static void main(String[] args) {
		MaxNumberRefactor1<Integer> maxNum = new MaxNumberRefactor1<>(1, 2, 3);
		maxNum.print();
		maxNum.findMax();
		MaxNumberRefactor1<Float> maxNum1 = new MaxNumberRefactor1<>(4f, 5f, 6f);
		maxNum1.print();
		maxNum1.findMax();
		MaxNumberRefactor1<String> maxNum2 = new MaxNumberRefactor1<>("Apple", "Peach", "Banana");
		maxNum2.print();
		maxNum2.findMax();
	}
}