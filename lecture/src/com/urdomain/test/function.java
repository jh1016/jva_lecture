package com.urdomain.test;

import java.util.Scanner;

public class function {
	private static String id;
	private static String pw;

	public static String loginId(String id) {
		return id ;
		
	}
	public static String loginPw(String pw) {
		return pw;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scId;
		String scPw;
		
		System.out.println("ID�� �Է��ϼ���");
		scId = sc.nextLine();
		
		System.out.println("PW�� �Է��ϼ���");
		scPw = sc.nextLine();
		
		if(scId == loginId(id) && scPw == loginPw(pw)) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
	}
}
