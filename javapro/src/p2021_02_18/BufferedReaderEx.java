package p2021_02_18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 구구단 1개 단을 입력 받아서, 구구단 1개단을 출력하는 프로그램을 작성
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader( is );
		BufferedReader br = new BufferedReader( isr );
		
		
		System.out.println( "구구단 중 보고싶은 하나의 단을 입력하세요" );
		System.out.print( ">" );
		
		try{
			String inputString = br.readLine();
			int num = Integer.parseInt(inputString);
			for(int i=1; i<=9; i++) {
				int k = num * i;
				System.out.println(num + "*" + i + "=" + k);
			}
		}catch(Exception e) {
			System.out.println( "숫자만 입력 하세요" );
		}
		
		//강사님이 작성한 코드
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//		System.out.println("원하는 단을 입력하세요?");
//		
//		try {
//			String inputDan = br.readLine();
//			int dan = Interger.parseInt(inputDan);	
//			
//			for(int i=1; i<=9; i++){
//				System.out.println(dan + "*" + i +"=" + dan*i);
//			}
//		
//		}catch(Exception e) {
//			System.out.println("숫자만 입력하세요.");
//		}
	}

}
