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



public class QuestionGenerator extends JFrame implements Runnable{

   @SuppressWarnings("serial")
//public class QuestionGenerator extends JFrame implements Runnable{

  private static String driverName = "com.mysql.jdbc.Driver";
  private static int ans1,ans2,cl=1;
  private static String Que;
 // private static JLabel ctrl,a,ckey,alt,enter,ekey,winkey,del,esc,xkey,vkey,pkey,bkey,dkey,fkey,gkey,hkey,jkey,kkey,lkey,mkey,nkey,okey,qkey,home,end,caps,insert;
 // private static JLabel rkey,skey,tkey,ukey,ykey,zkey,shift,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,back,key0,key1,key2,key3,key4,key5,key6,key7,key8,key9,ps,space,leftarrow,rightarrow,uparrow,downarrow,pageup,pagedown;
  static JButton ans = new JButton("Ans");
  static JButton nxtPa=new JButton("NxtPage");

  WinPanel p1=new WinPanel();
  private static int cor=0;
  Thread chrono;
  private KeyListener ansKey;
  private KeyListener nxtPaKey;
  private static WinPanel p2=new WinPanel();
  private static WinPanel p=new WinPanel();
  //private static ImagePanel ani=new ImagePanel();
  //private static JPanel ani=new JPanel();
 // private static WinPanel ani=new WinPanel();
  private static  ArrayList<Integer> u=new ArrayList<Integer>();
  private static JLabel name=new JLabel();
  private static JLabel Ques =new JLabel();
  private static JLabel QuesNo =new JLabel();
  private static JLabel win =new JLabel();
  private static JLabel time =new JLabel();
  private static String userName,userId;
@SuppressWarnings({ "unused", "deprecation" })
public QuestionGenerator(String Name, String UserId) {
	setTitle("Question");
      /*ctrl=new JLabel();
      a=new JLabel();
      ckey=new JLabel();
      alt=new JLabel();
      enter=new JLabel();
      ekey=new JLabel();
      winkey=new JLabel();
      del=new JLabel();
      esc=new JLabel();
      xkey=new JLabel();
      vkey=new JLabel();
      bkey=new JLabel();
      dkey=new JLabel();
      fkey=new JLabel();
      gkey=new JLabel();
      hkey=new JLabel();
      jkey=new JLabel();
      kkey=new JLabel();
      lkey=new JLabel();
      mkey=new JLabel();
      nkey=new JLabel();
      okey=new JLabel();
      pkey=new JLabel();
      qkey=new JLabel();
      rkey=new JLabel();
      skey=new JLabel();
      tkey=new JLabel();
      ukey=new JLabel();
      ykey=new JLabel();
      zkey=new JLabel();
      shift=new JLabel();
      f1=new JLabel();
      f2=new JLabel();
      f3=new JLabel();
      f4=new JLabel();
      f5=new JLabel();
      f6=new JLabel();
      f7=new JLabel();
      f8=new JLabel();
      f9=new JLabel();
      f10=new JLabel();
      f11=new JLabel();
      f12=new JLabel();
      back=new JLabel();
       key0=new JLabel();
        key1=new JLabel();
        key2=new JLabel();
        key3=new JLabel();
        key4=new JLabel();
        key5=new JLabel();
        key6=new JLabel();
        key7=new JLabel();
        key8=new JLabel();
        key9=new JLabel();
        ps=new JLabel();
        space=new JLabel();
        rightarrow=new JLabel();
        leftarrow=new JLabel();
        uparrow=new JLabel();
        downarrow=new JLabel();
        pageup=new JLabel();
        pagedown=new JLabel();
        home=new JLabel();
        end=new JLabel();
        caps=new JLabel();
        insert=new JLabel();*/
	userName=Name;
      userId = UserId;
     
	if(cl!=11){
		try {
	           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch (Exception e) {
	           System.err.println("Error al cargar Look And Feel");
	        }
	setLayout(new BorderLayout());
	setBackground(Color.BLACK);
	setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
                 
	p1.setLayout (new BorderLayout ());
    p1.setBackground(Color.BLACK);
   
    add(p1,BorderLayout.NORTH);
	p1.add(time,BorderLayout.EAST); 
        p1.add(name,BorderLayout.CENTER);
        name.setForeground(Color.WHITE);
	time.setForeground(Color.WHITE);
	chrono = new Thread(this);
	setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
	setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
        setUndecorated(true);
	p2.setLayout (new BorderLayout ());
    p2.setBackground(Color.BLACK);
    add(p2,BorderLayout.CENTER);
	
    p.setLayout (new BorderLayout ());
    p.setBackground(Color.BLACK);
    add(p,BorderLayout.SOUTH);
    
    
  
    time.setFont(new Font("Comic Sans MS",Font.BOLD,30));
    name.setFont(new Font("MV Boli",Font.BOLD,30));
    Ques.setFont(new Font("MV Boli",Font.BOLD,30));
    Ques.setBounds(80, 250, 200, 500);
    Ques.setForeground(Color.white);
    
    QuesNo.setFont(new Font("Eras Demi ITC",Font.BOLD,30));
    
    QuesNo.setForeground(Color.WHITE);
    p1.add(QuesNo,BorderLayout.WEST);
    QuesNo.setText("<html><body>"+cl+"</body></html>");
    
    win =new JLabel();
    win.setText("<html><body>Please use 'W' for Windows key</body></html>");
    win.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,30));
    win.setBounds(780, 50, 200, 500);
    win.setForeground(Color.white);
    p2.add(win,BorderLayout.SOUTH);
   // ani.setLayout(new FlowLayout());
    //ani.setBackground(Color.BLACK);
    
    
    /*ani.add(ctrl);
    ani.add(a);
    ani.add(ckey);
    ani.add(alt);
    ani.add(enter);
    ani.add(ekey);
    ani.add(winkey);
    ani.add(del);
    ani.add(esc);
    ani.add(xkey);
    ani.add(vkey);
    ani.add(bkey);
    ani.add(dkey);
    ani.add(ekey);
    ani.add(fkey);
    ani.add(gkey);
    ani.add(hkey);
    ani.add(jkey);
    ani.add(kkey);
    ani.add(lkey);
    ani.add(mkey);
    ani.add(nkey);
    ani.add(okey);
    ani.add(pkey);
    ani.add(qkey);
    ani.add(rkey);
    ani.add(skey);
    ani.add(tkey);
    ani.add(ukey);
    ani.add(ykey);
    ani.add(zkey);
    ani.add(shift);
    ani.add(back);
    ani.add(f1);
    ani.add(f2);
    ani.add(f3);
    ani.add(f4);
    ani.add(f5);
    ani.add(f6);
    ani.add(f7);
    ani.add(f8);
    ani.add(f9);
    ani.add(f10);
    ani.add(f11);
    ani.add(f12);
    ani.add(key0);
    ani.add(key1);
    ani.add(key2);
    ani.add(key3);
    ani.add(key4);
    ani.add(key5);
    ani.add(key6);
    ani.add(key7);
    ani.add(key8);
    ani.add(key9);
    ani.add(ps);
    ani.add(space);
    ani.add(rightarrow);
    ani.add(leftarrow);
    ani.add(uparrow);
    ani.add(downarrow);
    ani.add(pageup);
    ani.add(pagedown);
    ani.add(home);
    ani.add(end);
    ani.add(caps);
    ani.add(insert);
    
    
  
    p2.add(ani,BorderLayout.CENTER);

    
    ctrl.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\ctrl.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
        a.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\Akey.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
        ckey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\c.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
        alt.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\alt.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
        enter.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\enter.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
         ekey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\e.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
         winkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\win.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          del.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\Del.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          esc.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\esc.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          xkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\x.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          vkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\v.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          bkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\b.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          dkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\d.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          ekey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\e.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          fkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          gkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\g.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          hkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\h.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          jkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\j.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          kkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\k.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          lkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\l.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          mkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\m.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          nkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\n.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          okey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\o.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          pkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\p.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          qkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\q.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          rkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\r.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          skey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\s.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          tkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\t.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          ukey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\u.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          ykey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\y.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          zkey.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\z.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          shift.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\shift.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          back.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\bs.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f1.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f1.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f2.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f2.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f3.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f3.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f4.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f4.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f5.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f5.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f6.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f6.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f7.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f7.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f8.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f8.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f9.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f9.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f10.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f10.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f11.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f11.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          f12.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\f12.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key0.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\0.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key1.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\1.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key2.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\2.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key3.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\3.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key4.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\4.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key5.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\5.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key6.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\6.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key7.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\7.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key8.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\8.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          key9.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\9.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          ps.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\ps.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          space.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\space.png").getImage().getScaledInstance(80, 30, Image.SCALE_DEFAULT)));
          rightarrow.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\rightarrow.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          leftarrow.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\leftarrow.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          uparrow.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\uparrow.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          downarrow.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\downarrow.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          pageup.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\pu.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          pagedown.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\pd.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
           home.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\end.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          end.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\home.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          caps.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\cl.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
          insert.setIcon(new ImageIcon(new ImageIcon("D:\\R.Education\\keyimage\\insert.png").getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));*/
          
    //database call & focus key
    addWindowFocusListener(new WindowAdapter() {
    	public void windowGainedFocus(WindowEvent e) {
	    	u.clear();
	    	u.removeAll(u);
			ans2=db();
			
	        ans.requestFocusInWindow();
	        ans.setFocusable(true);
	        ans.setHideActionText(isFocused());
	    }
	});
	
	//key action listener
	Action actionListener = new AbstractAction() {
     
	public void actionPerformed(ActionEvent actionEvent) {
        actionEvent.getSource();
       
      }
    };
        //image animation
        
    /*  ctrl.setVisible(false);
        a.setVisible(false);
        ckey.setVisible(false);
        alt.setVisible(false);
        enter.setVisible(false);
        ekey.setVisible(false);
        winkey.setVisible(false);
        del.setVisible(false);
        esc.setVisible(false);
        xkey.setVisible(false);
        vkey.setVisible(false);
        bkey.setVisible(false);
        dkey.setVisible(false);
        ekey.setVisible(false);
        fkey.setVisible(false);
        gkey.setVisible(false);
        hkey.setVisible(false);
        jkey.setVisible(false);
        kkey.setVisible(false);
        lkey.setVisible(false);
        mkey.setVisible(false);
        nkey.setVisible(false);
        okey.setVisible(false);
        pkey.setVisible(false);
        qkey.setVisible(false);
        rkey.setVisible(false);
        skey.setVisible(false);
        tkey.setVisible(false);
        ukey.setVisible(false);
        ykey.setVisible(false);
        zkey.setVisible(false);
        alt.setVisible(false);
        shift.setVisible(false);
         back.setVisible(false);
        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
        f6.setVisible(false);
        f7.setVisible(false);
        f8.setVisible(false);
        f9.setVisible(false);
        f10.setVisible(false);
        f11.setVisible(false);
        f12.setVisible(false);
        key0.setVisible(false);
        key1.setVisible(false);
        key2.setVisible(false);
        key3.setVisible(false);
        key4.setVisible(false);
        key5.setVisible(false);
        key6.setVisible(false);
        key7.setVisible(false);
        key8.setVisible(false);
        key9.setVisible(false);
        ps.setVisible(false);
        space.setVisible(false);
        rightarrow.setVisible(false);
        leftarrow.setVisible(false);
        uparrow.setVisible(false);
        downarrow.setVisible(false);
        pageup.setVisible(false);
        pagedown.setVisible(false);
        home.setVisible(false);
        end.setVisible(false);
        caps.setVisible(false);
        insert.setVisible(false);*/
        
        
    
    //answer listener
    ansKey=new KeyListener(){
    	int c=0;
    	
    	public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
	
		}

		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
                        
                      /*  if(e.getKeyCode()==8){
                        back.setVisible(true);
                        }
                        if(e.getKeyCode()==10){
                        enter.setVisible(true);
                        }
                        if(e.getKeyCode()==16){
               		
               		shift.setVisible(true);
                            }
                        if(e.getKeyCode()==17){
               		
               		ctrl.setVisible(true);
                            }
                         if(e.getKeyCode()==18){
               		
               		alt.setVisible(true);
                            }
                            if(e.getKeyCode()==20){
               		
               		caps.setVisible(true);
                            }
                         if(e.getKeyCode()==27){
                         esc.setVisible(true);
                         }
                          if(e.getKeyCode()==32){
                         space.setVisible(true);
                         }
                          if(e.getKeyCode()==33){
                         pageup.setVisible(true);
                         }
                          if(e.getKeyCode()==34){
                         pagedown.setVisible(true);
                         }
                          if(e.getKeyCode()==35){
                         home.setVisible(true);
                         }
                          if(e.getKeyCode()==36){
                         end.setVisible(true);
                         }
                           if(e.getKeyCode()==37){
                         leftarrow.setVisible(true);
                         }
                            if(e.getKeyCode()==38){
                         uparrow.setVisible(true);
                         }
                             if(e.getKeyCode()==39){
                         rightarrow.setVisible(true);
                         }
                                 if(e.getKeyCode()==40){
                         downarrow.setVisible(true);
                         }
                          if(e.getKeyCode()==154){
                         ps.setVisible(true);
                         }
                         if(e.getKeyCode()==48){
                         key0.setVisible(true);
                         }
                         if(e.getKeyCode()==49){
                         key1.setVisible(true);
                         }
                         if(e.getKeyCode()==50){
                         key2.setVisible(true);
                         }
                         if(e.getKeyCode()==51){
                         key3.setVisible(true);
                         }
                         if(e.getKeyCode()==52){
                         key4.setVisible(true);
                         }
                         if(e.getKeyCode()==53){
                         key5.setVisible(true);
                         }
                         if(e.getKeyCode()==54){
                         key6.setVisible(true);
                         }
                         if(e.getKeyCode()==55){
                         key7.setVisible(true);
                         }
                         if(e.getKeyCode()==56){
                         key8.setVisible(true);
                         }
                         
                         if(e.getKeyCode()==57){
                         key9.setVisible(true);
                         }
                        if(e.getKeyCode()==65){
                          a.setVisible(true);
                        }
                         if(e.getKeyCode()==66){
                          bkey.setVisible(true);
                        }
                        if(e.getKeyCode()==67){
                            ckey.setVisible(true);
                        }
                         if(e.getKeyCode()==68){
                          dkey.setVisible(true);
                        }
                        if(e.getKeyCode()==69){
                            ekey.setVisible(true);
                        }
                         if(e.getKeyCode()==70){
                          fkey.setVisible(true);
                        }
                        if(e.getKeyCode()==71){
                          gkey.setVisible(true);
                        }
                        if(e.getKeyCode()==72){
                          hkey.setVisible(true);
                        }
                        if(e.getKeyCode()==74){
                          jkey.setVisible(true);
                        }
                        if(e.getKeyCode()==75){
                          kkey.setVisible(true);
                        }
                        if(e.getKeyCode()==76){
                          lkey.setVisible(true);
                        }
                        if(e.getKeyCode()==77){
                          mkey.setVisible(true);
                        }
                        if(e.getKeyCode()==78){
                          nkey.setVisible(true);
                        }
                        if(e.getKeyCode()==79){
                          okey.setVisible(true);
                        }
                        if(e.getKeyCode()==80){
                          pkey.setVisible(true);
                        }
                        if(e.getKeyCode()==81){
                          qkey.setVisible(true);
                        }
                        if(e.getKeyCode()==82){
                          rkey.setVisible(true);
                        }
                        if(e.getKeyCode()==83){
                          skey.setVisible(true);
                        }
                        if(e.getKeyCode()==84){
                          tkey.setVisible(true);
                        }
                                 
                        if(e.getKeyCode()==85){
                          ukey.setVisible(true);
                        }
                        if(e.getKeyCode()==86){
                        vkey.setVisible(true);
                        }
                        if(e.getKeyCode()==87){
                        winkey.setVisible(true);
                        }
                        if(e.getKeyCode()==88){
                        xkey.setVisible(true);
                        }
                        if(e.getKeyCode()==89){
                          ykey.setVisible(true);
                        }
                         if(e.getKeyCode()==90){
                          zkey.setVisible(true);
                        }
                        if(e.getKeyCode()==112){
                          f1.setVisible(true);
                        }
                                     if(e.getKeyCode()==113){
                          f2.setVisible(true);
                        }
                                     if(e.getKeyCode()==114){
                          f3.setVisible(true);
                        }
                                     if(e.getKeyCode()==115){
                          f4.setVisible(true);
                        }
                                     if(e.getKeyCode()==116){
                          f5.setVisible(true);
                        }
                                     if(e.getKeyCode()==117){
                          f6.setVisible(true);
                        }
                                     if(e.getKeyCode()==118){
                          f7.setVisible(true);
                        }
                                     if(e.getKeyCode()==119){
                          f8.setVisible(true);
                        }
                                     if(e.getKeyCode()==120){
                          f9.setVisible(true);
                        }
                                     if(e.getKeyCode()==121){
                          f10.setVisible(true);
                        }
                                     if(e.getKeyCode()==122){
                          f11.setVisible(true);
                        }
                                     if(e.getKeyCode()==123){
                          f12.setVisible(true);
                        }
                        if(e.getKeyCode()==127){
                             del.setVisible(true);
                         }
                        if(e.getKeyCode()==155){
                             insert.setVisible(true);
                         }*/
			
                        }

