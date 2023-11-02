package capstone;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PAGE9 {
	
	JFrame jf;
	JLabel l1,l2;
	JButton b1;
	
	
	public PAGE9() {
	jf=new JFrame("Thank you");
	jf.setSize(400, 350);
	jf.setLayout(null);
	jf.setVisible(true);
	
	
	l1=new JLabel("THANK YOU");
	l2=new JLabel("PLEASE VISIT AGAIN");
	
	
	
	
	jf.add(l1);
	jf.add(l2);
	
	l1.setBounds(150, 90, 120, 20);
	l2.setBounds(190, 250, 120, 20);
	   


	   
	
	}
	
	public static void main(String[] args) {
		new PAGE9();
	
	
	}
}
