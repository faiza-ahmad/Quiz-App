import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton B1;
    Score(String username,int Score)
    {
       setBounds(600,150,750,550);
       getContentPane().setBackground(Color.WHITE);
        setTitle("Welcome to java Quiz");
       setLayout(null);
       ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("Score.jpg"));
       JLabel l1=new JLabel(il);
       l1.setBounds(250,10,300,200);
       add(l1);
       JLabel l2=new JLabel("Thank you " +username+" For playing Java Quiz");
       l2.setBounds(100,400,700,100);
       l2.setFont(new Font("Algerian",Font.BOLD,25));
       add(l2);
        JLabel l3=new JLabel(" your Score is  " +Score);
        l3.setBounds(150,200,700,100);
        l3.setFont(new Font("Jokerman",Font.BOLD,35));
        l3.setForeground(new Color(199,21,133));
        add(l3);
        B1=new JButton("Play Again");
        B1.setBackground(Color.cyan);
        B1.setForeground(Color.WHITE);
        B1.setBounds(250,300,120,30);
        B1.addActionListener(this);
        add(B1);

    }
    public  void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == B1) {
            this.setVisible(false);
            new Quiz().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Score("",0).setVisible(true);
    }
}
