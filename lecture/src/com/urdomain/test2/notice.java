package com.urdomain.test2;

import java.util.Scanner;

public class notice extends noticeParents{	//공지사항자식
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
		sys("보고싶은 공지번호를 고르세요(1번~9번)");
		System.out.print(">");
		a = sc1();
		sys();
		if(!(a>=1 && a<=9)) {
			sys("잘못기입하셨습니다.");
			sys();
		}
		list(a);
		
	}
	public void list(int a) {
		String[][] db = {
				{"[공지]띵글 스톡 체험판 이렇게 사용하세요~","라온 정달","2020.09.20","261","3"},
				{"[공지]일요일 오후 9시 방송 시작합니다.","프로그","2020.12.27","34","0"},
				{"[필독]202년 12월 신규 탐험대를 모집합니다.","라온 정달","2020.12.03","54","0"},
				{"[공지]프로그 지분 15구좌 양도합니다.","프로그","2020.10.27","248","0"},
				{"[공지]프로그 차트 특허 등록이 결정되었습니다.","프로그","2020.09.30","262","20"},
				{"[필독]신입 회원 필독사항입니다.","라온 정달","2020.03.03","1731","31"},
				{"[공지]주식 양도 절차","프로그","2020.07.26","198","3"},
				{"[공지]이 카페를 찾아 오신 분들께","프로그","2020.03.25","591","30"},
				{"[이벤트]띵글 구매하면 선물이 팡팡!!","라온 정달","2019.10.31","805","20"}
				};
		for(int i=0;i<db[a].length;i++) {
			String b = db[a][i] ;
			System.out.print(b + "\t");
		}
		}
	
}
