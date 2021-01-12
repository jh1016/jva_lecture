package com.urdomain.test;

import java.util.Scanner;

public class FindId {
	public static void main(String[]args) {
	String[] user = {"kjh","qwer","qwer@naver.com"};
	String inputName;
	String inputEmail;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("이름을 입력하세요");
	inputName= scanner.nextLine();
	
	System.out.println("email를 입력하세요");
	inputEmail=scanner.nextLine();

	
	
	if(user[2].equals(inputEmail) && user[0].equals(inputName)) {
			System.out.println("당신의 id는 '" + user[1].charAt(0)+"**"+user[1].charAt(3) + "' 입니다."); 
		}else {
			System.out.println("ID찾기에 실패했습니다.");
		
	}
	scanner.close();
	}
}