package 연산자;

public class 네이버로그인 {

	public static void main(String[] args) {
		// 기본형 비교 여러개인 경우
		// 가입 시 id, pw -> db에 저장되어 있는 값을 꺼내온 것으로 가정
		int id = 1111;
		int pw = 2222;
		
		// 입력한 id, pw
		int id2 = 1111;
		int pw2 = 2222;
		
		// 처리 *(&&=and / ||=or) / 출력 System.out.println();
		// '예약어' = ex)if, int :문법으로 쓰려고 미리 만들어놓은 단어들 -> 변수명 or 패키지명 등 사용불가
		if (id == id2 && pw == pw2) { //기본형은 연산자를 이용해 값을 비교할 수 있다!
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
