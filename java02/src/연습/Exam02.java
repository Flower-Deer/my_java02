package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		//입력
		String height = JOptionPane.showInputDialog("당신의 키를 입력하세요.");
		
		//처리
		double height2 = Double.parseDouble(height);
		double result = (height2 - 100) * 0.9;
		
		//출력
		JOptionPane.showMessageDialog(null, "당신의 적정 몸무게는 " + result);
	}

}
