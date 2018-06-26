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
public class ErrorId extends JFrame{
    
    private static JPanel errorpanel,wel;
    private static JLabel errormsg,tech;
    private static JButton userId;
    public ErrorId() {
        errorpanel=new JPanel(new GridBagLayout());
        wel=new JPanel();
        GridBagConstraints c=new GridBagConstraints();
        tech=new JLabel("TezFueRza'18");
        errormsg=new JLabel("Your Id doesn't EXIST please check the UserId");
        userId=new JButton("BacK");
        tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
         c.gridx=0;
			c.gridy=3;
			c.insets=new Insets(10,10,10,10);
        errorpanel.add(errormsg,c);
         c.gridx=0;
			c.gridy=4;
			c.insets=new Insets(10,10,10,10);
        errorpanel.add(userId,c);
        
        userId.addKeyListener(
        new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
               if (e.getKeyCode() == 10) {
                    new UserId();
                    dispose();
               }
            }
        }
        );
        errormsg.setFont(new Font("MV Boli", Font.BOLD, 25));
        userId.setFont(new Font("Forte", Font.BOLD, 20));
        wel.setBackground(Color.BLACK);
        tech.setForeground(Color.WHITE);
        wel.add(tech,BorderLayout.CENTER);
        errormsg.setForeground(Color.WHITE);
        userId.setForeground(Color.WHITE);
        userId.setBackground(Color.BLACK);
        errorpanel.setBackground(Color.BLACK);
        add(errorpanel);
        add(wel,BorderLayout.NORTH);
        setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
	setCursor(getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),new Point(),null ) );
	setUndecorated(true);
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setVisible(true);
    }
    
}
