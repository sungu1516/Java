package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 50, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(55, 167, 525, 228);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("100");
		btnNewButton.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnNewButton.setBounds(19, 67, 149, 94);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("200");
		btnNewButton_1.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnNewButton_1.setBounds(187, 67, 149, 94);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("300");
		btnNewButton_2.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnNewButton_2.setBounds(355, 67, 149, 94);
		panel.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(63, 34, 509, 96);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_3 = new JButton("on/off");

		btnNewButton_3.addActionListener(new ActionListener() {
			int count = 0;

			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setText("¡÷πÆ");
				count++;
				if (count == 2) {
					btnNewButton_3.setText("»Æ¿Œ");
				}
				if (count == 3) {
					frame.setVisible(false);
				}

			}
		});
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("±º∏≤", Font.BOLD, 15));
		btnNewButton_3.setBounds(412, 440, 168, 45);
		frame.getContentPane().add(btnNewButton_3);

	}
}
