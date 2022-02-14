package com.bridgelabz.generics;

public class MaxNumberRefactor2<T extends Comparable<T>> {
	T x,y,z;

	public MaxNumberRefactor2(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static <T extends Comparable<T>> void findMax(T x,T y,T z) {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Max : "+x);

		} else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			System.out.println("Max : "+y);

		} else {
			System.out.println("Max : "+z);
		}	
	}
	public void printMax(){
		System.out.println("Given are : ");
		System.out.print(x +" ");
		System.out.print(y +" ");
		System.out.print(z +" ");
		System.out.println(" ");
		MaxNumberRefactor2.findMax(x, y, z);
	}
	public static void main(String[] args) {
		new MaxNumberRefactor2<Integer>(1, 2, 3).printMax();
		new MaxNumberRefactor2<Float>(4f, 5f, 6f).printMax();
		new MaxNumberRefactor2<String>("Apple", "Peach", "Banana").printMax();	
	}
}
