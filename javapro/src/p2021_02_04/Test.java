package p2021_02_04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요");
		System.out.print(">");
		int x = sc.nextInt();
		System.out.print(">");
		int y = sc.nextInt();
		System.out.print(">");
		int z = sc.nextInt();
		
//		int max = (x > y && x > z) ? x : (y > z) ? y : z;
//		int min = (x < y && x < z) ? x : (y < z) ? y : z;
//		System.out.println("최댓값 : " + max);
//		System.out.println("최솟값 : " + min);

        int max = (x > y) ? x : y;    	  // 최대값
        max = (max > z) ? max : z;    // 최대값
        int min = (x < y) ? x : y;    	  // 최소값
        min = (min < z) ? min : z;    // 최소값
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
        
        sc.close();
	}
}
