package 변수;

// import : 부품의 위치
import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		// '자주 쓰는' 기능을 가진 부품은 '대문자'로 바로 쓸 수 있도록 준비되어 있음
		// System, JOptionPane, => import가 생략 되어 있는 것
		// 숫자를 변환해주는 부품(Integer)
		// prompt(),입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		
		// '자주 안쓰'는 기능을 가진 부품은 'new'를 가지고 새로 생성.
		// JFrame, Date, ...
		// alert(), 출력용
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age);

		// JOptionPane 취미, 이름 입력 -> 출력
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요.");
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 취미는 " + hobby + " 당신의 이름은 " + name);
		JOptionPane.showConfirmDialog(null, "당신의 취미는 " + hobby + " 당신의 이름은 " + name);
	
	}

}
