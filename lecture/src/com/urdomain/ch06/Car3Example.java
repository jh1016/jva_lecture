package com.urdomain.ch06;

public class Car3Example {

	public static void main(String[] args) {
		Car3 car1 = new Car3();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("�ڰ���");
		System.out.println("Car2.company : " + car2.company);
		System.out.println("Car2.model : " + car2.model);
		
		Car3 car3 = new Car3("�ڰ���", "����");
		System.out.println("Car3.company : " + car3.company);
		System.out.println("Car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car3 car4 = new Car3("�ý�","����",200);
		System.out.println("Car4.company : " + car4.company);
		System.out.println("Car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
