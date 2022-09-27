package 확인문제;

public class third {

	public static void main(String[] args) {
		char pw = 'p';
		char pw2 = 'q';
		
		double yester = 80.5; 
		double today = 76.5;
				
		double diet = yester - today;
		
		if (pw == pw2 && diet > 2) {
			System.out.println("오늘은 성공!");
		}else {
			System.out.println("내일 다시 도전!");
		}
	}

}
