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
		System.out.println("당신이 좋아하는 게임은 어떤 유형인가요?");
		System.out.println("1.RPG 2.퀴즈 3.스포츠 4.시뮬레이션 5.액션 6.음악 7.기타");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int result = sc.nextInt();
		return result;
	}
	public int sex() {
		System.out.println("당신의 성별은 무엇입니까?");
		System.out.println("1.남자 2.여자");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int result = sc.nextInt();
		return result;
	}
	public int gameAge() {
		System.out.println("당신은 어느 연령대에 속합니까?");
		System.out.println("1.10대이하 2.20대 3.30대 4.40대 5.60대 7.60대 이상");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int result = sc.nextInt();
		return result;
	}

}

