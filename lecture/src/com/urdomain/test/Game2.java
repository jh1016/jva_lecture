package com.urdomain.test;

import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		Game2 game = new Game2();
		int a = game.gameKind();
	}
	
	int age =0;
	String kind =null;
	String sex =null;

	
	public int gameKind() {
		System.out.println("����� �����ϴ� ������ � �����ΰ���?");
		System.out.println("1.RPG 2.���� 3.������ 4.�ùķ��̼� 5.�׼� 6.���� 7.��Ÿ");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int result = sc.nextInt();
		return result;
	}
	public int sex() {
		System.out.println("����� ������ �����Դϱ�?");
		System.out.println("1.���� 2.����");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int result = sc.nextInt();
		return result;
	}
	public int gameAge() {
		System.out.println("����� ��� ���ɴ뿡 ���մϱ�?");
		System.out.println("1.10������ 2.20�� 3.30�� 4.40�� 5.60�� 7.60�� �̻�");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int result = sc.nextInt();
		return result;
	}

}

