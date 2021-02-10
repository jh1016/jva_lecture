package p2021_02_08;

public class Animal {
//	사용자 정의 클래스
	
	int age;	//필드(field),멤버변수(heap 메모리 영역에 저장됨),인스턴스 변수(iv)
				// : 메소드 바깥쪽에 정의 되는 변수
	
	public Animal() {	// 기본 생성(Default Constructor)
						// : 매개변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}
	public static void main(String[] args) {
		
		int a = 10; //지역 변수(= lv/stack 영역에 저장됨)
		
		String str = new String("자바");
		
		Animal	 	a1	 = 	 new	 Animal();
	//	클래스	레퍼런스 변수	연산자	생성자 호출
	
//		System.out.println("age:" + age);	//오류발생
		System.out.println("age:" + a1.age);
	
//		age = 5; 						//오류발생
		a1.age = 5;
		System.out.println("age:" + a1.age);
		
		Animal a2 = new Animal();
		
	}

}
