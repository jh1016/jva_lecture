package com.urdomain.ch11;

import java.util.Arrays;

public class SearchExample{
	public static void main(String[] args) {
		//�⺻ Ÿ�԰� �˻�
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " +  index);
		
		//���ڿ� �˻�
		String[] names = {"ȫ�浿", "�ڵ���", "��ż�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " +  index);

		//��ü �˻�
		Member5 m1 = new Member5("ȫ�浿");
		Member5 m2 = new Member5("�ڵ���");
		Member5 m3 = new Member5("��μ�");
		Member5[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " +  index);
		
	}
	
}
