package com.urdomain.ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyy�� MM�� dd��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("�̴��� D��° ��");
		System.out.println(sdf.format(now));
	}

}
