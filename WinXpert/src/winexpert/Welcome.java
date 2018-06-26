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
class Welcome extends JFrame{
    private JLabel welcome,welc,tech,sit;
    private final JProgressBar pb;
    private JPanel jp,jp1,jp2,jp3,jp4;
    //private static JButton jb;
    
    public Welcome(){
        welcome=new JLabel();
        welc=new JLabel();
        //tech=new JLabel("TezFueRza'18");
        sit=new JLabel();
         pb = new JProgressBar();
         jp=new JPanel();
         jp1=new JPanel();   
         jp2=new JPanel();
         jp3=new JPanel();
         jp4=new JPanel();
        // jp3.setLayout(new GridBagLayout());
         
        // jb=new JButton();
        pb.setOrientation(JProgressBar.HORIZONTAL);        
        //pb.setMinimum(0);
        //pb.setMaximum(100); 
        /*KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.focusNextComponent();*/
        pb.setStringPainted(true);
        welcome.setFont(new Font("Lucida Calligraphy", Font.BOLD+Font.ITALIC, 60));
        welcome.setText("           WelcomE to WinExpert");
        welcome.setForeground(Color.WHITE);
        jp.setLayout(new BorderLayout());
        jp1.setLayout(new BorderLayout());
        jp1.setBackground(Color.BLACK);
        jp.setBackground(Color.BLACK);
        jp.add(pb,BorderLayout.SOUTH);
        pb.setForeground(Color.BLACK);
        pb.setBackground(Color.WHITE);  
        pb.setFocusable(false);
        jp.setFocusable(false);
      //  tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
       // sit.setIcon(new ImageIcon(new ImageIcon("C:\\keyimage\\logo.png").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
        pb.setString("Loading ....");
        sit.setBounds(0,0,100,100);
       // jp3.setPreferredSize(new Dimension(400, 400));
       // GridBagConstraints gbc = new GridBagConstraints();
        //gbc.anchor = GridBagConstraints.NORTHWEST;
        //sit.setHorizontalAlignment(JLabel.LEFT);
       // jp3.add(sit,BorderLayout.LINE_END);
       // jp3.setBounds(80, 250, 200, 500);
        //jp3.setBackground(Color.WHITE);
       // tech.setForeground(Color.WHITE);
        
        //jp2.add(jp3,BorderLayout.NORTH);
       // jp2.add(jp4,BorderLayout.EAST);
       jp3.setBackground(Color.BLACK);
       //add(jp3,BorderLayout.WEST);
       // jp2.add(tech,BorderLayout.CENTER);
        
       // jp2.setBackground(Color.BLACK);
        pb.setFont(new Font("Lucida Calligraphy",Font.ITALIC, 15));
        if(pb.getValue()== 50){
        pb.setForeground(Color.WHITE);
        }
       // pb.addAncestorListener(new RequestFocusListener(false));
        //jp2.requestFocusInWindow();
        //jb.setVisible(false);
        //jp2.add(jb);
        getContentPane().requestFocusInWindow();
        jp1.add(welcome);
        
        //jp1.add(jp2,BorderLayout.NORTH);
        add(jp1,BorderLayout.CENTER);
        add(jp,BorderLayout.EAST);
        JFrame.setDefaultLookAndFeelDecorated(false);
        setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
        setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        for (int i = 0; i <= 100; i++) {
          final int percent = i;          
          try {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                  pb.setValue(percent);
                  pb.setFocusable(false);
                }
            });
            java.lang.Thread.sleep(50); 
          } catch (InterruptedException e) {e.printStackTrace();}
        }
        new Main();
        setVisible(false);
        dispose();
        

    }
}
