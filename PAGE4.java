package capstone;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PAGE4 implements ActionListener{
JFrame jf;
JButton b1,b2,b3;
JLabel l1,l2,l3;

public PAGE4() {
   jf=new JFrame("Online Payment");
   jf.setSize(300, 300);
   jf.setLayout(null);
   jf.setVisible(true);
   
   b1=new JButton("Click Here");
   b2=new JButton("Click Here");
   b3=new JButton("Click Here");
   
   l1=new JLabel("G Pay");
   l2=new JLabel("Phone Pay");
   l3=new JLabel("PayTm");
   
   jf.add(b1);
   jf.add(b2);
   jf.add(b3);

   
   jf.add(l1);
   jf.add(l2);
   jf.add(l3);
   
   b1.setBounds(120, 50, 120, 20);
   b2.setBounds(120, 80, 120, 20);
   b3.setBounds(120, 110, 120, 20);
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   
   l1.setBounds(50, 50, 120, 20);
   l2.setBounds(50, 80, 120, 20);
   l3.setBounds(50, 110, 120, 20);
   
   b1.addActionListener(this);
   //METHOD-1 : Using Color Fields
		jf.getContentPane().setBackground(Color.cyan);


   
}

	public static void main(String[] args) {
	new PAGE4();
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			System.out.println("GPay open");
			new PAGE6();
		}
		else if(e.getSource()==b2) {
			System.out.println("Phone pay open");
			new PAGE6();
		}
		else if(e.getSource()==b3) {
			System.out.println("Paytm open");
			new PAGE6();
		}
	}
}