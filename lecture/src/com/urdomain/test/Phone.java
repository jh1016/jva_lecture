package com.urdomain.test;

import java.util.Arrays;
import java.util.Scanner;

public class Phone {	
	String model = null;
	int battery = 0;
	String screen = null;
	int power;	//1 : ������ �����ִ»��� / 0: ������ �����ִ� ����
	
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
			sys("������ ���� �ֽ��ϴ�.");
			sys1();
			sys(model);
			sys1();
			second();
			return 1;
		}else {
			sys("������ �����ֽ��ϴ�.");
			sys("������ Ű�ðڽ��ϱ�?");
			return 0;
		}
	}
	public void powerOn() {
		sys("������ ŵ�ϴ�.");
	}
	public void powerOff() {
		sys("������ ���ϴ�.");
	}
	public int sc() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		return a;
	}
	public void batteryCheck() {
		sys("���� ���͸����� " + battery + "% �Դϴ�.");
	}
	public void first(int a) {	//���� Ŀ������ �� Ű�� ��
		while(a == 0) {
		sys("1.�� 2.�ƴϿ�");
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
			sys("����");
			break;
		}
	}//while�� ��

	}
	public String contact() {	//��ȭ �޴� ��
		String[] db = {"mom","010-1230-6477"};
		String mom = Arrays.toString(db);
		sys(mom);
		return mom;
	}
	public void contact1(int a) {	//����ó
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
		sys("��ȭ�� �ްڽ��ϱ�?");
		sys("1.�� 2.�ƴϿ�");
		System.out.print(">");
		int a = sc();
		if(a == 1) {
			sys1();
			sys("��ȭ��");
		}else {
			sys1();
			sys("������ ��ȭ-mom");
			second();
		}
	}
	public void callBack() {
		sys1();
		sys("�������� ��ȭ�� �Žðڽ��ϱ�?");
		sys("0.���� 1.�ƺ� 2.������");
		System.out.print(">");
		int a= sc();
			sys1();
			contact1(a);
			sys1();
			sys("��ȭ������");
	}
	public void second() {
		sys("������ �Ͻðڽ��ϱ�?");
		sys("1.�������� 2.��ȭ�ɱ� 3.���͸� �� Ȯ��");
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


