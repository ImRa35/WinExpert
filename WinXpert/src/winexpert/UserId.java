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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ragu Balagi Karuppaiah
 */
public class UserId extends JFrame{
    private static JPanel jp,jp1;
	private static JLabel id,tech;
	private static JTextField userId;
	private static JButton Submit;
    public UserId() {
        jp=new JPanel(new GridBagLayout());
                jp1=new JPanel(new GridBagLayout());
                GridBagConstraints c=new GridBagConstraints();
                tech=new JLabel("TezFueRza'18");
		id=new JLabel("EnteR YouR Id");
		userId=new JTextField(40);
		Submit=new JButton("InitializE");
                userId.setBounds(10, 50, 60, 50);
                userId.setBackground(Color.BLACK);
                userId.setForeground(Color.WHITE);
                tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
		tech.setForeground(Color.WHITE);
                id.setForeground(Color.WHITE);
                        c.gridx=8;
			c.gridy=0;
			c.insets=new Insets(10,10,10,10);
			jp.add(tech,c);
                        id.setFont(new Font("MV Boli", Font.BOLD, 30));
                        userId.setFont(new Font("MV Boli", Font.BOLD, 20));
                        Submit.setFont(new Font("MV Boli", Font.BOLD, 20));
               // Submit.setBounds(0, 2, 60, 50);
                        c.gridx=0;
			c.gridy=0;
			c.insets=new Insets(10,10,10,10);
		jp.add(id,c);
                        c.gridx=0;
			c.gridy=1;
			c.insets=new Insets(10,10,10,10);
		jp.add(userId,c);
                        c.gridx=0;
			c.gridy=2;
			c.insets=new Insets(10,10,10,10);
		jp.add(Submit,c);
                Submit.setBackground(Color.BLACK);
                Submit.setForeground(Color.WHITE);
                jp.setBackground(Color.BLACK);
                jp1.setBackground(Color.BLACK);
                jp1.add(tech);
                /*userId.addKeyListener(new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (userId.getText().length() >= 1) {
                Submit.setEnabled(true);
                Submit.setFocusable(true);
                Submit.requestFocus(true);
                //Submit.setVisible(true);
            } else {
                Submit.setEnabled(false);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    });*/
                
		  Submit.addKeyListener(new KeyListener()
           {
               public void keyPressed(KeyEvent e)
               {
                 
           }
               public void keyTyped (KeyEvent e){
        
    			}

   				 public void keyReleased (KeyEvent e){
   				 	if (e.getKeyCode() == 10) {
                                            String id=userId.getText();
                                                try {                
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tezfuerza", "root", "");
                                                    String sql="SELECT * FROM centerlised_table where stud_individual_id=?" ;
            
                                                    // String sql1="SELECT * FROM winexpert where stud_individual_id=?" ;
                                                     //String sql2="SELECT * FROM centerlised_table where stud_individual_id=?";
                                                     PreparedStatement pst=con.prepareStatement(sql);
                                                     //PreparedStatement ps=con.prepareStatement(sql1);
                                                     //PreparedStatement ps2=con.prepareStatement(sql2);
                                                     //ps2.setString(1,id);
                                                    pst.setString(1,id);
                                                   // ps.setString(1,id);

                                                     ResultSet rs=pst.executeQuery();
                                                    // ResultSet rs1=ps.executeQuery();
                                                     //ResultSet rs2=ps2.executeQuery();
                                                     if(rs.next()) {
                                                     if(rs.getString("stud_individual_id").equals(id)){
                                                         //if(rs1.next()){
                                                         //if(!(rs1.getString("stud_individual_id").equals(id))){
                                                      System.out.println("User id is"+id);
                                                         new UserDetails(id);
                                                        setVisible(false);
                                                        dispose();
                                                        //}else{
                                                        // System.out.println("already completed");
                                                        //new UserExist(id);
                                                        // setVisible(false);
                                                         //dispose();
                                                         //}
                                                        //}
                                                     }
                                                     }else{
                                                         new ErrorId();
                                                         dispose();
                                                     }
   				 		
                                               
                                                } catch (ClassNotFoundException ex) {
                                                    Logger.getLogger(UserId.class.getName()).log(Level.SEVERE, null, ex);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(UserId.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            
                                           
   				 	}
      			 
           }
       });      
                 // Submit.setVisible(false);
                //Submit.setEnabled(false);
		add(jp);
                add(jp1,BorderLayout.NORTH);
		userId.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
		setCursor(getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),new Point(),null ) );
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);

    }
    
}
