package com.urdomain.test;

import java.util.Scanner;

public class FindId {
	public static void main(String[]args) {
	String[] user = {"kjh","qwer","qwer@naver.com"};
	String inputName;
	String inputEmail;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("�̸��� �Է��ϼ���");
	inputName= scanner.nextLine();
	
	System.out.println("email�� �Է��ϼ���");
	inputEmail=scanner.nextLine();

	
	
	if(user[2].equals(inputEmail) && user[0].equals(inputName)) {
			System.out.println("����� id�� '" + user[1].charAt(0)+"**"+user[1].charAt(3) + "' �Դϴ�."); 
		}else {
			System.out.println("IDã�⿡ �����߽��ϴ�.");
		
	}
	scanner.close();
	}
}