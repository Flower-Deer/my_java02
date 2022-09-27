package 제어문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조건문확인문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 64));
		f.setSize(600,800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(22, 38, 271, 58);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(22, 207, 271, 58);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(22, 395, 271, 58);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("수학 점수");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(22, 496, 271, 58);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 128, 64));
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(296, 39, 278, 58);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setBackground(new Color(255, 255, 0));
		t2.setColumns(10);
		t2.setBounds(296, 207, 278, 58);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(0, 0, 255));
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(296, 396, 278, 58);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		t4.setBackground(new Color(0, 0, 255));
		t4.setColumns(10);
		t4.setBounds(296, 497, 278, 58);
		f.getContentPane().add(t4);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String go = t1.getText();
				
				if(go.equals("카페")) {
					JOptionPane.showMessageDialog(f, go + "로 갑시다.");
				}else {
					JOptionPane.showMessageDialog(f, "물마시러 갑시다.");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBounds(22, 106, 552, 58);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age1 = t2.getText();
				int age = Integer.parseInt(age1);
				
				JOptionPane.showMessageDialog(f, "나의 내년 나이는 " + age +"살 입니다.");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBounds(22, 275, 552, 58);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("두 과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = t3.getText();
				String second = t4.getText();
				
				int num1 = Integer.parseInt(first);
				int num2 = Integer.parseInt(second);
				
				double sum = (num1 + num2) / 2.0;
				
				JOptionPane.showMessageDialog(f, "평균은 " + sum + "점 입니다.");
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 30));
		b3.setBounds(22, 564, 552, 58);
		f.getContentPane().add(b3);
		f.setVisible(true);
	}

}
