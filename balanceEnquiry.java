package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquiry extends JFrame implements ActionListener {

    String pin;
    JLabel label2;
    JButton b1;


    balanceEnquiry(String pin){
        this.pin =pin;




        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newatm.png"));
        Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,800);
        add(l3);


        JLabel label1 = new JLabel("Your Current balance is Rs. ");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System", Font.BOLD, 20));
        label1.setBounds(408,250,700,30);
        l3.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System", Font.BOLD, 20));
        label2.setBounds(420,280,400,30);
        l3.add(label2);

        b1 = new JButton("Back");
        b1.setBounds( 740, 396, 100, 25);
        b1.setBackground(new Color(60,125,120));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance =0;
        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }



        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);




        setLayout(null);
        setSize(1400,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args) {
        new balanceEnquiry("");


}


}
