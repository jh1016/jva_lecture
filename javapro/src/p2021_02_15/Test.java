package p2021_02_15;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* 윤년의 정의
//
//		1. 해당 연도를 4로 나누어 떨어지면 윤년
//
//		2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님
//
//		3. 그 중에서 400으로 나누어 떨어지면 윤년
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		System.out.print(">");
		int year = sc.nextInt();
		
		if((year %4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
	}
	}
}
