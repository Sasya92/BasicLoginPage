import java.awt.*;
import javax.swing.*;  
public class Dem {  
     Dem()  
        {  
        Frame f= new Frame("Login page");
        f.setBackground(Color.lightGray);    
        JLabel l1=new JLabel("Username");
        l1.setBounds(500,200, 200, 30);
        TextField t1 = new TextField("");
        t1.setBounds(600,200,200,30);
        JLabel l2=new JLabel("Password");
        JPasswordField t2 = new JPasswordField("");
        t2.setBounds(600,250,200,30);
        l2.setBounds(500, 250, 200, 30);
        Button b1=new Button("Login");    
        b1.setBounds(620,300,100,30);    
        b1.setBackground(Color.white);  
        JLabel l3=new JLabel("Forgot Password ?");
        l3.setBounds(500,350,150,30);
        JLabel l4=new JLabel("Create Account");
        l4.setBounds(720,350,150,30);
           f.add(b1);
           f.add(l1);
           f.add(l2);
           f.add(t1);
           f.add(t2);
           f.add(l3);
           f.add(l4);
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
        }  
        public static void main(String args[])  
        {  
        new Dem();  
        }  
}
