package com.day;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class ButtonEvent implements ActionListener {
	JTextField textField;
	String[] sa = new String[1];
	String s = "";

	public ButtonEvent() {
		// TODO Auto-generated constructor stub
	}
	public ButtonEvent(JTextField textField) {
		this.textField = textField;
	}

	public ButtonEvent(JTextField textField, String[] s) {
		this.textField = textField;
		this.sa = s;

	}

	@Override
	public void actionPerformed(ActionEvent e) { // e는 클릭 시, 클릭한 버튼의 객체이다.

		System.out.println(e.getActionCommand());
		if (!textField.getText().equals("0")) {
			if (sa[0] == null || sa[0].equals("")) {
				textField.setText(textField.getText() + e.getActionCommand());
			} else {
				sa[0] = "";
				textField.setText(e.getActionCommand());

			}

		} else {
			textField.setText(e.getActionCommand());
		}

	}

}
