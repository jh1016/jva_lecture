package com.urdomain.ch06;
//p.232
public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalcu.areRectangle(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalcu.areRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢���� ����=" + result1);
		System.out.println("���簢���� ����=" + result2);
	}
}
