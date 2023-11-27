package com.ncut;

public class MyProgram {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		DataCollection input = new DataCollection();
		input.x = 100;
		myCar1.calAdd(input);
		System.out.println(input.x);
	}
}
