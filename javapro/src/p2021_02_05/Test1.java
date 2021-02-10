package p2021_02_05;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램을 작성 하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요");

		int k = sc.nextInt();
		int result=1;
		
		for(int i=1; i<=k; i++) {
		 result = result * i;
		}
		System.out.println( k + "!= " + result);
	}

}
