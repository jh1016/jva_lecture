package com.urdomain.ch03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch(ArithmeticException e ) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}

	private static int safeAdd(int left, int right) {
		// TODO Auto-generated method stub
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷��� �߻�");
			}
		}
		return left + right;
	}
	
}
