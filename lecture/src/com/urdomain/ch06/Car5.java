package com.urdomain.ch06;

public class Car5 {
//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas(){
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false; //false �� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true ;//true�� ����
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				return;//�޼ҵ� ���� ����
			}
		}
	}
	
	
}