package p2021_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Teest {

	public static void main(String[] args) {
		//로또 프로그램 만들기 set 사용해서 / 오름차순으로 정렬까지
		
		Set lottoset = new HashSet();
		
		while(lottoset.size() != 6 ) {
			int num = (int)(Math.random()*45+1);
			lottoset.add(num);
		}
		ArrayList lottoArr = new ArrayList(lottoset);
		Collections.sort(lottoArr);
		
		System.out.println(lottoArr);
	}

}
