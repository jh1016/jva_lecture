package com.urdomain.test;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] log = {"qwer","qwertt"};
		
		String inputId;
		String inputPassword;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���");
		inputId = scanner.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���");
		inputPassword = scanner.nextLine();
		
		if(log[0].equals(inputId) && log[1].equals(inputPassword) ){
				System.out.println("�α����� �Ǿ����ϴ�.");
			}else {
				System.out.println("�α��ο� �����߽��ϴ�.");
			}
		scanner.close();
		}

}


