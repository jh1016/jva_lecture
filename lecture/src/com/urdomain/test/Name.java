package com.urdomain.test;

public class Name {
	
	public static void main(String[] args) {
		Name ab = new Name();
		String getName = "kjh";
		String Number = "1234567890";
		
		int result1 = 0;
		result1 = ab.number(getName);
		
		if (result1 == 1 ) {
				System.out.println(Number);
			}else {
				System.out.println("Fail");
			}
	}
	public int number(String name) {
		String[] db = {"kjh", "1234567890"};
		
		int result = 0;
		
		if(name == db[0]){
			result =1;
		}else {
			result =0;
		}
		return  result;
	}	
	}

