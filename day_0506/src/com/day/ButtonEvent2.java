package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ButtonEvent2 implements ActionListener {  
  
   
   JTextField input = null;      
   String s = "" ;
   String[] sa = {""}; // �ʱ�ȭ
   boolean[] isReset = {true};
   
   public ButtonEvent2() {   }
   
   public ButtonEvent2(JTextField input) {
      this.input = input;
   }
   public ButtonEvent2(JTextField input, String s) {
      this.input = input;
      this.s = s;
   }
   public ButtonEvent2(JTextField input, String[] sa) {
      this.input = input;
      this.sa = sa;
   }
   public ButtonEvent2(JTextField input, boolean[] isReset) {
      this.input = input;
      this.isReset = isReset;
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println(e.getActionCommand());

      if (isReset[0] == false) {
    	  System.out.println("isreset�� false �Դϴ�.");
         input.setText(input.getText()+e.getActionCommand()+"");
      } else {
    	 System.out.println("isreste�� true�Դϴ�");
         input.setText(e.getActionCommand());
         isReset[0] = false;
         System.out.println("isreset�� false�� �ʱ�ȭ�Ǿ����ϴ�");
      }

   }

}



