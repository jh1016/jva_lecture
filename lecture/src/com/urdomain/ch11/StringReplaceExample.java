package com.urdomain.ch11;

public class StringReplaceExample {

public static void nain(String[] args) {
	String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
	String newStr = oldStr.replace("�ڹ�", "JAVA");
	System.out.println(oldStr);
	System.out.println(newStr);
	
	}
}