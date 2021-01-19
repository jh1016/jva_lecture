package com.urdomain.ch11;


public class Member5 implements Comparable<Member5>{
	String name;
	Member5(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member5 o) {
		return name.compareTo(o.name);
	}
	

}
