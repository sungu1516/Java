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
   String[] sa = {""}; // 초기화
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
    	  System.out.println("isreset은 false 입니다.");
         input.setText(input.getText()+e.getActionCommand()+"");
      } else {
    	 System.out.println("isreste은 true입니다");
         input.setText(e.getActionCommand());
         isReset[0] = false;
         System.out.println("isreset이 false로 초기화되었습니다");
      }

   }

}



