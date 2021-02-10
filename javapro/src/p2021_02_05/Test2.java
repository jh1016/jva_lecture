package p2021_02_05;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요(단, 중복된 숫자는 1번만 출력 되도록 한다.)Math.random() 이용해서 프로그램을 작성 하세요
		
		int[] num = new int[45];
		for(int i=0; i<num.length; i++) {
			num[i] = i +1;
		}
		
		for(int k=0; k<6 ; k++) {
			int random = (int)(Math.random()*44+1);
			int temp = num[k];
			num[k] = num[random];
			num[random] = temp;
		}
		int[] arr = Arrays.copyOfRange(num, 0, 6);
		System.out.println(Arrays.toString(arr));
	}

}
