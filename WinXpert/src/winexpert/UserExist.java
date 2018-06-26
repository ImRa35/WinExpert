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
 * @author Ragu Balagi.K
 */
public class UserExist extends JFrame {
     private static JPanel errorpanel,wel;
    private static JLabel errormsg,tech,name;
    private static JButton userId;
    public UserExist(String Id){
         try {
             String id=Id;
             errorpanel=new JPanel(new GridBagLayout());
             wel=new JPanel();
             GridBagConstraints c=new GridBagConstraints();
             tech=new JLabel("TezFueRza'18");
             name=new JLabel();
             errormsg=new JLabel("Already You are Completed");
             userId=new JButton("BYE");
             //exit=new JButton("BYE");
             tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
             c.gridx=0;
             c.gridy=3;
             c.insets=new Insets(10,10,10,10);
             errorpanel.add(name,c);
             c.gridx=1;
             c.gridy=4;
             c.insets=new Insets(10,10,10,10);
             errorpanel.add(errormsg,c);
             c.gridx=1;
             c.gridy=5;
             c.insets=new Insets(10,10,10,10);
             errorpanel.add(userId,c);
             try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://192.182.183.10:3306/tezfuerza", "sasurie", "sasurieinfotech");
             String sql="SELECT * FROM centerlised_table where stud_individual_id=?" ;
             PreparedStatement pst=con.prepareStatement(sql);
              pst.setString(1,id);
              ResultSet rs=pst.executeQuery();
              while(rs.next()){
              String Name=rs.getString("name");
              name.setText(Name);
              }
             } catch (SQLException ex) {
                 Logger.getLogger(UserExist.class.getName()).log(Level.SEVERE, null, ex);
             }
             
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
                                // new UserId();
                                System.exit(0);
                                 dispose();
                             }
                         }
                     }
             );
             name.setForeground(Color.WHITE);
             name.setFont(new Font("MV Boli", Font.BOLD, 28));
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
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(UserExist.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
