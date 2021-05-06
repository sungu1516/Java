package com.day;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing_0506 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_0506 window = new Swing_0506();
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
	public Swing_0506() {
		initialize(); // JFrame을 전역으로 두면 버튼 메소드도 생성자에서 실행 가능
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
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		ButtonEvent2 button = new ButtonEvent2(textField, isReset);

		createNumPad(panel, button);

		createCalPad(panel, button);
	}

	String sign = "";
	int num1 = 0;
	int num2 = 0;
	boolean[] isReset = { false };

	public int getNum1() {
		return num1;

	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	String getSign() {
		return sign;
	}

	void setSign(String sign) {

		if (isReset[0] == false) {
			calcurator();
		}
		this.sign = sign; // this.sign = sign;이 if문 보다 뒤에 있어야 3항 연산에서
							// calcurator()로 중간 계산을 정상 수행한다. 그 뒤 2번째 sign을 할당한다.

		isReset[0] = true;
		setNum1(Integer.parseInt(textField.getText()));
	}

	void calcurator() {
		setNum2(Integer.parseInt(textField.getText()));

		switch (getSign()) {
		case "+":
			textField.setText(getNum1() + getNum2() + "");
			break;
		case "-":
			textField.setText(getNum1() - getNum2() + "");
			break;
		case "*":
			textField.setText(getNum1() * getNum2() + "");
			break;
		case "/":
			textField.setText(getNum1() / getNum2() + "");
			break;

		}
	}

	void createCalPad(JPanel panel, ButtonEvent2 button) {

		String[] op = { "*", "/", "-", "+", "=", "C" };
		for (int i = 0; i < 6; i++) {
			JButton btn7 = new JButton(op[i] + "");

			if (i == 4) { // "="
				btn7.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.out.println("circulator setnum2 test : " + num2);
						System.out.println("circulator getsign test : " + getSign());
						calcurator();
						System.out.println("circulartor 메서드 작동");
						System.out.println("circulator getsign test : " + getSign());
						System.out.println("circulator setnum2 test : " + num2);
						setNum1(0);
						setNum2(0);
						isReset[0] = true; // isReset 후에 setSign("")을 호출해야 3항 연산이 정상 작동함.
						setSign(""); // setSign("")을 먼저하면 if (isReset[0] == false) 때문에 비정상 작동.
						System.out.println("setsign() 호출");
						System.out.println("num2 test : " + num2);
						System.out.println("num1 test : " + num1);
						System.out.println("getsign() 호출" + getSign());
					}
				});
				btn7.setBounds(132, 202, 51, 51);
			} else if (i == 5) { // "C"
				btn7.setBounds(72, 202, 51, 51);
				btn7.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						textField.setText("0");
						setNum1(0);
						setNum2(0);
						System.out.println(num1);
						System.out.println(num2);
						isReset[0] = true;
						setSign("");

					}
				});
			} else { // "사칙연산"
				btn7.setBounds(192, 22 + i * 60, 51, 51);
				btn7.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setSign(e.getActionCommand());
					}
				});
			}
			panel.add(btn7);
		}
	}

	void createNumPad(JPanel panel, ButtonEvent2 button) { // 주소값 인수로 전달 - JPanel이 전역 변수가 아님
		int[] btnPad = { 7, 8, 9, 4, 5, 6, 1, 2, 3, 0 };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				JButton btn7 = new JButton(btnPad[i + (j * 3)] + "");

				btn7.addActionListener(new ButtonEvent2(textField, isReset)); // new ButtonEvent();로 implements ActionListener를 actionPerformed(e) 구현

				btn7.setBounds(12 + i * 60, 22 + j * 60, 51, 51);
				panel.add(btn7);
			}
		}

		JButton btn0 = new JButton(btnPad[9] + "");
		btn0.addActionListener(new ButtonEvent2(textField, isReset));
		btn0.setBounds(12, 22 + 180, 51, 51);
		panel.add(btn0);

	}
}
