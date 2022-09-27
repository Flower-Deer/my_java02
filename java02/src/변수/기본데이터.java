package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		//기본데이터 : 정수 실수 문자1 논리(T,F)
		//ram에 넣어보자
		int age = 100; //정수(방4개,21억개)
		double height = 122.2;// 실수(방8개)
		char gender = '남'; //문자1 (방2개) = '' 문자열 = "
		boolean food = true; // 논리(방1개)
		
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 키는 " + height);
		System.out.println("나의 성별은 " + gender);
		System.out.println("내가 밥을 먹었는지 여부 " + food);
		
		String name = "정유진";
		System.out.println("나의 이름은 " + name);
	}

}
