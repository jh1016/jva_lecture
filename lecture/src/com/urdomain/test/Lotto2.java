package com.urdomain.test;

import java.util.Arrays;

public class Lotto2 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		for(int k=0; k<lotto.length;k++) {
			lotto[k] = k+1;
		}
		
		for (int i=0;i<6;i++) {
			int num = (int)(Math.random()*45);
			int temp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = temp;
			}
			
		

		int[] arr = Arrays.copyOfRange(lotto, 0, 6);
		System.out.println(Arrays.toString(arr));	
	}
}
