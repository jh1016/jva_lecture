package com.urdomain.test;

import java.util.Scanner;

public class Pc2 {
	int pcnumber;
	boolean use;	//����� true ����, false ����
	String call;
	
	Pc2(){
	}
	public void run() {
		if(use == false) {
			System.out.println("������ �����ϰڽ��ϴ�.");
		}else {
			System.out.println("�̹� ���õ� �¼��Դϴ�.");
		}
	}
	public void sys(String a) {
		System.out.println(a);
	}
	public void seat() {	//�ڸ���ġ��
		sys("�ڸ���ġ��");
		char arr[][]= {
				{'��','��','��','��'},
				{'��','��','��','��'},
				{'��','��','��','��'},
				{'��','��','��','��'}};
		for(int k=0;k<arr.length;k++) {
		for(int i=0;i<arr[k].length;i++) {
			System.out.print(arr[i][k] + " ");
		}
		sys(" ");
		}
	}
	public void seat1(){
		sys("�ڸ� ��ȣ");
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
		sys("�����ϰ���� �¼��� �����ϼ���");
		int a = sc();
		return a;
	}
}

