package com.urdomain.test;

import java.util.Scanner;

public class Join2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
//		Join join = new Join();

		System.out.println("ȸ������ �Ͻðڽ��ϱ�?");
		System.out.println("1.�� 2.�ƴϿ�");
		System.out.print(">");
		int menu = sc.nextInt();
//		if(menu == 1) {
//				System.out.println(join.memberId());
//				System.out.println(join.memberPw());
//				System.out.println(join.memberName());
//				System.out.println(join.memberAge());
//			}else {
//				System.out.println("���α׷� �����մϴ�.");
		}	public String memberId() {
			Scanner sc = new Scanner(System.in);
			System.out.println("id�� �Է��ϼ���.");
			String getId = sc.nextLine();
			return getId;
		}
		public String memberPw() {
			Scanner sc = new Scanner(System.in);
			System.out.println("pw�� �Է��ϼ���.");
			String getPw = sc.nextLine();
			return getPw;
		}

		public String memberName() {
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸��� �Է��ϼ���.");
			String getName = sc.nextLine();
			return getName;
		}
		public int memberAge() {
			Scanner sc = new Scanner(System.in);
			System.out.println("���̸� �Է��ϼ���.");
			int getAge = sc.nextInt();
			sc.close();
			return getAge;
		}
	


}
