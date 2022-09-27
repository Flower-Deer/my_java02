package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500,600);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\giphy.gif"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.SOUTH);
		
		textField = new JTextField();
		textField.setText("돌아간다");
		f.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		f.setVisible(true);
	}

}
