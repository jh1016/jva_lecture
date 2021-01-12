package com.urdomain.test;


public class Game {
	String age = null;
	String kind =null;
	String sex =null;
	String result = null;
	String score = null;

	Game(String kind, String sex, String age){
		this.kind = kind;
		this.sex = sex;
		this.age = age;
	}
	public String gameRecommend() {	//게임목록
		return result;
	}
	public String score() {//별점
		return score;
	}
}