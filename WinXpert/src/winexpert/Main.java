/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winexpert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author Ragu Balagi.K
 */
public class Main extends JFrame{
    private static JPanel jp,jp2;
    private static JLabel sas,eng,tech,welc;
    private static JButton Go;
    public Main(){
        try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
           UIManager.put("Button.focus", Color.red);
        } catch (Exception e) {
           System.err.println("Error al cargar Look And Feel");
        }
    jp=new JPanel(new GridBagLayout());
    jp2=new JPanel(new GridBagLayout());
    GridBagConstraints c=new GridBagConstraints();
    GridBagConstraints c1=new GridBagConstraints();
    sas=new JLabel("SASURIE");
    eng=new JLabel("College of Engineering");
    tech=new JLabel("TezFueRza'18");
    welc=new JLabel("Welcome WinExpert");
    Go=new JButton("Start");
    welc.setFont(new Font("Curlz MT", Font.BOLD, 30));
    Go.setFont(new Font("MV Boli", Font.BOLD, 25));
    Go.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyCode()==10){}
                new Rules();
                setVisible(false);
                dispose();
        }
    });
    tech.setFont(new Font("Segoe Print", Font.BOLD, 60));
    sas.setFont(new Font("Lucida Handwriting", Font.BOLD, 60));
    eng.setFont(new Font("Andalus", Font.BOLD, 45));
    welc.setForeground(Color.WHITE);
    tech.setForeground(Color.WHITE);
    Go.setBackground(Color.BLACK);
    Go.setForeground(Color.WHITE);
    jp.setBackground(Color.BLACK);
    jp2.setBackground(Color.BLACK);
    sas.setForeground(Color.WHITE);
    eng.setForeground(Color.WHITE);
                        c.gridx=0;
			c.gridy=6;
			c.insets=new Insets(10,10,10,10);
    jp2.add(sas,c);
                        c.gridx=0;
			c.gridy=7;
			c.insets=new Insets(10,10,10,10);
    jp2.add(eng,c);
                        c1.gridx=0;
			c1.gridy=1;
			c1.insets=new Insets(10,10,10,10);
    jp.add(tech,c1);
                        c1.gridx=0;
			c1.gridy=3;
			c1.insets=new Insets(10,10,10,10);
    jp.add(welc,c1);
                        c1.gridx=0;
			c1.gridy=4;
			c1.insets=new Insets(10,10,10,10);
    jp.add(Go,c1);
    add(jp2,BorderLayout.NORTH);
    add(jp);
    setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
    setCursor(getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),new Point(),null ) );
    setUndecorated(true);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setVisible(true);
    }
   
}
