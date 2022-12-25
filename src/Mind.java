import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mind extends JFrame implements ActionListener  {
    JButton Next,Submit;
    public  static int Count=0;
    public  static int Score=0;
    public  static  int timer=15;
    public static int Ans=0;
    JLabel qno,qus;
    ButtonGroup opts;
    JRadioButton opt,opt1,opt2,opt3;
    String q[][]=new String[10][5];
    String pa[][]=new String[10][1];
    String qa[][]=new String[10][2];
    String username;
    Mind(String username){
        this.username = username;
        setBounds(250, 50, 1440, 950);
        getContentPane().setBackground(Color.pink);
        setTitle("Welcome to java Quiz");
        setLayout(null);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("Mindpic1.jpg"));
        Image i2 = il.getImage().getScaledInstance(1440, 392, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1440, 392);
        add(l1);
        qno=new JLabel("");
        qno.setFont(new Font("Tacoma",Font.PLAIN,24));
        qno.setBounds(100,450,50,35);
        add(qno);
        qus=new JLabel(" ");
        qus.setFont(new Font("Tacoma",Font.PLAIN,24));
        qus.setBackground(Color.white);
        qus.setBounds(140,450,1000,30);
        add(qus);
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";

        qa[0][1]="JDB";
        qa[1][1]="int";
        qa[2][1]="java.util package";
        qa[3][1]="Marker Interface";
        qa[4][1]="Heap Memory";
        qa[5][1]="Remote Interface";
        qa[6][1]="import";
        qa[7][1]="Java Archive";
        qa[8][1]="java.lang.StringBuilder";
        qa[9][1]="Bytecode is executed by JVM";


        opt=new JRadioButton("yes");
        opt.setBounds(170,520,500,30);
        opt.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt);
        opt1=new JRadioButton("No");
        opt1.setBounds(170,560,500,30);
        opt1.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt1);
        opt2=new JRadioButton("May be or May be not");
        opt2.setBounds(170,600,500,30);
        opt2.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt2);
        opt3=new JRadioButton("Don't No");
        opt3.setBounds(170,640,500,30);
        opt3.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt3);
        opts=new ButtonGroup();
        opts.add(opt);
        opts.add(opt1);
        opts.add(opt2);
        opts.add(opt3);
        Next=new JButton("Next");
        Next.addActionListener(this);
        Next.setBounds(1100,550,130,30);
        Next.setFont(new Font("Tacoma",Font.PLAIN,22));
        add(Next);
        Submit=new JButton("Submit");
        Submit.setBounds(1100,600,130,30);
        Submit.setEnabled(false);
        Submit.addActionListener(this);
        Submit.setFont(new Font("Tacoma",Font.PLAIN,22));
        add(Submit);
        start(0);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Next){
            repaint();
            opt.setEnabled(true);
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            Ans=1;
            if(opts.getSelection()==null){
                pa[Count][0]="";
            }else {
                pa[Count][0]=opts.getSelection().getActionCommand();
            }
            if(Count==8)
            {
                Next.setEnabled(false);
                Submit.setEnabled(true);
            }
            Count++;
            start(Count);
        }
        else if(ae.getSource()==Submit){
            Ans=1;
            if(opts.getSelection()==null){
                pa[Count][0]="";
            }else {
                pa[Count][0]=opts.getSelection().getActionCommand();
            }
            for(int i=0; i<pa.length; i++){
                if(pa[i][0].equals(qa[i][1])){
                    Score+=10;
                }else{
                    Score+=0;
                }
            }
            this.setVisible(false);
            new Score(username,Score).setVisible(true);
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        String time="Time Left - "+timer+" seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tacoma",Font.BOLD,25));

        if(timer > 0){
            g.drawString(time,1100,500);
        }else
        {
            g.drawString("Times up !!",1100,500);
        }
        timer--; //14
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            e.printStackTrace();
        }
            if(Ans==1) {
                Ans=0;
                timer = 15;
            }
           else if(timer<0){
                timer=15;
                opt.setEnabled(true);
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);

            if(Count==8){
                Next.setEnabled(false);
                Submit.setEnabled(true);
            }
            if(Count==9){
                if(opts.getSelection()==null){
                    pa[Count][0]="";
                }else {
                    pa[Count][0]=opts.getSelection().getActionCommand();
                }
                for(int i=0; i<pa.length; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        Score+=10;
                    }else{
                        Score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username,Score).setVisible(true);
            }else {
                if (opts.getSelection() == null) {
                    pa[Count][0] = "";
                } else {
                    pa[Count][0] = opts.getSelection().getActionCommand();
                }
                Count++;
                start(Count);
            }
           }
    }
    public void start (int count){
        qno.setText(""+(count+1)+" :-");
        qus.setText(q[count][0]);
        opt.setLabel(q[count][1]);
        opt.setActionCommand(q[count][0]);
        opt1.setLabel(q[count][2]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][3]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][4]);
        opt3.setActionCommand(q[count][3]);
        opts.clearSelection();

    }
    public static void main(String[] args) {
        new Mind("").setVisible(true);
    }
}
