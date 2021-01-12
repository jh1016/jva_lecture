package com.urdomain.test;

import java.util.Scanner;

public class Pc2 {
	int pcnumber;
	boolean use;	//사용자 true 있음, false 없음
	String call;
	
	Pc2(){
	}
	public void run() {
		if(use == false) {
			System.out.println("예약을 진행하겠습니다.");
		}else {
			System.out.println("이미 선택된 좌석입니다.");
		}
	}
	public void sys(String a) {
		System.out.println(a);
	}
	public void seat() {	//자리배치도
		sys("자리배치도");
		char arr[][]= {
				{'□','□','□','□'},
				{'□','□','□','□'},
				{'□','□','□','□'},
				{'□','□','□','□'}};
		for(int k=0;k<arr.length;k++) {
		for(int i=0;i<arr[k].length;i++) {
			System.out.print(arr[i][k] + " ");
		}
		sys(" ");
		}
	}
	public void seat1(){
		sys("자리 번호");
		String arr[]={
			{'[1]','[2]','[3]','[4]'},
			{'[5]','[6]','[7]','[8]'},
			{'[9]','[10]','[11]','[12]'},
			{'[13]','[14]','[15]','[16]'}};
		for(int k=0;k<arr.length;k++) {
		for(int i=0;i<arr[k].length;i++) {
			System.out.print(arr[i][k] + " ");
			}
			sys(" ");
			}
	}
	
	public int sc() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		return a;
	}
	public int number() {
		sys("예약하고싶은 좌석을 선택하세요");
		int a = sc();
		return a;
	}
}

