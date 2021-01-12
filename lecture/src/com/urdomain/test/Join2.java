package com.urdomain.test;

import java.util.Scanner;

public class Join2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
//		Join join = new Join();

		System.out.println("회원가입 하시겠습니까?");
		System.out.println("1.예 2.아니오");
		System.out.print(">");
		int menu = sc.nextInt();
//		if(menu == 1) {
//				System.out.println(join.memberId());
//				System.out.println(join.memberPw());
//				System.out.println(join.memberName());
//				System.out.println(join.memberAge());
//			}else {
//				System.out.println("프로그램 종료합니다.");
		}	public String memberId() {
			Scanner sc = new Scanner(System.in);
			System.out.println("id를 입력하세요.");
			String getId = sc.nextLine();
			return getId;
		}
		public String memberPw() {
			Scanner sc = new Scanner(System.in);
			System.out.println("pw를 입력하세요.");
			String getPw = sc.nextLine();
			return getPw;
		}

		public String memberName() {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요.");
			String getName = sc.nextLine();
			return getName;
		}
		public int memberAge() {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요.");
			int getAge = sc.nextInt();
			sc.close();
			return getAge;
		}
	


}
