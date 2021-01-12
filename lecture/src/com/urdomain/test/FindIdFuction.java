package com.urdomain.test;


public class FindIdFuction {
//이미 입력된것
	public static void main(String[] args) {
		
		FindIdFuction find = new FindIdFuction();
		
		String id = "Qewrerrq";
		
		String getName = "kjh";
		String getEmail = "kjh23@naver.com";
		
		int resultFindId = 0;
		
		resultFindId = find.findId(getName,getEmail);
//		find.sys(resultFindId);
		
		String newId;
		newId = find.arrayid(id);
		
		if (resultFindId ==1 ) {
			System.out.println("당신의 id는 : " + newId +" 입니다.");
		}else {
			System.out.println("Fail");
		}
		
	}

	public int findId(String name, String email) {
	String[] db = {"kjh","kjh23@naver.com"};
	
	int result;
	
	if(name == db[0] && email == db[1]) {
		result = 1;
	}else {
		result = 0;
	}
	return result;
}
//	public void sys(int result) {
//		if (result ==1 ) {
//			System.out.println("당신의 id는 : " + id +"입니다.");
//		}else {
//			System.out.println("Fail");
//		}
	
public String arrayid(String id) {
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
		idCharArray[6] = '*';
		idCharArray[7] = '*';
	}else {
		idCharArray[6]='*';
		idCharArray[7]='*';
		idCharArray[8]='*';
		idCharArray[9]='*';
	}
	return String.valueOf(idCharArray);
}
}



