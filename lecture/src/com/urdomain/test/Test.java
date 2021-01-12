package com.urdomain.test;


public class Test {

	public static void main(String[] args) {
	Test test = new Test();
	int num1 = test.num();
	int num2 = test.num();
	
	while(num1 == num2) {
		num1 = (int)(Math.random()*8+2);
	}//while문 끝 
	test.sys(num1,num2);
	}//main메서드 끝  
	public int num() {
		int a = (int)(Math.random()*8+2);
		return a;
	}
	
	public void sys(int num1, int num2) {
		System.out.println("---- "+ num1 + "단 ----");
		
		for(int i=1;i<=9;i++) {
		System.out.println(num1 + "*" + i + " = " + (num1*i));
		}
		System.out.println("---- "+ num2 + "단 ----");
		
		for(int i=1;i<=9;i++) {
		System.out.println(num2 + "*" + i + " = " + (num2*i));
		}
		}
		}