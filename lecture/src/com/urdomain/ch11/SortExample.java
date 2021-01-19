package com.urdomain.ch11;

import java.util.Arrays;

public class SortExample{
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();
		
		String[] names = {"ȫ�浿", "�ڵ���", "��ż�"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i +"]=" + names[i]);
		}
		System.out.println();
		
		Member5 m1 = new Member5("ȫ�浿");
		Member5 m2 = new Member5("�ڵ���");
		Member5 m3 = new Member5("��μ�");
		Member5[] members = {m1,m2,m3};
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
	}
	
}
