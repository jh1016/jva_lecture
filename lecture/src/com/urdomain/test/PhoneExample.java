package com.urdomain.test;

public class PhoneExample {
	public static void main(String[] args) {
		Phone ph = new Phone();
		int num = 1;	//���� Ȯ��
		int a = 0;		
		ph.model = "SAMSUNG";
		ph.battery = 95;
		a = ph.onOff(num);
		ph.first(a);
		
		
	}
}
