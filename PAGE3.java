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

public class PAGE3 implements ActionListener{
JFrame jf;
JButton b1,b2,b3;
JLabel l1,l2,l3;
JTextField t1,t2,t3;

public PAGE3(){
	jf=new JFrame("Payment");
	jf.setSize(400, 330);
	jf.setLayout(null);
	jf.setVisible(true);
	
	b1= new JButton("Cash");
	b2= new JButton("Online");
	b3= new JButton("Card");

	
	l1=new JLabel("Total_Amount");
	l2=new JLabel("SEAT_Number");
	l3=new JLabel("Payment Method");		
	
	
	t1=new JTextField();
	t2=new JTextField();
	
	
	jf.add(b1);
	jf.add(b2);
    jf.add(b3);
    
     
    jf.add(l1);
    jf.add(l2);
    jf.add(l3);
    
    jf.add(t1);
    jf.add(t2);
    


   b1.setBounds(200, 160, 120, 20);
   b2.setBounds(200, 200, 120, 20);
   b3.setBounds(200, 240, 120, 20);
  
 
   b2.addActionListener(this);
   b3.addActionListener(this);
   
   l1.setBounds(50, 50, 120, 20);
   l2.setBounds(50, 80, 120, 20);
   l3.setBounds(20, 110, 120, 20);


   t1.setBounds(180, 50, 170, 20);
   t2.setBounds(180, 80, 170, 20);
   
   b1.addActionListener(this);
   //METHOD-1 : Using Color Fields
		jf.getContentPane().setBackground(Color.cyan);


   
}


public static Connection createConnection() {
	 Connection conn=null;
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","mahi@1234");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Expectation caught : "+e);
	}
	return conn;
	 
}
public static void main(String[] args) {
	new PAGE3();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b2)
	{
		System.out.println("Online Payment open");
		int n = Integer.parseInt( t1.getText());
		int c = Integer.parseInt( t2.getText());
	
		
		try {
			Connection conn = PAGE3.createConnection();
			String sql = "insert into page3 (Total_Amount,SEAT_Number)values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, n);
			pst.setInt(2, c);
	
			pst.executeUpdate();				
			System.out.println("Data Inserted");
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("insert exception : "+e2);
		}
		new PAGE4();
	}
	else if ( e.getSource()==b3)
	{
		System.out.println("Cash Payment open");
		int n = Integer.parseInt( t1.getText());
		int c = Integer.parseInt( t2.getText());
	
		
		try {
			Connection conn = PAGE3.createConnection();
			String sql = "insert into page3 (Total_Amount,SEAT_Number)values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, n);
			pst.setInt(2, c);
	
			pst.executeUpdate();				
			System.out.println("Data Inserted");
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("insert exception : "+e2);
		}
		new PAGE4();
	}

}
}

