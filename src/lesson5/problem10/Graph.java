package lesson5.problem10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Graph extends JFrame {
    JFrame j=new JFrame();
    JButton plus=new JButton("+");
    JButton minus=new JButton("-");
    JButton div=new JButton("/");
    JButton mul=new JButton("*");
    JButton eq=new JButton("=");
    JButton clear=new JButton("cls");
    JTextField jta=new JTextField(100);
    JTextField jtb=new JTextField(100);
    JLabel jlr=new JLabel("Результат: ");
    Font font=new Font("Calibri", Font.BOLD, 20);

    DecimalFormat df=new DecimalFormat("#.####");
    public char sing;
    public double x=0.0;
    public double y=0.0;
    public double r=0.0;

    public Graph()
    {
        setLayout(null);
        j.setBounds(10,10,1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        plus.setBounds(400, 200, 100, 100);
        minus.setBounds(600, 200, 100, 100);
        div.setBounds(800, 200, 100, 100);
        mul.setBounds(1000, 200, 100, 100);
        eq.setBounds(650, 500, 200, 50);
        clear.setBounds(1300, 600, 100, 100);
        add(plus);
        add(minus);
        add(div);
        add(mul);
        add(eq);
        add(clear);

        jta.setBounds(650, 50, 200, 50);
        jta.setFont(font);
        add(jta);

        jtb.setBounds(650, 375, 200, 50);
        jtb.setFont(font);
        add(jtb);

        jlr.setBounds(550, 600, 200, 50);
        jlr.setFont(font);
        add(jlr);
        plus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sing='+';
            }
        });
        minus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sing='-';
            }
        });
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sing='/';
            }
        });
        mul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sing='*';
            }
        });


        eq.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!jta.getText().matches("[0-9]+")||!jtb.getText().matches("[0-9]+"))
                {
                    System.exit(0);
                }
                x=Double.parseDouble(jta.getText());
                y=Double.parseDouble(jtb.getText());
                switch (sing)
                {
                    case '+': r=x+y;
                        break;
                    case '-': r=x-y;
                        break;
                    case '/':
                    {
                        if(y==0.0)
                        {
                            System.exit(0);
                        }
                        else r=x/y;
                    }
                    break;
                    case '*': r=x*y;
                        break;
                }
                jlr.setText("Результат: "+df.format(r));
            }
        });
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jta.setText(null);
                jtb.setText(null);
                jlr.setText("Результат: ");
            }
        });
    }
    public static void main(String[] args)
    {
        Graph graph=new Graph();
        graph.setVisible(true);
    }
}
