package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    main_Class(String pin){
        this.pin = pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newatm.png"));
        Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,800);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction ");
        label.setBounds(445,220,300,30);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("System", Font.BOLD,18));
        l3.add(label);

        b1 = new JButton("Deposit");
        b1.setFont(new Font("System", Font.BOLD,16));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(285,276,180,24);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Cash Withdrawal");
        b2.setFont(new Font("System", Font.BOLD,16));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(282,318,180,24);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Fast Cash");
        b3.setFont(new Font("System", Font.BOLD,16));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(279,360,180,24);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Mini Statement");
        b4.setFont(new Font("System", Font.BOLD,16));
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setBounds(662,276,180,24);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Pin Change");
        b5.setFont(new Font("System", Font.BOLD,16));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.setBounds(665,318,180,24);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Balance Enquiry");
        b6.setFont(new Font("System", Font.BOLD,16));
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.setBounds(668,360,180,24);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("Exit");
        b7.setFont(new Font("System", Font.BOLD,16));
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        b7.setBounds(671,400,180,24);
        b7.addActionListener(this);
        l3.add(b7);


        setLayout(null);
        setSize(1400,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawal(pin);
            setVisible(false);

        }else if (e.getSource()==b6) {
            new balanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new fastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }


    }

    public static void main(String[] args){
        new main_Class("");
    }
}
