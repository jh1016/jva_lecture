package com.urdomain.test2;


public class noticeParents {	//공지사항부모
	int day;
	String title;
	String name;	//글쓴이
	int num;//조회수
	int a;
	
	public int getday() {
		return day;
	}
	public String gettitle() {
		return title;
	}
	public String getname() {
		return name;
	}
	public int  getnum() {
		return num;
	}
	public void setday(int day) {
		this.day = day;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setnum(int num) {
		this.num = num;
	}
}
