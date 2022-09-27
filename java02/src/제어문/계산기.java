package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 128, 0));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(163, 133, 167, 51);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(163, 265, 167, 51);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\giphy.gif"));
		lblNewLabel_2.setBounds(0, 10, 474, 113);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// plus 버튼 클릭 시 처리
				//JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				
				// 두 수를 가져옴 - String
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				// 숫자 변경 - int
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				// 결과 출력
				//JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
			}
		});
		plus.setBackground(new Color(0, 0, 255));
		plus.setForeground(new Color(255, 0, 0));
		plus.setFont(new Font("굴림", Font.BOLD, 30));
		plus.setBounds(0, 387, 116, 66);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//minus
				String m1 = t1.getText();
				String m2 = t2.getText();
				
				int m11 = Integer.parseInt(m1);
				int m22 = Integer.parseInt(m2);
				
				JOptionPane.showMessageDialog(f, m11 - m22);
				t1.setText("");
				t2.setText("");
			}
		});
		minus.setForeground(Color.RED);
		minus.setFont(new Font("굴림", Font.BOLD, 30));
		minus.setBackground(Color.BLUE);
		minus.setBounds(121, 387, 116, 66);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("x");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//곱하기 버튼
				String mul1 = t1.getText();
				String mul2 = t1.getText();
				
				int mul11 = Integer.parseInt(mul1);
				int mul22 = Integer.parseInt(mul2);
				
				JOptionPane.showMessageDialog(f, mul11 * mul22);
				
				t1.setText("");
				t2.setText("");
			}
		});
		mul.setForeground(Color.RED);
		mul.setFont(new Font("굴림", Font.BOLD, 30));
		mul.setBackground(Color.BLUE);
		mul.setBounds(242, 387, 116, 66);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//나누기
				String d1 = t1.getText();
				String d2 = t2.getText();
				
				int d11 = Integer.parseInt(d1);
				int d22 = Integer.parseInt(d2);
				
				JOptionPane.showMessageDialog(f, d11 / d22);
				
				t1.setText("");
				t2.setText("");
			}
		});
		div.setForeground(Color.RED);
		div.setFont(new Font("굴림", Font.BOLD, 30));
		div.setBackground(Color.BLUE);
		div.setBounds(358, 387, 116, 66);
		f.getContentPane().add(div);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(0, 188, 474, 67);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 0));
		t2.setColumns(10);
		t2.setBounds(0, 310, 474, 67);
		f.getContentPane().add(t2);
		f.setVisible(true);
	}
}
