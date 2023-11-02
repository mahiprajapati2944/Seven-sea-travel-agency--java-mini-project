package capstone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PAGE6 implements ActionListener{
JFrame jf;
JButton b1;
JLabel l1,l2;
JTextField t1,t2;
	
public PAGE6() {
	jf=new JFrame("Online Payment Process");
	jf.setSize(400, 350);
	jf.setLayout(null);
	jf.setVisible(true);
	
	
	b1=new JButton("Confirmation");
	
	l1=new JLabel(" UPI_ID");
	l2=new JLabel("PIN");
	
	t1=new JTextField();
	t2=new JTextField();
	
	jf.add(b1);
	
	jf.add(l1);
	jf.add(l2);
	
	jf.add(t1);
	jf.add(t2);
	
	b1.setBounds(200, 250, 120, 20);
	b1.addActionListener(this);
	l1.setBounds(50, 90, 120, 20);
	l2.setBounds(50, 140, 120, 20);
	
	t1.setBounds(180, 90, 170, 20);
	t2.setBounds(180, 140, 170, 20);
	
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
	new PAGE6();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		System.out.println("Next Button Click");
		int n = Integer.parseInt(t1.getText());
		int c = Integer.parseInt( t2.getText());
	
		
		try {
			Connection conn = PAGE6.createConnection();
			String sql = "insert into page6 (UPI_ID,PIN)values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, n);
			pst.setInt(2, c);
	
			pst.executeUpdate();				
			System.out.println("Data Inserted");
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("insert exception : "+e2);
		}
		new PAGE8();
	}
}
}

