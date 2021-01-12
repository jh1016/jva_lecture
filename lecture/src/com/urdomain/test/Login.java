package com.urdomain.test;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] log = {"qwer","qwertt"};
		
		String inputId;
		String inputPassword;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		inputId = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하세요");
		inputPassword = scanner.nextLine();
		
		if(log[0].equals(inputId) && log[1].equals(inputPassword) ){
				System.out.println("로그인이 되었습니다.");
			}else {
				System.out.println("로그인에 실패했습니다.");
			}
		scanner.close();
		}

}


