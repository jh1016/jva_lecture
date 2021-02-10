package p2021_02_08;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 키보드를 이용해서 정수 5개를 입력 받은후 int형
//	       배열에 저장한다. 이때 배열에 저장된 값중에서
//	       최대값과 최소값을 구하는 프로그램을 작성하세요?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한개씩 5번 입력하세요");
		
		int[] test = new int[5];
		for(int i=0; i<test.length; i++) {
			System.out.println(">");
			test[i] = sc.nextInt();
		}
		
		Arrays.sort(test); // 배열 자체를 정렬된 순서로 변경
		
		// 최소값(Min) 출력
	    System.out.println("최소값: " + test[0]);

	    // 최대값(Max) 출력
	    System.out.println("최대값: " + test[test.length - 1]);
	    sc.close();
	}

}
