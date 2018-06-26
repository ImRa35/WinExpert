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
/**
 *
 * @author Ragu Balagi Karuppaiah
 */
public class Rules extends JFrame{
private static JPanel rulePanel,tech1;
	private  static JLabel rule1,rule2,rule3,rule4,rule5,tech;
	private static JButton LetsGo;
	public Rules(){
                tech1=new JPanel();
                tech=new JLabel("TezFueRza'18");
                tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
		rulePanel=new JPanel(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		rule1=new JLabel("Individual participation");
                
		rule2=new JLabel("Participants will be given the task and they have to complete it within 15 minutes");
		rule3=new JLabel("No Internet access will be provided");
		rule4=new JLabel("Windows XP machine will be provided without mouse");
		rule5=new JLabel("Common Participation ID will be sent to your mail and this id can be used as access key for participation.");
                rule1.setFont(new Font("Kristen ITC", Font.BOLD+Font.ITALIC, 20));
                rule2.setFont(new Font("Kristen ITC", Font.BOLD+Font.ITALIC, 20));
                rule3.setFont(new Font("Kristen ITC", Font.BOLD+Font.ITALIC, 20));
                rule4.setFont(new Font("Kristen ITC", Font.BOLD+Font.ITALIC, 20));
                rule5.setFont(new Font("Kristen ITC", Font.BOLD+Font.ITALIC, 20));
                //L
		LetsGo=new JButton("LetsGo");
			c.gridx=1;
			c.gridy=3;
			c.insets=new Insets(10,10,10,10);
		rulePanel.add(rule5,c);
			c.gridx=1;
			c.gridy=4;
			c.insets=new Insets(10,10,10,10);
		rulePanel.add(rule2,c);
                        c.gridx=1;
			c.gridy=5;
			c.insets=new Insets(10,10,10,10);
		rulePanel.add(rule4,c);
                        c.gridx=1;
			c.gridy=6;
			c.insets=new Insets(10,10,10,10);
		rulePanel.add(rule3,c);
                        c.gridx=1;
			c.gridy=7;
			c.insets=new Insets(10,10,10,10);
		rulePanel.add(rule1,c);
                        c.gridx=1;
			c.gridy=8;
			c.insets=new Insets(10,10,10,10);
		rulePanel.add(LetsGo,c);
                rule1.setForeground(Color.WHITE);
                rule2.setForeground(Color.WHITE);
                rule3.setForeground(Color.WHITE);
                rule4.setForeground(Color.WHITE);
                rule5.setForeground(Color.WHITE);
                rulePanel.setBackground(Color.BLACK);
                tech1.setBackground(Color.BLACK);
                tech.setForeground(Color.WHITE);
                tech1.add(tech);
                LetsGo.setFont(new Font("MV Boli", Font.BOLD, 25));
                LetsGo.setBackground(Color.BLACK);
                LetsGo.setForeground(Color.WHITE);
                
		LetsGo.addKeyListener(new KeyListener()
           {
               public void keyPressed(KeyEvent e)
               {
               }
               public void keyTyped (KeyEvent e){
        
    			}

   				 public void keyReleased (KeyEvent e){
   				 	if (e.getKeyCode() == 10) {
                                                new UserId();
                                                setVisible(false);
                                                dispose();
   				 	}
      			 
           }
       });
                add(tech1,BorderLayout.NORTH);
		add(rulePanel);
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
		setCursor(getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),new Point(),null ) );
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
}

