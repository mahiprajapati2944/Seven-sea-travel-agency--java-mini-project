package capstone;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PAGE1 implements ActionListener {
      JFrame jf;
      JButton b1;
      JTextField t1,t2;
      JLabel l1,l2,l3,l4;
      JPanel p;
      public PAGE1() {
    	  
    	  jf=new JFrame("Login");
    	  jf.setSize(400,400);
    	  jf.setLayout(null);
    	  jf.setVisible(true);
    	  
    	 
    	  b1=new JButton("Login");
    	 
    	  
    	  t1=new JTextField();
    	  t2=new JTextField();
    	  
    	  l1=new JLabel("E_mail");
    	  l2=new JLabel("Password");
    	  l3=new JLabel("SEVEN SEA TRAVEL AGENCY");
    	  l4=new JLabel("Welcome :)");

          jf.add(b1);
          
          
          
          jf.add(t1);
          jf.add(t2);
          
          jf.add(l1);
          jf.add(l2);
          jf.add(l3);
          jf.add(l4);
          
          l1.setBounds(170, 120, 120, 20);
          l2.setBounds(160, 220, 120, 20);        
          l3.setBounds(100, 50,200,20);
          l4.setBounds(100, 70,200,20);

          
          
          t1.setBounds(90, 150, 200, 20);
          t2.setBounds(90, 250, 200, 20);
      
          b1.setBounds(90, 300, 80, 20);
         
          
          
          b1.addActionListener(this);
        //METHOD-1 : Using Color Fields
			jf.getContentPane().setBackground(Color.CYAN);
			
			
		
          
      }
      
      public static Connection createConnection() {
  		Connection conn =null;
  		try {
  			Class.forName("com.mysql.cj.jdbc.Driver");
  			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","mahi@1234");			
  		}catch(Exception e) {
  		System.out.println("Exception Caught:"+e);
  		}
  			return conn;
  		}
  		public static void main(String[] args) {
  			new PAGE1();	
  		}
  		
  		@Override
  		public void actionPerformed(ActionEvent e) {
  			// TODO Auto-generated method stub
  			if(e.getSource()==b1) {
  				System.out.println("Sing in done");
  				String n=t1.getText();
  				String c=t2.getText();
  				
  				try {
  					Connection conn = PAGE1.createConnection();
  					String sql ="insert into page1(E_mail,Password)values(?,?)";
  		 			PreparedStatement pst = conn.prepareStatement(sql);
  		 			pst.setString(1, n);
  		 			pst.setString(2, c);
  		 			pst.executeUpdate();
  		 			System.out.println("Data Inserted");
  		 			new PAGE2();
  				}catch(Exception e2) {
  					//TODO: handle exception
  					System.out.println("Insert Exception:"+e2);
  				}
  			}
      }
}






