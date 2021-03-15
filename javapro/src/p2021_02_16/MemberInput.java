package p2021_02_16;

import java.util.Scanner;

	class MemberInfo{
		private String name;
	  	private int age;
	  	private String email;
	    private String address;
	    
	    public MemberInfo(){  
	    }
	    public MemberInfo(String name, int age, String email, String address){  
	    	this.name = name;
	    	this.age = age;
	    	this.email = email;
	    	this.address = address;
	    }
		    
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getEmail() {
			return email;
		}
		public String getAddress() {
			return address;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			if(age<0) {
				System.out.println("음수값이 입력되었습니다.");
				return;
			}
			this.age = age;
		}
		public void setEmail(String email) {
			this.email = email;
		}	
		public void setAddress(String address) {
			this.address = address;
		}
		public int sc() {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			return a;
		}
		
		public void sys() {
			System.out.println("");
			System.out.println("---------------");
			System.out.println("");
		}
		public void sys(String a) {
			System.out.println(a);
		}
		@Override
		public boolean equals(Object obj) {
			boolean result = false;
			if(obj instanceof MemberInfo) {
				MemberInfo memberinfo = (MemberInfo)obj;
				if(this.name.equals(memberinfo.name) &&
				(this.age == memberinfo.age) && this.email.equals(email)){
					result = true;
				}
			}
			return result;
		}
	}


public class MemberInput {

	public static void main(String[] args) {
			MemberInfo[] memberinfos = new MemberInfo[10];
			MemberInfo member = new MemberInfo();
			Scanner sc = new Scanner(System.in);
			boolean stop = false;
				
			while(!stop) {
				member.sys("1.회원가입 2.회원조회 3.종료");
				member.sys();
				System.out.print("메뉴>");
				int menu = member.sc();
				member.sys();
				switch(menu) {
				case 1:
					member.sys("이름을 입력하세요");
					System.out.print(">");
					String name = sc.next();
					member.setName(name);
					
					member.sys("나이를 입력하세요");
					System.out.print(">");
					int age = sc.nextInt();
					member.setAge(age);
						
					member.sys("이메일을 입력하세요");
					System.out.print(">");
					String email = sc.next();
					member.setEmail(email);
						
					member.sys("주소를 입력하세요");
					System.out.print(">");
					String address = sc.next();
					member.setAddress(address);
						
					MemberInfo memberinfo = new MemberInfo(name, age, email, address);

					boolean same = false;
					for (MemberInfo m : memberinfos) {
						if (memberinfo.equals(m)) {
							same = true;
							member.sys();
							System.out.println("중복된 회원이 존재합니다!!");
						}
					}
					if (!same) {
						for (int i = 0; i < memberinfos.length; i++) {
							if (memberinfos[i] == null) {
								memberinfos[i] = memberinfo;
								member.sys(memberinfo.getName() + "회원이 등록되었습니다.");
								member.sys("");
								member.sys("당신의 회원번호는" + i + "입니다.");
								break;
							}
						}
					}
					member.sys();
					break;
				case 2: //회원조회
					member.sys("조회하고 싶은 회원번호를 입력하세요");
					System.out.print(">");
					int id = sc.nextInt();
					member.sys();
					System.out.println(id + "번의 회원님의 상세정보");
					System.out.println("이름: " + memberinfos[id].getName());
					System.out.println("나이: " + memberinfos[id].getAge());
					System.out.println("이메일: " + memberinfos[id].getEmail());
					System.out.println("주소: " + memberinfos[id].getAddress());
					member.sys();
					break;
				case 3: //종료
					stop = true;
					member.sys();
					break;
				default:
					break;
				}
				System.out.println("프로그램 종료!");
				member.sys();
				}
			sc.close();
				}
		}
