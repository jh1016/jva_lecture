package com.urdomain.ch11;


public class StringIndexOfExample {

public static void nain(String[] args) {
	String subject = "�ڹ� ���α׷�";
	
	int location= subject.indexOf("���α׷���");
	System.out.println(location);
	
	if(subject.indexOf("�ڹ�") != -1) {
		System.out.println("�ڹٿ� ���õ� å�̱���");
	}else {
		System.out.println("�ڹٿ� ���þ��� å�̱���");
	}
	
	}
}