package com.urdomain.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] oldIntArrary = {1, 2,3};
		int[] newIntArrary = new int[5];
		
		for(int i=0; i<oldIntArrary.length; i++) {
			newIntArrary[i] = oldIntArrary[i];
		}
		
		for(int i=0; i<newIntArrary.length;i++) {
			System.out.println(newIntArrary[i] + ",");
			
		}
	}
}
