package com.day;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Swing_study {

	private JFrame frame;
	private JTextField textField;
	String[] sa = new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_study window = new Swing_study();
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
	public Swing_study() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(12, 27, 262, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		makeNumButton();
		makeTypeButton();

	}

	void sepOp(String op) {
		if (getP() != 0 && getOp() != null) {
			System.out.println("이전 값" + getP());
			calculator();
		} else {
			setP(Integer.parseInt(textField.getText()));
			
			is_op[0] = false;
			this.op = op;
		}
	}

	void op() {

	}

	void calculator() {

		switch (getOp()) {
		case "*":
			textField.setText((getP() * Integer.parseInt(textField.getText())) + "");
			break;

		case "/":
			textField.setText((getP() / Integer.parseInt(textField.getText())) + "");
			break;

		case "+":
			textField.setText((getP() + Integer.parseInt(textField.getText())) + "");
			break;

		case "-":
			textField.setText((getP() - Integer.parseInt(textField.getText())) + "");
			break;

		default:
			break;
		}

	}

	void makeTypeButton() {
		// for문이용해 계산 버튼 만들기
		String[] op = { "*", "/", "-", "+", "=", "C" };
		for (int i = 0; i < op.length; i++) {
			JButton btn_7 = new JButton(op[i]);
			if (i < 4) {
				btn_7.setBounds(210, 120 + (60 * i), 50, 50);
			} else if (i == 4) {
				btn_7.setBounds(145, 120 + (180), 50, 50);
			} else {
				btn_7.setBounds(85, 120 + (180), 50, 50);
			}

			frame.getContentPane().add(btn_7);
		}
	}

	void makeNumButton() {
		// for문을 이용해 numberbutton 만들기
		int num[] = { 7, 8, 9, 4, 5, 6, 1, 2, 3, 0 };
		ButtonEvent button = new ButtonEvent(textField);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				JButton btn_7 = new JButton(num[(i) + (j * 3)] + "");
				btn_7.setBounds(25 + (i * 60), 120 + (60 * j), 50, 50);
				btn_7.addActionListener(button);
				frame.getContentPane().add(btn_7);
			}

		}

		JButton btn_0 = new JButton(num[9] + "");
		btn_0.addActionListener(button);

		btn_0.setBounds(25, 120 + (180), 50, 50);
		frame.getContentPane().add(btn_0);
	}
}
