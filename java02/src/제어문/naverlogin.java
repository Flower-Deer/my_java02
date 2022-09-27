package 제어문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class naverlogin {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디 :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(31, 78, 198, 52);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(31, 166, 198, 52);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(241, 78, 218, 52);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(241, 166, 218, 52);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인 확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
				if (id.equals("root") && pw.equals("1234")) {
					t3.setText("로그인 성공!");
				}else {
					t3.setText("로그인 실패!");
				}
			}
		});
		b1.setBackground(new Color(255, 0, 255));
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBounds(46, 311, 399, 52);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBackground(Color.MAGENTA);
		b2.setBounds(46, 414, 399, 52);
		f.getContentPane().add(b2);
		
		t3 = new JTextField();
		t3.setForeground(new Color(255, 0, 0));
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBackground(new Color(0, 255, 0));
		t3.setBounds(43, 498, 402, 52);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}