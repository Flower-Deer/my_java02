package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		
		System.out.println("일치하나요? " + (x == y)); //false
		System.out.println("불일치하나요? " + (x != y)); //true
		System.out.println("이상인가요? " + (x >= y)); //true
		System.out.println("초과인가요? " + (x > y)); //true
	}

}
