package com.urdomain.ch05;

public class ArraryReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArrary = new String[3];
		strArrary[0] = "Java";
		strArrary[1] = "Java";
		strArrary[2] = new String("Java");
		
		
		System.out.println(strArrary[0] == strArrary[1]);
		System.out.println(strArrary[0] == strArrary[2]);
		System.out.println(strArrary[0].equals(strArrary[2]));
	}
}
