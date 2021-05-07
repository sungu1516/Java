package com.day;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class fram_calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fram_calculator window = new fram_calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fram_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 355, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(42, 68, 258, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(42, 10, 258, 37);
		textField.setHorizontalAlignment(textField.RIGHT);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		ButtonEvent button = new ButtonEvent(textField, isReset);

		createNumPad(panel, button);
		createCalPad(panel, button);

	}

	String sign = "";
	boolean[] isReset = { false };
	int num1 = 0;

	void calculator() {
		System.out.println("calculator() 호출");
		System.out.println(
				num1 + ("(num1값)") + " 과 " + textField.getText() + ("(textField.getText()값)") + " 계산되어 textfield에 표시됨");

		switch (sign) {
		case "+":

			textField.setText((num1 + Integer.parseInt(textField.getText())) + "");
			break;

		case "-":
			textField.setText((num1 - Integer.parseInt(textField.getText())) + "");
			break;

		case "*":
			textField.setText((num1 * Integer.parseInt(textField.getText())) + "");
			break;

		case "/":
			textField.setText((num1 / Integer.parseInt(textField.getText())) + "");
			break;

		}
	}

	void createCalPad(JPanel panel, ButtonEvent button) {
		String[] op = { "*", "/", "-", "+", "=", "C" };
		for (int i = 0; i < 6; i++) {
			JButton btn7 = new JButton(op[i] + "");

			if (i == 4) { // "="
				btn7.setBounds(132, 202, 51, 51);
				btn7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("= 클릭 후 calculator 호출");
						calculator();
						System.out.println("sign값 초기화");
						sign = "";

					}
				});
			} else if (i == 5) { // "C"
				btn7.setBounds(72, 202, 51, 51);
				btn7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						textField.setText("0");
						isReset[0] = true;
						sign = "";

					}
				});

			} else { // "사칙연산"
				btn7.setBounds(192, 22 + i * 60, 51, 51);
				btn7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("연산 버튼 클릭");

						if (isReset[0] == true) {
							sign = e.getActionCommand();
							return;
						} else {
							if (sign == "") {

								sign = e.getActionCommand();
								System.out.println("sign값이 없는 경우 - sign값을" + e.getActionCommand() + "으로 넣어줌");

								num1 = Integer.parseInt(textField.getText());
								System.out.println("num1 에 " + textField.getText() + " 을 넣어준다.");

								System.out.println("isreset = true 로 설정");
								isReset[0] = true;

							} else {

								System.out.println("sign값이 있는 경우 - calculator() 호출");
								System.out.println("num1의 값 : " + num1);
								calculator();

								num1 = Integer.parseInt(textField.getText());
								sign = e.getActionCommand();
								isReset[0] = true;

							}

						}

					}
				});

			}
			panel.add(btn7);
		}
	}

	void createNumPad(JPanel panel, ButtonEvent button) {
		int[] btnPad = { 7, 8, 9, 4, 5, 6, 1, 2, 3, 0 };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				JButton btn7 = new JButton(btnPad[i + (j * 3)] + "");
				btn7.addActionListener(button);
				btn7.setBounds(12 + i * 60, 22 + j * 60, 51, 51);
				panel.add(btn7);
			}
		}

		JButton btn0 = new JButton(btnPad[9] + "");
		btn0.addActionListener(button);

		btn0.setBounds(12, 22 + 180, 51, 51);
		panel.add(btn0);
	}
}
