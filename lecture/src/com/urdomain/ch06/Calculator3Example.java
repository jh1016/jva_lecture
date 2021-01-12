package com.urdomain.ch06;
//p.232
public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
	}
}
