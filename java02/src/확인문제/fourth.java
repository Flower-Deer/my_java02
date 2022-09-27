package 확인문제;

public class fourth {

	public static void main(String[] args) {
		int num1 = 66;
		int num2 = 77;
		int num3 = 88;
		int num4 = 99;
		
		// int sum = (num1+num2+num3+num4)/4; -> 값 82 (X)
		// 둘 중 하나를 실수로 만들면 결과는 무조건 실수
		double sum = (num1+num2+num3+num4)/4.0; // 값 82.5 (O)
		
		System.out.println("평균은 " + sum + "점 입니다.");
	}

}
