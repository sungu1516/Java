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
		panel.setBounds(25, 48, 586, 467);
		panel.setBackground(new Color(0, 100, 0));
		panel.setForeground(new Color(0, 100, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Label");
		lblNewLabel.setForeground(new Color(211, 211, 211));
		lblNewLabel.setBackground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(18, 10, 540, 66);
		
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("100");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(btnNewButton.getText());
				lblNewLabel.setText(btnNewButton.getText());
			}
		});
		btnNewButton.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 15));
		btnNewButton.setBounds(34, 100, 150, 267);
		panel.add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("200");
		btnNewButton1.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 15));
		btnNewButton1.setBounds(218, 100, 150, 267);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(btnNewButton1.getText());
				lblNewLabel.setText(btnNewButton1.getText());
			}
		});
		panel.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("300");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(btnNewButton2.getText());
				lblNewLabel.setText(btnNewButton2.getText());
			}
		});
		btnNewButton2.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 15));
		btnNewButton2.setBounds(402, 100, 150, 267);
		panel.add(btnNewButton2);
		
		

	}
}
