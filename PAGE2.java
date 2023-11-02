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

public class PAGE2 implements ActionListener{
JFrame jf;
JButton b1;
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3,l4;

public PAGE2(){
	jf=new JFrame("Registration");
	jf.setSize(400, 400);
	jf.setLayout(null);
	jf.setVisible(true);
	
	
	b1=new JButton("Register");
	

    t1=new JTextField();
    t2=new JTextField();
    t3=new JTextField();
    t4=new JTextField();


    
    l1=new JLabel("Ac_Non_Bus");
    l2=new JLabel("Bus_No");
    l3=new JLabel("Destination ");
    l4=new JLabel("Current_place");
    
    jf.add(b1);
    
    
    jf.add(t1);
    jf.add(t2);
    jf.add(t3);
    jf.add(t4);
   
    
   
    jf.add(l1);
    jf.add(l2);
    jf.add(l3);
    jf.add(l4);
    
    b1.setBounds(30, 250, 120, 20);
   
    
    b1.addActionListener(this);
   
    
    l1.setBounds(50, 50, 120, 20);
    l2.setBounds(50, 80, 120, 20);
    l3.setBounds(50, 110, 120, 20);
    l4.setBounds(50, 140, 120, 20);
       
    t1.setBounds(160, 50, 120, 20);
    t2.setBounds(160, 80, 120, 20);
    t3.setBounds(160, 110, 120, 20);
    t4.setBounds(160, 140, 120, 20);
  
    
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
	new PAGE2();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		System.out.println("Register Button Click");
		String n = t1.getText();
		int c = Integer.parseInt(t2.getText());
	    String d =t3.getText();
		String ef = t4.getText();
	
		
		try {
			Connection conn = PAGE2.createConnection();
			String sql = "insert into page2 (Ac_Non_Bus,Bus_No,Destination,Current_place)values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, n);
			pst.setInt(2, c);
			pst.setString(3, d);
			pst.setString(4, ef);
	
			pst.executeUpdate();				
			System.out.println("Data Inserted");
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("insert exception : "+e2);
		}
		new PAGE3();
	}
}
}







