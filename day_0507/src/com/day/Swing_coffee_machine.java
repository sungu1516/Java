package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class Swing_coffee_machine {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_coffee_machine window = new Swing_coffee_machine();
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
	public Swing_coffee_machine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	JPanel currentPanel = null;
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 458, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_A = new JPanel();
		panel_A.setBackground(Color.GREEN);
		panel_A.setBounds(20, 25, 403, 354);
		frame.getContentPane().add(panel_A);
		panel_A.setLayout(null);

		JPanel panel_B = new JPanel();
		panel_B.setBackground(Color.GREEN);
		panel_B.setBounds(20, 25, 403, 354);
		frame.getContentPane().add(panel_B);
		panel_B.setLayout(null);

		JPanel panel_C = new JPanel();
		panel_C.setBackground(Color.GREEN);
		panel_C.setBounds(20, 25, 403, 354);
		frame.getContentPane().add(panel_C);
		panel_C.setLayout(null);

		JLabel lblNewLabel_C = new JLabel("Menu_C");
		lblNewLabel_C.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_C.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel_C.setBounds(60, 149, 282, 107);
		panel_C.add(lblNewLabel_C);

		JLabel lblNewLabel_B = new JLabel("Menu_B");
		lblNewLabel_B.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_B.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel_B.setBounds(60, 149, 282, 107);
		panel_B.add(lblNewLabel_B);

		JLabel lblNewLabel_A = new JLabel("Menu_A");
		lblNewLabel_A.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_A.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel_A.setBounds(60, 149, 282, 107);
		panel_A.add(lblNewLabel_A);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(20, 25, 403, 354);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btn_A = new JButton("btn_A");
		btn_A.setFont(new Font("±¼¸²", Font.BOLD, 16));
		btn_A.setBounds(31, 401, 106, 40);
		frame.getContentPane().add(btn_A);

		JButton btn_B = new JButton("btn_B");
		btn_B.setFont(new Font("±¼¸²", Font.BOLD, 16));
		btn_B.setBounds(168, 401, 106, 40);
		frame.getContentPane().add(btn_B);

		JButton btn_C = new JButton("btn_C");
		btn_C.setFont(new Font("±¼¸²", Font.BOLD, 16));
		btn_C.setBounds(305, 401, 106, 40);
		frame.getContentPane().add(btn_C);


		panel_A.setVisible(false);
		//panel_B.setVisible(false);
		currentPanel = panel_B;
		panel_C.setVisible(false);

		btn_A.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				currentPanel.setVisible(!currentPanel.isVisible());
				currentPanel = panel_A;
				panel_A.setVisible(!panel_A.isVisible());

			}
		});

		btn_B.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				currentPanel.setVisible(!currentPanel.isVisible());
				currentPanel = panel_B;
				panel_B.setVisible(!panel_B.isVisible());

			}
		});

		btn_C.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				currentPanel.setVisible(!currentPanel.isVisible());
				currentPanel = panel_C;
				panel_C.setVisible(!panel_C.isVisible());

			}
		});

	}
}
