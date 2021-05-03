package day_0503;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing_study {

	private JFrame frame;
	JTextField textField;
	String temp;
	int prior_num = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing_study window = new swing_study();
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
	public swing_study() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("±¼¸²", Font.PLAIN, 23));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 50, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.BOLD, 26));
		textField.setText("");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(36, 22, 352, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_7.setBounds(36, 97, 79, 81);
		frame.getContentPane().add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_8.setBounds(127, 97, 79, 81);
		frame.getContentPane().add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_9.setBounds(218, 97, 79, 81);
		frame.getContentPane().add(btn_9);

		JButton btn_mul = new JButton("*");
		btn_mul.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_mul.setBounds(309, 97, 79, 81);
		frame.getContentPane().add(btn_mul);

		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_4.setBounds(36, 188, 79, 81);
		frame.getContentPane().add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_5.setBounds(127, 188, 79, 81);
		frame.getContentPane().add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_6.setBounds(218, 188, 79, 81);
		frame.getContentPane().add(btn_6);

		JButton btn_div = new JButton("/");
		btn_div.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_div.setBounds(309, 188, 79, 81);
		frame.getContentPane().add(btn_div);

		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_2.setBounds(127, 279, 79, 81);
		frame.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_3.setBounds(218, 279, 79, 81);
		frame.getContentPane().add(btn_3);

		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = e.getActionCommand();
				prior_num += Integer.parseInt(textField.getText());
				calculator(btn_sub.getText());

			}
		});
		btn_sub.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_sub.setBounds(309, 279, 79, 81);
		frame.getContentPane().add(btn_sub);

		JButton btn_0 = new JButton("0");
		btn_0.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_0.setBounds(36, 370, 79, 81);
		frame.getContentPane().add(btn_0);

		JButton btn_c = new JButton("c");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn_c.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_c.setBounds(127, 370, 79, 81);
		frame.getContentPane().add(btn_c);

		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = e.getActionCommand();
				calculator(btn_add.getText());
			}
		});
		btn_add.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_add.setBounds(309, 370, 79, 81);
		frame.getContentPane().add(btn_add);

		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_1.setBounds(36, 279, 79, 81);
		frame.getContentPane().add(btn_1);

		JButton btn_equ = new JButton("=");
		btn_equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator(btn_equ.getText());
			}
		});
		btn_equ.setFont(new Font("±¼¸²", Font.BOLD, 28));
		btn_equ.setBounds(218, 370, 79, 81);
		frame.getContentPane().add(btn_equ);

		btn_0.addActionListener(new ButtonEvent(textField));
		btn_1.addActionListener(new ButtonEvent(textField));
		btn_2.addActionListener(new ButtonEvent(textField));
		btn_3.addActionListener(new ButtonEvent(textField));
		btn_4.addActionListener(new ButtonEvent(textField));
		btn_5.addActionListener(new ButtonEvent(textField));
		btn_6.addActionListener(new ButtonEvent(textField));
		btn_7.addActionListener(new ButtonEvent(textField));
		btn_8.addActionListener(new ButtonEvent(textField));
		btn_9.addActionListener(new ButtonEvent(textField));

	}

	void calculator(String s) {

		switch (s) {

		case "+":

			try {
				prior_num += Integer.parseInt(textField.getText());
				textField.setText("");

			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case "-":
			try {
				prior_num += -Integer.parseInt(textField.getText());
				textField.setText("");

			} catch (Exception e) {
				// TODO: handle exception
			}
			break;

		case "=":

			switch (temp) {

			case "+":
				int c = prior_num + Integer.parseInt(textField.getText());
				textField.setText(c + "");
				prior_num = 0;
				break;

			case "-":
				int d = prior_num - Integer.parseInt(textField.getText());
				textField.setText(d + "");
				prior_num = 0;
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}

	}

}

class ButtonEvent implements ActionListener {
	JTextField textField;

	public ButtonEvent(JTextField textField) {
		this.textField = textField;

	}

	@Override
	public void actionPerformed(ActionEvent e) { // e´Â Å¬¸¯ ½Ã, Å¬¸¯ÇÑ ¹öÆ°ÀÇ °´Ã¼ÀÌ´Ù.

		String num_string = e.getActionCommand(); // e.getActionCommand()´Â btn.getText()¿Í °°Àº ¿ªÇÒÀ» ÇÑ´Ù.

		if (!textField.getText().equals("0")) {
			textField.setText(textField.getText() + num_string);
		}

		else {
			textField.setText(num_string);
		}

	}
}
