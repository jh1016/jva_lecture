package com.urdomain.test;

import java.util.Arrays;
import java.util.Scanner;

public class Phone {	
	String model = null;
	int battery = 0;
	String screen = null;
	int power;	//1 : 전원이 켜져있는상태 / 0: 전원이 꺼져있는 상태
	
	Phone(){
	}
	Phone(String model,int battery){
		this.model = model;
		this.battery = battery;
	}
	public void sys(String a) {
		System.out.println(a);
	}
	public void sys1() {
		sys(" ");
		sys("------------------");
		sys(" ");
	}
	public int onOff(int power) {
		if(power == 1) {
			sys("전원이 켜져 있습니다.");
			sys1();
			sys(model);
			sys1();
			second();
			return 1;
		}else {
			sys("전원이 꺼져있습니다.");
			sys("전원을 키시겠습니까?");
			return 0;
		}
	}
	public void powerOn() {
		sys("전원을 킵니다.");
	}
	public void powerOff() {
		sys("전원을 끕니다.");
	}
	public int sc() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		return a;
	}
	public void batteryCheck() {
		sys("남은 배터리양은 " + battery + "% 입니다.");
	}
	public void first(int a) {	//전원 커져있을 때 키는 것
		while(a == 0) {
		sys("1.예 2.아니오");
		sys(">");
		a = sc();
		if(a == 1) {
			powerOn();
			sys1();
			sys(model);
			sys1();
			second();
			break;
		}else {
			sys("종료");
			break;
		}
	}//while문 끝

	}
	public String contact() {	//전화 받는 것
		String[] db = {"mom","010-1230-6477"};
		String mom = Arrays.toString(db);
		sys(mom);
		return mom;
	}
	public void contact1(int a) {	//연락처
		String[][] db = {
					   {"mom","010-1230-6477"},
					   {"dad","010-4365-1344"},
					   {"sister","010-4366-6432"}
					   };
		for(int i=0;i<db[a].length;i++) {
		String b = db[a][i] ;
		sys(b);
	}
	}

	public void call() {
		contact();
		sys("전화를 받겠습니까?");
		sys("1.예 2.아니오");
		System.out.print(">");
		int a = sc();
		if(a == 1) {
			sys1();
			sys("통화중");
		}else {
			sys1();
			sys("부재중 전화-mom");
			second();
		}
	}
	public void callBack() {
		sys1();
		sys("누구에게 전화를 거시겠습니까?");
		sys("0.엄마 1.아빠 2.여동생");
		System.out.print(">");
		int a= sc();
			sys1();
			contact1(a);
			sys1();
			sys("전화연결중");
	}
	public void second() {
		sys("무엇을 하시겠습니까?");
		sys("1.전원끄기 2.전화걸기 3.배터리 양 확인");
		System.out.print(">");
		int a= sc();
		if(a == 1) {
			sys1();
			sys(model);
			sys1();
			powerOff();
		}else if(a ==2) {
			callBack();
		}else {
			batteryCheck();
		}
		
	}
}


