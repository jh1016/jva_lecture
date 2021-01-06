package com.urdomain.test;


public class FindId3 {
	public static void main(String[]args) {
		String id = "kimjihui";
		FindId3 findid3 = new FindId3();
		
		String idNew = findid3.changeIdWithAsterisk(id);
		System.out.println(idNew);
	}


	
public String changeIdWithAsterisk(String id) {
	char[] idCharArray = id.toCharArray();
	
	if(id.length()>=1 && id.length()<3) {
	}else if(id.length() == 3) {
		idCharArray[1] = '*';
	}else if(id.length() == 4 || id.length()==5) {
		idCharArray[1] = '*';
		idCharArray[2] = '*';
	}else if(id.length() == 6 || id.length()==7) {
		idCharArray[3] = '*';
		idCharArray[4] = '*';
	}else if(id.length() == 8 && id.length()<=10) {
		idCharArray[4] = '*';
		idCharArray[5] = '*';
	}else {
		idCharArray[6]='*';
		idCharArray[7]='*';
		idCharArray[8]='*';
	}
	return String.valueOf(idCharArray);
}
}
