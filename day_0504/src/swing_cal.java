
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class swing_cal {

	private JFrame frame;
	JTextField textField;
	String o;
	String[] oa = { "" };
	String p = "0";
	int q = 0;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing_cal window = new swing_cal();
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
	public swing_cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("±º∏≤", Font.PLAIN, 23));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 50, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("±º∏≤", Font.BOLD, 26));
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(36, 22, 352, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_7.setBounds(36, 97, 79, 81);
		frame.getContentPane().add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_8.setBounds(127, 97, 79, 81);
		frame.getContentPane().add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_9.setBounds(218, 97, 79, 81);
		frame.getContentPane().add(btn_9);

		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_4.setBounds(36, 188, 79, 81);
		frame.getContentPane().add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_5.setBounds(127, 188, 79, 81);
		frame.getContentPane().add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_6.setBounds(218, 188, 79, 81);
		frame.getContentPane().add(btn_6);

		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_2.setBounds(127, 279, 79, 81);
		frame.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_3.setBounds(218, 279, 79, 81);
		frame.getContentPane().add(btn_3);

		JButton btn_0 = new JButton("0");
		btn_0.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_0.setBounds(36, 370, 79, 81);
		frame.getContentPane().add(btn_0);

		JButton btn_c = new JButton("c");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btn_c.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_c.setBounds(127, 370, 79, 81);
		frame.getContentPane().add(btn_c);

		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_1.setBounds(36, 279, 79, 81);
		frame.getContentPane().add(btn_1);

		ButtonEvent event = new ButtonEvent(textField, oa);

		btn_0.addActionListener(event);
		btn_1.addActionListener(event);
		btn_2.addActionListener(event);
		btn_3.addActionListener(event);
		btn_4.addActionListener(event);
		btn_5.addActionListener(event);
		btn_6.addActionListener(event);
		btn_7.addActionListener(event);
		btn_8.addActionListener(event);
		btn_9.addActionListener(event);

		JButton btn_equ = new JButton("=");
		btn_equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || o == null) {
					return;
				}
				calculator();
			}
		});
		btn_equ.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_equ.setBounds(218, 370, 79, 81);
		frame.getContentPane().add(btn_equ);

		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operationTest("+");

			}
		});
		btn_add.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_add.setBounds(309, 370, 79, 81);
		frame.getContentPane().add(btn_add);

		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationTest("-");
			}
		});
		btn_sub.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_sub.setBounds(309, 279, 79, 81);
		frame.getContentPane().add(btn_sub);

		JButton btn_mul = new JButton("*");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationTest("*");
			}
		});
		btn_mul.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_mul.setBounds(309, 97, 79, 81);
		frame.getContentPane().add(btn_mul);

		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationTest("/");
			}
		});
		btn_div.setFont(new Font("±º∏≤", Font.BOLD, 28));
		btn_div.setBounds(309, 188, 79, 81);
		frame.getContentPane().add(btn_div);

	}

	void operationTest(String os) { // +, -, *, / buttonø°º≠ »£√‚
		oa[0] = os;
		o = os;
		p = textField.getText();
		System.out.println(p);
		System.out.println(os);

	}

	void calculator() { // = buttonø°º≠ »£√‚

		switch (o) {

		case "+":
			int n1 = Integer.parseInt(p) + Integer.parseInt(textField.getText());
			textField.setText(n1 + "");
			System.out.println(n1);
			break;

		case "-":
			int n2 = Integer.parseInt(p) - Integer.parseInt(textField.getText());
			textField.setText(n2 + "");
			System.out.println(n2);
			break;

		case "*":
			int n3 = Integer.parseInt(p) * Integer.parseInt(textField.getText());
			textField.setText(n3 + "");
			System.out.println(n3);
			break;

		case "/":
			int n4 = Integer.parseInt(p) / Integer.parseInt(textField.getText());
			textField.setText(n4 + "");
			System.out.println(n4);
			break;

		case "=":

			break;

		}

	}

}
