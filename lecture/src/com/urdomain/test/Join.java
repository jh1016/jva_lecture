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
	public boolean process() {	//���԰����� �Ϻ��ϸ� true
		return result;
	}


	public void run() {
		if(result = true) {
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		}else
			System.out.println("�ٽ� �������ּ���.");
}
}