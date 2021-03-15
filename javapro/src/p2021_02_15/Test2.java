package p2021_02_15;

import java.util.GregorianCalendar;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("연도를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int year = sc.nextInt();

		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(year)) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}
}
