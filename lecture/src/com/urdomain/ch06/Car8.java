package com.urdomain.ch06;
//p.242
public class Car8 {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car8 myCar = new Car8();
		myCar.speed = 60;
		myCar.run();
	}
}