package 연습;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		//입력
		String width = JOptionPane.showInputDialog("가로 값을 입력하시오");
		String height = JOptionPane.showInputDialog("세로 값을 입력하시오");
		//처리
		int w = Integer.parseInt(width);
		int h = Integer.parseInt(height);
		int total = w * h;
		//출력
		JFrame f = new JFrame();
		f.setSize(w,h);
		f.setVisible(true);
		
		//결합
		JOptionPane.showMessageDialog(null, "사각형의 면적은" + total);

	}

}
