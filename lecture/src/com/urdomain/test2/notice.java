package com.urdomain.test2;

import java.util.Scanner;

public class notice extends noticeParents{	//���������ڽ�
	public void sys(String a) {
		System.out.println(a);
	}
	public void sys() {
		sys("");
		sys("--------------------");
		sys("");
	}
	
	public String sc() {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		return a;
	}
	public int sc1() {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		return a;
	}
	public void first() {
		sys("������� ������ȣ�� ������(1��~9��)");
		System.out.print(">");
		a = sc1();
		sys();
		if(!(a>=1 && a<=9)) {
			sys("�߸������ϼ̽��ϴ�.");
			sys();
		}
		list(a);
		
	}
	public void list(int a) {
		String[][] db = {
				{"[����]��� ���� ü���� �̷��� ����ϼ���~","��� ����","2020.09.20","261","3"},
				{"[����]�Ͽ��� ���� 9�� ��� �����մϴ�.","���α�","2020.12.27","34","0"},
				{"[�ʵ�]202�� 12�� �ű� Ž��븦 �����մϴ�.","��� ����","2020.12.03","54","0"},
				{"[����]���α� ���� 15���� �絵�մϴ�.","���α�","2020.10.27","248","0"},
				{"[����]���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.","���α�","2020.09.30","262","20"},
				{"[�ʵ�]���� ȸ�� �ʵ������Դϴ�.","��� ����","2020.03.03","1731","31"},
				{"[����]�ֽ� �絵 ����","���α�","2020.07.26","198","3"},
				{"[����]�� ī�並 ã�� ���� �е鲲","���α�","2020.03.25","591","30"},
				{"[�̺�Ʈ]��� �����ϸ� ������ ����!!","��� ����","2019.10.31","805","20"}
				};
		for(int i=0;i<db[a].length;i++) {
			String b = db[a][i] ;
			System.out.print(b + "\t");
		}
		}
	
}
