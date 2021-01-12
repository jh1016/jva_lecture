package com.urdomain.test;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i=0;i<6;i++){
			int num = (int)(Math.random()*45+1);
			lotto[i]=num;//1~45까지 랜덤한 숫자 넣기
			
			for(int k= 0; k<i;k++) {
				if(lotto[i]==lotto[k]) {
					i--; //중복된 숫자 없애기
				}
			}
			
		}
		for (int j=0; j<lotto.length;j++) {
			System.out.print(lotto[j] + "\t");
		}
	}

}
