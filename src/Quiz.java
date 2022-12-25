import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
   // String username;
    Quiz() //constructor
    {
        setBounds(500,200,1100,500);

        setTitle("Welcome to java Quiz");
        getContentPane().setBackground(Color.cyan);
        // position of image
        setLayout(null);
        // image object
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("Quiz.jpg"));
        JLabel l1=new JLabel(il);
        l1.setBounds(0,0,600,500);
        //add image
        add(l1);
       JLabel l2=new JLabel("Welcome to java Quiz");
       l2.setBounds(650,50,400,50);
       l2.setFont(new Font("Algerian",Font.BOLD,30));
       add(l2);
       JLabel l3=new JLabel("Enter Your Name =");
        l3.setForeground(new Color(10,50,30));
        l3.setFont(new Font("Arial",Font.BOLD,15));
        l3.setBounds(650,150,200,30);
        add(l3);
        //add text fields
        t1=new JTextField();
        t1.setBounds(650,180,300,30);
        t1.setFont(new Font("Finer Hand Bait",Font.BOLD,20));
        add(t1);
        setVisible(true);
        b1=new JButton("Start ");
        b1.setBounds(635,270,120,25);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.blue);
        add(b1);
        b1.addActionListener(this);
        b2=new JButton("Exit");
        b2.setBounds(815,270,120,25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.blue);
        add(b2);
       b2.addActionListener(this);
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==b1)
        {
         String name =t1.getText();
         this.setVisible(false);
         new Rules(name);
        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Quiz();

    }
    }