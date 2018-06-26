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
public class Finish extends JFrame{

    
private static JPanel end,wel;
    private static JLabel thank,tech;
    private static JButton finish;
    public Finish(String UserName,String UserId){
        String userName=UserName;
       String userId=UserId;
        end=new JPanel(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        wel=new JPanel();
        tech=new JLabel("TezFueRza'18");
        thank=new JLabel("Meet You Next Symposium");
        finish=new JButton("Finish");
         tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
        finish.addKeyListener(new KeyListener()
           {
               public void keyPressed(KeyEvent e)
               {
                 
           }
               public void keyTyped (KeyEvent e){
        
    			}

            public void keyReleased (KeyEvent e){
   				 	if (e.getKeyCode() == 10) {
                             try
	   		    {
                                SimpleDateFormat dateFormat = new SimpleDateFormat(" hh.mm.ss aa");
                                String date = dateFormat.format( new java.util.Date()).toString();
                                System.out.println(date);
	   		         Class.forName("com.mysql.jdbc.Driver");
	   		         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tezfuerza","root", "");
	   		         String sql="UPDATE winexpert SET status=? WHERE stud_individual_id=?";
                                 String sql1="UPDATE winexpert SET end_time=? WHERE stud_individual_id=?";
                                
	   		         PreparedStatement ps = con.prepareStatement(sql);
                                 PreparedStatement ps1 = con.prepareStatement(sql1);
                                 ps1.setString(1,date);
	   		         ps.setString(1, "*");
                                 ps1.setString(2,userId);
	   		         ps.setString(2, userId);
	   		         ps.executeUpdate();
                                 ps1.executeUpdate();
	   		         System.out.println("Sucess");
	   		}

	   		catch(Exception e1)
	   		{
	   			 System.out.println("failed "+e1);
                        }
   				 		System.exit(0);
                                                 dispose();
   	}
      			 
        }
       });
        finish.setBackground(Color.BLACK);
        finish.setForeground(Color.WHITE);
         c.gridx=0;
			c.gridy=3;
			c.insets=new Insets(10,10,10,10);
        end.add(thank,c);
         c.gridx=0;
			c.gridy=4;
			c.insets=new Insets(10,10,10,10);
        end.add(finish,c);
        thank.setFont(new Font("MV Boli", Font.BOLD, 30));
        finish.setFont(new Font("MV Boli", Font.BOLD, 25));
        wel.add(tech,BorderLayout.CENTER);
        tech.setForeground(Color.WHITE);
        wel.setBackground(Color.BLACK);
        thank.setForeground(Color.WHITE);
        end.setBackground(Color.BLACK);
        add(wel,BorderLayout.NORTH);
        add(end);
        
         setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
         setCursor(getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),new Point(),null ) );
         setUndecorated(true);
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         setVisible(true);
        
    }
    
}
