package com.urdomain.test;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i=0;i<6;i++){
			int num = (int)(Math.random()*45+1);
			lotto[i]=num;//1~45���� ������ ���� �ֱ�
			
			for(int k= 0; k<i;k++) {
				if(lotto[i]==lotto[k]) {
					i--; //�ߺ��� ���� ���ֱ�
				}
			}
			
		}
		for (int j=0; j<lotto.length;j++) {
			System.out.print(lotto[j] + "\t");
		}
	}

}
