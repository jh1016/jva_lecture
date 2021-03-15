package p2021_02_10;

import java.util.Scanner;
import java.util.regex.Pattern;

class Person{
	
	public String check() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요.(-제외)");
		System.out.print(">");
		String num = sc.next();
			
		int total = 0; 
		int total2; 
		int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5}; 
		
		   
		if (num.length() != 13 || !Pattern.matches("^\\d{6}[1-4]\\d{6}",num)){
			sys();
			System.out.println("올바르지 않습니다.");
			sys();
			ing();
		}else {
			for(int i=0; i<array.length; i++){ 
				   total += (num.charAt(i)-'0')*array[i]; 
				   } 
			total %= 11; 
			total2 = 11 - total; 
			if (total2 > 9) 
				total2 = total2 % 10; 
			if (total2 != Integer.parseInt(num.substring(12, 13))) { 
				// 체크용 번호와 일치하지 않을때 
				sys();
				System.out.println("올바른 형식의 주민등록번호가 아닙니다.");
				sys();
				ing();
			} else { 
				sys();
				System.out.println("등록되었습니다.");
				} 
			}
		return num;
	}	//check메소드 끝
	
	public void sys() {
		System.out.println("");
		System.out.println("----------------");
		System.out.println("");
	}
	
	public int sc() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		return a;
	}
	
	public void ing() {
		System.out.println("계속 진행하시겠습니까?");
		System.out.println("1.Y 2.N");
		System.out.print(">");
		int result = sc();
		
		if(result == 1) {
			sys();
			check();
		}else {
			sys();
			System.out.println("프로그램 종료");
		}
	}
}

public class Test {

	public static void main(String[] args) {

		String[] test = new String[10];
		Person p = new Person();
		for (int i = 0; i < test.length; i++) {
			if (test[i] == null) {
				test[i] = p.check();
				break;
			}
	}
	}
}