		public void keyReleased(KeyEvent e) {
                    /*if(e.getKeyCode()==8){
                        back.setVisible(false);
                        }
			 if(e.getKeyCode()==10){
                        enter.setVisible(false);
                        }
                         if(e.getKeyCode()==16){
               		
               		shift.setVisible(false);
                            }
                         if(e.getKeyCode()==17){
               		
               		ctrl.setVisible(false);
                        }
                          if(e.getKeyCode()==18){
               		
               		alt.setVisible(false);
                            }
                           if(e.getKeyCode()==20){
               		
               		caps.setVisible(false);
                            }
                           if(e.getKeyCode()==27){
                         esc.setVisible(false);
                         }
                            if(e.getKeyCode()==32){
                         space.setVisible(false);
                         }
                             if(e.getKeyCode()==33){
                         pageup.setVisible(false);
                         }
                          if(e.getKeyCode()==34){
                         pagedown.setVisible(false);
                         }
                           if(e.getKeyCode()==35){
                         home.setVisible(false);
                         }
                          if(e.getKeyCode()==36){
                         end.setVisible(false);
                         }
                             if(e.getKeyCode()==37){
                         leftarrow.setVisible(false);
                         }
                            if(e.getKeyCode()==38){
                         uparrow.setVisible(false);
                         }
                             if(e.getKeyCode()==39){
                         rightarrow.setVisible(false);
                         }
                                 if(e.getKeyCode()==40){
                         downarrow.setVisible(false);
                         }
                            if(e.getKeyCode()==154){
                         ps.setVisible(false);
                         }
                            if(e.getKeyCode()==48){
                         key0.setVisible(false);
                         }
                         if(e.getKeyCode()==49){
                         key1.setVisible(false);
                         }
                         if(e.getKeyCode()==50){
                         key2.setVisible(false);
                         }
                         if(e.getKeyCode()==51){
                         key3.setVisible(false);
                         }
                         if(e.getKeyCode()==52){
                         key4.setVisible(false);
                         }
                         if(e.getKeyCode()==53){
                         key5.setVisible(false);
                         }
                         if(e.getKeyCode()==54){
                         key6.setVisible(false);
                         }
                         if(e.getKeyCode()==55){
                         key7.setVisible(false);
                         }
                         if(e.getKeyCode()==56){
                         key8.setVisible(false);
                         }
                         
                         if(e.getKeyCode()==57){
                         key9.setVisible(false);
                         }
                         if(e.getKeyCode()==65){
                         a.setVisible(false);
                         }
                        if(e.getKeyCode()==66){
                          bkey.setVisible(false);
                        }
                        if(e.getKeyCode()==67){
                         ckey.setVisible(false);
                         }
                        if(e.getKeyCode()==68){
                          dkey.setVisible(false);
                        }
                        if(e.getKeyCode()==69){
                            ekey.setVisible(false);
                        }
                        if(e.getKeyCode()==70){
                          fkey.setVisible(false);
                        }
                        if(e.getKeyCode()==71){
                          gkey.setVisible(false);
                        }
                        if(e.getKeyCode()==72){
                          hkey.setVisible(false);
                        }
                        if(e.getKeyCode()==74){
                          jkey.setVisible(false);
                        }
                        if(e.getKeyCode()==75){
                          kkey.setVisible(false);
                        }
                        if(e.getKeyCode()==76){
                          lkey.setVisible(false);
                        }
                        if(e.getKeyCode()==77){
                          mkey.setVisible(false);
                        }
                        if(e.getKeyCode()==78){
                          nkey.setVisible(false);
                        }
                        if(e.getKeyCode()==79){
                          okey.setVisible(false);
                        }
                        if(e.getKeyCode()==80){
                          pkey.setVisible(false);
                        }
                        if(e.getKeyCode()==81){
                          qkey.setVisible(false);
                        }
                        if(e.getKeyCode()==82){
                          rkey.setVisible(false);
                        }
                        if(e.getKeyCode()==83){
                          skey.setVisible(false);
                        }
                                          
                        if(e.getKeyCode()==84){
                          tkey.setVisible(false);
                        }
                        if(e.getKeyCode()==85){
                          ukey.setVisible(false);
                        }
                         if(e.getKeyCode()==86){
                        vkey.setVisible(false);
                        }
                         if(e.getKeyCode()==87){
                        winkey.setVisible(false);
                        }
                         if(e.getKeyCode()==88){
                        xkey.setVisible(false);
                        }
                                  if(e.getKeyCode()==89){
                          ykey.setVisible(false);
                        }
                                           if(e.getKeyCode()==90){
                          zkey.setVisible(false);
                        }
                                           if(e.getKeyCode()==112){
                          f1.setVisible(false);
                        }
                                           if(e.getKeyCode()==113){
                          f2.setVisible(false);
                        }
                                           if(e.getKeyCode()==114){
                          f3.setVisible(false);
                        }
                                            if(e.getKeyCode()==115){
                          f4.setVisible(false);
                        }
                                             if(e.getKeyCode()==116){
                          f5.setVisible(false);
                        }
                                              if(e.getKeyCode()==117){
                          f6.setVisible(false);
                        }
                                               if(e.getKeyCode()==118){
                          f7.setVisible(false);
                        }
                                                if(e.getKeyCode()==119){
                          f8.setVisible(false);
                        }
                                                 if(e.getKeyCode()==120){
                          f9.setVisible(false);
                        }
                                                  if(e.getKeyCode()==121){
                          f10.setVisible(false);
                        }
                                                   if(e.getKeyCode()==122){
                          f11.setVisible(false);
                        }
                                  if(e.getKeyCode()==123){
                          f12.setVisible(false);
                        }
                         if(e.getKeyCode()==127){
                             del.setVisible(false);
                         }
                         if(e.getKeyCode()==155){
                             insert.setVisible(false);
                         }*/
			ans.removeKeyListener(nxtPaKey);
			int b=e.getKeyCode();
				c+=b;
				u.add(c);
				System.out.println("Key pressed code="+b);
		}
	};
	
	//next page key listener
	 nxtPaKey=new KeyListener(){
	   	public void keyPressed(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   	}
	   	public void keyReleased(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   		if(arg0.getKeyCode()==10){
	   			System.out.println("Key pressed code="+u.get(u.size()-1));
	   			if(ans2==u.get(u.size()-1)){
	   				cor=cor+1;
	   				
	   			 try
	   		    {
	   		         Class.forName("com.mysql.jdbc.Driver");
	   		         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tezfuerza", "root", "");
	   		         String sql="UPDATE winexpert SET earned_mark=? WHERE stud_individual_id=?";
	   		         PreparedStatement ps = con.prepareStatement(sql);
	   		         ps.setString(1, ""+cor+"");
	   		         ps.setString(2, userId);
	   		         ps.executeUpdate();
	   		         System.out.println("inserted "+cor);
	   		}

	   		catch(Exception e)
	   		{
	   			 System.out.println("failed "+e);
	   			
	   		}
	   				System.out.println("Ans correct "+cor);
	   				u.clear();
	   				u.removeAll(u);
	   				chrono.stop();
	   				dispose();
	   				ans.removeKeyListener(ansKey);
	   				nxtPa.removeKeyListener(nxtPaKey);
	   				new QuestionGenerator(userName, userId);
	   				}
	   			else{
	   				System.out.println("Ans worng "+cor);
	   				u.clear();
	   				u.removeAll(u);
	   				chrono.stop();
	   				dispose();
	   				ans.removeKeyListener(ansKey);
	   				nxtPa.removeKeyListener(nxtPaKey);
	   				new QuestionGenerator(userName, userId);
	   		}	
	   		}
	   		}

	   	public void keyTyped(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   	}
	   };
	
	   //key listener remover
    ans.addKeyListener(ansKey);
    ans.setFont(new Font("MV Boli", Font.BOLD, 20));
    ans.setBackground(Color.BLACK);
    ans.setForeground(Color.WHITE);
    nxtPa.addKeyListener(nxtPaKey);
    nxtPa.setFont(new Font("MV Boli", Font.BOLD, 20));
    nxtPa.setBackground(Color.BLACK);
    nxtPa.setForeground(Color.WHITE);
	pack();
    p.add(ans,BorderLayout.WEST);
    p.add(nxtPa,BorderLayout.EAST);    
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    //setResizable(false);
    getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    setVisible(true);
    cl+=1;
  }else{
	  setVisible(false);
      dispose();
      System.out.println("finsh");
      nxtPa.removeKeyListener(nxtPaKey);
      ans.removeKeyListener(ansKey);
    // new About();
    new Finish(userName,userId);
 }
      
	
}

