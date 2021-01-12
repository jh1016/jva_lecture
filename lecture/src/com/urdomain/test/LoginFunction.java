package com.urdomain.test;

public class LoginFunction {

	public static void main(String[] args) {
		LoginFunction login = new LoginFunction();
		String getId = "ewr";
		String getPw = "qewr";
		int resultLogin = 0;
		
		resultLogin = login.userLogin(getId,getPw);
		login.syso(resultLogin);
}
	public int userLogin(String id,String pw) {
		String db[] = {"ewr","qewr"};
		
		int result = 0;
		
		if(id == db[0] && pw == db[1]) {
			result =1;
		}else {
			result =0;
		}
		return  result;
	}
	
	public void syso(int result) {
		if (result ==1 ) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}
}

