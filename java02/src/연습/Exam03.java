package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		//입력
		String na = JOptionPane.showInputDialog("통신사 입력 : ");
		String tel = JOptionPane.showInputDialog("전화번호 입력 : ");
		String name = JOptionPane.showInputDialog("가입자이름 입력 : ");
		
		//처리
		
		String text = name + "님은 " + na + "에 " + tel;
		
		//출력
		JOptionPane.showMessageDialog(null,"다이얼로그로 " + text + "로 가입되셨습니다.");
		
	}

}
