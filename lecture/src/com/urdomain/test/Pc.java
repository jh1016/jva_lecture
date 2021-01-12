package com.urdomain.test;

import java.util.Scanner;

public class Pc {
	char arr;
	char alphabet;
	int menu;
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	char arr[][]= {
			{'□','□','□','□'},
			{'□','□','□','□'},
			{'□','□','□','□'}};
	
	char[] alphabet = {'A','B','C'};
	System.out.println("<자리 예메 프로그램>");
	while(true) {
		
		System.out.println("1.예매 2.예매 취소 3.종료");
		System.out.print(">");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("자리를 선택해 주세요.");
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
					System.out.println("잘못 입력했습니다.");
				}else {
					if(arr[row][column] == '□') {
						arr[row][column] = '■';
						System.out.println("예매가 완료되었습니다.");
					}else {
						System.out.println("이미 예약된 자리입니다.");
					}
				}
			}
				break;
				case 2:
					System.out.println("최소할 자리를 선택해 주세요");
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
					System.out.println("잘못 입력했습니다.");
				}else {
					if(arr[row][column] == '□') {
						System.out.println("예약이 안된 자리입니다.");
				}else if(arr[row][column] == '■'){
					arr[row][column] = '□';
					System.out.println("예약 취소했습니다.");
				}
				}
				}
				break;
				case 3:
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				default:System.out.println("메뉴를 잘못 선택하셨습니다.");
				break;
}
}
}
}
