package 변수;

public class 기본데이터2 {

	public static void main(String[] args) {
		// 정수
		byte age = 25; //127이하 (1byte)
		short wallet = 20000; //3만(2byte)
		int money = 500000000; //21억(4byte)
		long space = 10000000000L; //21억이상(8byte)
				
		// 실수
		double height = 185.5; //8byte
		float weight = 88.8f; //
				
		//문자
		char gender = '여'; //2byte
				
		//논리
		boolean todayFinished = false;
				
		//특별한 부품, 기본형X
		String name = "정유진";
		System.out.println(name);

	}

}
