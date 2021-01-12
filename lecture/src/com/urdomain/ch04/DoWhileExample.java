package com.urdomain.ch04;

import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면  q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String iputString;
		
		do {
			System.out.println(">");
			iputString = scanner.nextLine();
			System.out.println(iputString);
		}while(!iputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
