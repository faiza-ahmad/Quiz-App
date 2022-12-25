import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        setTitle(" Rules of java Quiz");
        getContentPane().setBackground(Color.pink);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome " + username + " in Java Quiz");
        l1.setForeground(new Color(190, 0, 0));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
                "<html>"+
                        "1:- Choose One Option "+"<br><br>"+
                        "2:-Every Correct answer contain 10 mark " + "<br><br>"
                        +"3:-This quiz is only for your checking level don't do cheating " + "<br><br>" +
                        "4:- It is Based on Core Java " + "<br><br>" +
                        "5:- Don't think too much just do it fast" + "<br><br>"
                        +"6:- There is No Negative Marking" + "<br><br>"
                        +"7:- Each Question should be answer in 15 Second" + "<br><br>"
                        +"8:- Do your best GOOD LUCK" + "<br><br>"+
                        "<html>"
        );
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Quiz().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Mind("").setVisible(true);
        }
    }

    public static void main(String[] args){

        new Rules("");
    }
}