//database
public int db(){
	nxtPa.removeKeyListener(ansKey);
    ans.removeKeyListener(nxtPaKey);
try {                 
	
    Class.forName(driverName);                
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tezfuerza", "root", "");
    String sql="SELECT Que,Ans FROM winexpertques ORDER BY RAND() LIMIT 1" ;
    
    PreparedStatement pst=con.prepareStatement(sql);

    ResultSet rs=pst.executeQuery();
   // boolean x = rs.next();
    while(rs.next())
    {
    	chrono.start ();
    	System.out.println("hi22 ");
    	Que=rs.getString("Que");
        ans1=rs.getInt("Ans");
        System.out.println(ans1);
        Ques.setText("<html><body><centre>"+Que+"</center></body></html>");
        p2.add(Ques,BorderLayout.NORTH);
         
     }
    return ans1;
}

catch(Exception e)
{
	 System.out.println("failed "+e);
	 return 0;
}
}

//timer
@SuppressWarnings({ "static-access", "deprecation" })
public void run() {
    int seconds=30;
   
    try {
    	
    for(;;)
    {
            seconds--;
            name.setText("                      "+userName);
            time.setText(" Time is going :"+seconds);
            chrono.sleep(1000);
    
    if(seconds<=0){
    	seconds=30;
    	setVisible(false);
        
        System.out.println("time out");
        nxtPa.removeKeyListener(nxtPaKey);
        ans.removeKeyListener(ansKey);
       new QuestionGenerator(userName,userId);
        chrono.stop();
    }
    }
    }
    
    catch (InterruptedException e) { System.out.println(e.getMessage()); }
}

    

}
