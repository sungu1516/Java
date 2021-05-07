package com.day;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonEvent implements ActionListener {
	JTextField input = null;
	String s = "";
	String[] sa = { "" };
	boolean[] isReset = { true };

	public ButtonEvent() {
		// TODO Auto-generated constructor stub
	}

	public ButtonEvent(JTextField input) {
		this.input = input;
	}

	public ButtonEvent(JTextField input, String s) {
		this.input = input;
		this.s = s;
	}

	public ButtonEvent(JTextField input, String[] sa) {
		this.input = input;
		this.sa = sa;
	}

	public ButtonEvent(JTextField input, boolean[] isReset) {
		this.input = input;
		this.isReset = isReset;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (isReset[0] == false) {
			input.setText(input.getText() + e.getActionCommand());
		} else {
			input.setText(e.getActionCommand());
			isReset[0] = false;
		}

	}

}
