package com.urdomain.test;

import java.util.Scanner;

public class Join {

	String name = null;
	int age = 0;
	String id =null ;
	String pw =null ;
	String email = null;
	boolean result = true;
	String a = null;

	Join(String name, int age, String id,String pw, String email){
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	public boolean process() {	//가입과정이 완벽하면 true
		return result;
	}


	public void run() {
		if(result = true) {
		System.out.println("회원가입이 완료되었습니다.");
		}else
			System.out.println("다시 진행해주세요.");
}
}