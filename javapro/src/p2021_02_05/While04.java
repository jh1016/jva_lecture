package p2021_02_05;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan =2;
		int cross=1;
		while(dan<=9) {
			while(cross <=9) {
				int sum = dan*cross;
				System.out.println(dan + "*" + cross);
				cross++;
			}
			dan++;
			cross=1;
			System.out.println("");
		}
	}

}
