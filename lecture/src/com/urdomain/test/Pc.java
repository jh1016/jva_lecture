package com.urdomain.test;

import java.util.Scanner;

public class Pc {
	char arr;
	char alphabet;
	int menu;
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	char arr[][]= {
			{'��','��','��','��'},
			{'��','��','��','��'},
			{'��','��','��','��'}};
	
	char[] alphabet = {'A','B','C'};
	System.out.println("<�ڸ� ���� ���α׷�>");
	while(true) {
		
		System.out.println("1.���� 2.���� ��� 3.����");
		System.out.print(">");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("�ڸ��� ������ �ּ���.");
			System.out.println(("A~C)(1~4)EX) A3"));
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.print(">");
			String str1 = sc.next();
			char[] a = new char[str1.length()];
			int row,column;
			
			for(int i=0;i<a.length;i++) {
				a[i] = str1.charAt(i);
				if(a[0] == alphabet[i]) {
					row =i;
				}
				row = (int)a[0] - 'A';
				column = (int)a[1] - '0';
				a[0] = (char) row;
				a[1] = (char)column;
				if((column <0 || column>3) || (row <0 || row >3)) {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}else {
					if(arr[row][column] == '��') {
						arr[row][column] = '��';
						System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
					}else {
						System.out.println("�̹� ����� �ڸ��Դϴ�.");
					}
				}
			}
				break;
				case 2:
					System.out.println("�ּ��� �ڸ��� ������ �ּ���");
					System.out.println(("A~C)(1~4)EX) A3"));
					for(int i=0;i<arr.length;i++) {
						for(int j=0;j<arr[i].length;j++) {
							System.out.println(arr[i][j]);
						}
						System.out.println();
			}
					System.out.print(">");
					String str2 = sc.next();
					char[] b = new char[str2.length()];
					
					for(int i=0; i<b.length; i++){
						b[i] = str2.charAt(i);
						if(b[0] == alphabet[i]) {
							row = i;
						}
					row = (int)b[0] - 'A';
					column = (int)b[1] - '0';
					b[0] = (char)row;
					b[1] = (char)column;
					if((column <0 && column>3) || (row <0 && row >3)) {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}else {
					if(arr[row][column] == '��') {
						System.out.println("������ �ȵ� �ڸ��Դϴ�.");
				}else if(arr[row][column] == '��'){
					arr[row][column] = '��';
					System.out.println("���� ����߽��ϴ�.");
				}
				}
				}
				break;
				case 3:
				System.out.println("���α׷� �����մϴ�.");
				System.exit(0);
				default:System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				break;
}
}
}
}
