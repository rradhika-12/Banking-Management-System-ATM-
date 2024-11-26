package bank.management.system;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String formno){
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.ico"));
        Image i2 = i1.getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120, 10, 140, 140);
        add(image);

        JLabel l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(300, 40, 600, 50);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(300, 60, 600, 50);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100, 160, 600, 50);
        add(l3);

        r1 = new JRadioButton("Saving Account ");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(150, 220, 250, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account ");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(450, 220, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current Account ");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(150, 260, 250, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account ");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(450, 260, 250, 20);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100, 300, 600, 50);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        l5.setBounds(100, 335, 300, 18);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4881");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(420, 300, 600, 50);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 14));
        l7.setBounds(420, 335, 500, 18);
        add(l7);

        JLabel l8 = new JLabel("Pin:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 355, 600, 50);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(420, 355, 300, 50);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 14));
        l10.setBounds(100, 390, 600, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 420, 600, 50);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 465, 200, 20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(400, 465, 200, 20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 495, 200, 20);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(400, 495, 200, 20);
        add(c4);

        c5 = new JCheckBox("Check Book");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 525, 200, 20);
        add(c5);

        c6 = new JCheckBox("E-Statemant");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(400, 525, 200, 20);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details are correct to the best of my knowledge.", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 565, 600, 15);
        add(c7);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 12));
        l12.setBounds(660, 30, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        l13.setBounds(760, 30, 60, 30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250, 660, 100, 30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(450, 660, 100, 30);
        c.addActionListener(this);
        add(c);



        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        }else if (r2.isSelected()){
            atype = "Fixed Deposit Account";
        }else if (r2.isSelected()) {
            atype = "Current Account";
        }else if (r2.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()) {
            fac = fac + "ATM CARD ";
        }else if (c2.isSelected()){
            fac = fac+"Internet Banking";
        }else if (c3.isSelected()){
            fac = fac+"Mobile Banking";
        }else if (c3.isSelected()) {
            fac = fac + "EMAIL Alerts";
        }else if (c3.isSelected()) {
            fac = fac + "Cheque Book";
        }else if (c3.isSelected()) {
            fac = fac + "E-Statement";
        }


        try {
            if (e.getSource() == s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('" + formno + "', '" + atype + "', '" + cardno + "', '" + pin + "', '" + fac + "')";
                    String q2 = "insert into login values('" + formno + "', '" + cardno + "', '" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);

                    JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\n Pin :" + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if (e.getSource()==c){
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args){
        new Signup3("");
    }
}
