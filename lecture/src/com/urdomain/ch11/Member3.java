package com.urdomain.ch11;

public class Member3 implements Cloneable{
	public String id;
	public String name;
	public String  password;
	public int age;
	public boolean adult;
	
	public Member3(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member3 getMember() {
		Member3 cloned = null;
	
	try {
		cloned = (Member3) clone();
	}catch(CloneNotSupportedException e) {}
	return cloned;
}
}