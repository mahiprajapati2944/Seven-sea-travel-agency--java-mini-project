package capstone;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PAGE5 implements ActionListener{
	JFrame jf;
	JButton b1,b2;
	JLabel l1,l2;
	
	public PAGE5() {
		jf=new JFrame("CARD PAYMENT");
		jf.setSize(300, 300);
		jf.setLayout(null);
		jf.setVisible(true);
		
		b1=new JButton("CLICK HERE");
		b2=new JButton("CLICK HERE");
		
		l1=new JLabel("DEBIT CARD");
		l2=new JLabel("CREDIT CARD");
		
		jf.add(b1);
		jf.add(b2);
		
		jf.add(l1);
		jf.add(l2);
		
		b1.setBounds(150, 70, 120, 20);
		b2.setBounds(150, 140, 120, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		l1.setBounds(50, 70, 120, 20);
		l2.setBounds(50, 140, 120, 20);
		
		 b1.addActionListener(this);
		   //METHOD-1 : Using Color Fields
				jf.getContentPane().setBackground(Color.cyan);


		   
	}
public static void main(String[] args) {
	new PAGE5();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
     if(e.getSource()==b1) {
    	 System.out.println("Debit card open");
    	 new PAGE7();
     }
     else if(e.getSource()==b2) {
    	 System.out.println("Credit card open");
    	 new PAGE7();
     }
}
}
