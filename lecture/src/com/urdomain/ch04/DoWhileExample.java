package com.urdomain.ch04;

import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ���  q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String iputString;
		
		do {
			System.out.println(">");
			iputString = scanner.nextLine();
			System.out.println(iputString);
		}while(!iputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		
	}

}
