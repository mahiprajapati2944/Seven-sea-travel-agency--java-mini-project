package capstone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PAGE8 implements ActionListener{
	
	JFrame jf;
	JButton b1;
	JLabel l1;
	
	public PAGE8() {
		jf=new JFrame("Successful Payment");
		jf.setSize(400,350);
		jf.setLayout(null);
		jf.setVisible(true);
		
		b1=new JButton("Finish");
		
		
		l1=new JLabel("Your Payment is Succesfully Done");
	
        jf.add(b1);
		
		jf.add(l1);
		
		b1.setBounds(200, 250, 120, 20);
		b1.addActionListener(this);
		
		
		l1.setBounds(50, 90, 200, 20);

		 b1.addActionListener(this);
		   //METHOD-1 : Using Color Fields
				jf.getContentPane().setBackground(Color.cyan);


		   
		
	}
	
	
public static void main(String[] args) {
	new PAGE8() ;{
	
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
       if (e.getSource()==b1)
       {
    	   System.out.println("finish");
    	   new PAGE9();
       }
}
}
