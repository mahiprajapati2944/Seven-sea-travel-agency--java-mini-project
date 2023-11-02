package capstone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PAGE7 implements ActionListener{
	JFrame jf;
	JButton b1;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	
	public PAGE7()	{
	
		jf=new JFrame("Card Payment Process");
		jf.setSize(400, 350);
		jf.setLayout(null);
		jf.setVisible(true);
		

		b1=new JButton("Confirmation");
		
		l1=new JLabel("A_c_Number");
		l2=new JLabel("A_c_Holder_Name");
		l3=new JLabel("CVV");
		l4=new JLabel("Expiry_Date");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		
		jf.add(b1);
		
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		
		jf.add(t1);
		jf.add(t2);
		jf.add(t3);
		jf.add(t4);
		
	    b1.setBounds(200, 250, 120, 20);
	    b1.addActionListener(this);
	    
	    
	    l1.setBounds(50, 50, 120, 20);
	    l2.setBounds(50, 80, 120, 20);
	    l3.setBounds(50, 110, 120,20);
	    l4.setBounds(50, 140, 120, 20);
	    
	    t1.setBounds(160, 50, 120, 20);
	    t2.setBounds(160, 80, 120, 20);
	    t3.setBounds(160, 110, 120, 20);
	    t4.setBounds(160, 140, 120, 20);
	    
	    b1.addActionListener(this);
	    //METHOD-1 : Using Color Fields
	 		jf.getContentPane().setBackground(Color.cyan);


	    
	}
	
	
	
	public static void main(String[] args) {
		new PAGE7();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			System.out.println("Next Button Click");
			int n = Integer.parseInt(t1.getText());
			String c =t2.getText();
			int d = Integer.parseInt( t3.getText());
			int ef = Integer.parseInt( t4.getText());
		
			
			try {
				Connection conn = PAGE7.createConnection();
				String sql = "insert into page7 (A_c_Number,A_c_Holder_Name,CVV,Expiry_Date)values(?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, n);
				pst.setString(2, c);
				pst.setInt(3, d);
				pst.setInt(4, ef);
		
				pst.executeUpdate();				
				System.out.println("Data Inserted");
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("insert exception : "+e2);
			}
			new PAGE8();
		}
	}



	private static Connection createConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	}






	
	
	
	

