/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winexpert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ragu Balagi Karuppaiah
 */
public class UserDetails extends JFrame{
     private static JPanel User,Wel;
    private static JLabel UserName,UserEmail,UserDept,UserYear,UserCollege,UserPhone,Welcome;
   private static JButton getReady;

    public UserDetails(String id) {
    User=new JPanel(new GridBagLayout());
    Wel=new JPanel();
    Welcome=new JLabel("WelcomE to TezFueRza'18");
    GridBagConstraints c=new GridBagConstraints();
    UserName=new JLabel();
    UserEmail=new JLabel();
    UserDept=new JLabel();
    UserYear=new JLabel();
    UserCollege=new JLabel();
    UserPhone=new JLabel();
    getReady=new JButton("GetReady");
    Welcome.setFont(new Font("Segoe Print", Font.BOLD, 60));
    Wel.add(Welcome,BorderLayout.CENTER);
    String UserId =id;
    System.out.println("id "+UserId);
    try {                 
	
            Class.forName("com.mysql.jdbc.Driver");                
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tezfuerza","root", "");
             String sql="SELECT * FROM centerlised_table where stud_individual_id=?" ;
    
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,UserId);

            ResultSet rs=pst.executeQuery();
 
     while(rs.next())
    {
    	String Name=rs.getString("name");
        String College=rs.getString("college");
        String Dept=rs.getString("department");
        String Email=rs.getString("mail_id");
        String Phone=rs.getString("mobile_no");
        String Year=rs.getString("year");
        UserName.setText(Name);
        UserEmail.setText(Email);
        UserDept.setText(Dept);
        UserYear.setText(Year);
        UserCollege.setText(College);
        UserPhone.setText(Phone);
         
     }
    //return ans1;
    //System.out.println(Name);
}

catch(Exception e)
{
	 System.out.println("failed "+e);
	 //return 0;
}
    String Name=UserName.getText();
                        c.gridx=0;
			c.gridy=3;
			c.insets=new Insets(10,10,10,10);
    User.add(UserName,c);
                        c.gridx=0;
			c.gridy=4;
			c.insets=new Insets(10,10,10,10);
    User.add(UserEmail,c);
                        c.gridx=0;
			c.gridy=5;
			c.insets=new Insets(10,10,10,10);
    User.add(UserDept,c);
                        c.gridx=0;
			c.gridy=6;
			c.insets=new Insets(10,10,10,10);
    User.add(UserYear,c);
                        c.gridx=0;
			c.gridy=7;
			c.insets=new Insets(10,10,10,10);
    User.add(UserCollege,c);
                        c.gridx=0;
			c.gridy=8;
			c.insets=new Insets(10,10,10,10);
    User.add(UserPhone,c);
    UserName.setFont(new Font("MV Boli", Font.BOLD+Font.ITALIC, 30));
     UserEmail.setFont(new Font("MV Boli", Font.BOLD+Font.ITALIC, 30));
      UserDept.setFont(new Font("MV Boli", Font.BOLD+Font.ITALIC, 30));
       UserYear.setFont(new Font("MV Boli", Font.BOLD+Font.ITALIC, 30));
        UserCollege.setFont(new Font("MV Boli", Font.BOLD+Font.ITALIC, 30));
        UserPhone.setFont(new Font("MV Boli", Font.BOLD+Font.ITALIC, 30));
        UserName.setForeground(Color.WHITE);
        UserEmail.setForeground(Color.WHITE);
        UserDept.setForeground(Color.WHITE);
        UserYear.setForeground(Color.WHITE);
        UserCollege.setForeground(Color.WHITE);
        UserPhone.setForeground(Color.WHITE);
        getReady.setBackground(Color.BLACK);
        getReady.setForeground(Color.WHITE);
        getReady.setFont(new Font("MV Boli", Font.BOLD, 20));
    getReady.addKeyListener(new KeyListener(){
	   	public void keyPressed(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   	}
	   	public void keyReleased(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   		if(arg0.getKeyCode()==10){
                            //int id=1;
                            String tm="30";
                            int mark=0;
                            String end="";
                            String status="not completed";
                            
                               SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm.ss aa");
                               String date = dateFormat.format( new java.util.Date()).toString();
                               try {
                                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tezfuerza","root", "");
                                   String sql1="INSERT INTO winexpert(stud_individual_id,total_mark,earned_mark,start_time,end_time,status) VALUES(?,?,?,?,?,?);";
                                  // String sql="UPDATE winexpertresult SET start_time=? WHERE stud_individual_id=?";
                                    //PreparedStatement ps = con.prepareStatement(sql);
                                    PreparedStatement pst = con.prepareStatement(sql1);
                                    //pst.setInt(1,id);
                                    pst.setString(1,UserId);
                                    pst.setString(2,tm);
                                    pst.setInt(3,mark);
                                    pst.setString(4,date);
                                    pst.setString(5,end);
                                    pst.setString(6,status);
                                    //id=id+1;
                                   // ps.setString(1, date);
                                   // ps.setString(2,UserId);
                                    pst.executeUpdate();
                                     new QuestionGenerator( Name, UserId);
                                     setVisible(false);
                                      dispose();
                               } catch (SQLException ex) {
                                   Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
                               }
                              
                              
	   			
//System.exit();
	   		}
	   		}

	   	public void keyTyped(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   	}
	   });
                        c.gridx=0;
			c.gridy=9;
			c.insets=new Insets(10,10,10,10);
    User.add(getReady,c);
    Welcome.setForeground(Color.WHITE);
    User.setBackground(Color.BLACK);
    Wel.setBackground(Color.BLACK);
    add(Wel,BorderLayout.NORTH);
    add(User);
  setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
		setCursor(getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),new Point(),null ) );
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
    
    }
    
}
