package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    fastCash(String pin){
        this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newatm.png"));
        Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,800);
        add(l3);

        JLabel label = new JLabel("Select withdrawal amount");
        label.setBounds(445,220,300,30);
        label.setForeground(Color.black);
        label.setFont(new Font("system", Font.BOLD,18));
        l3.add(label);

        b1 = new JButton("Rs. 100");
        b1.setFont(new Font("system", Font.BOLD,16));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBounds(285,276,180,24);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setFont(new Font("system", Font.BOLD,16));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setBounds(282,318,180,24);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setFont(new Font("system", Font.BOLD,16));
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.setBounds(279,360,180,24);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setFont(new Font("system", Font.BOLD,16));
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.setBounds(662,276,180,24);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setFont(new Font("system", Font.BOLD,16));
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.setBounds(665,318,180,24);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setFont(new Font("system", Font.BOLD,16));
        b6.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.setBounds(668,360,180,24);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("back");
        b7.setFont(new Font("system", Font.BOLD,16));
        b7.setForeground(Color.white);
        b7.setBackground(Color.black);
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

        if (e.getSource()==b7) {
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("deposit")){
                        balance -= Integer.parseInt(resultSet.getString("amount"));


                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));

                    }
                }String num ="17";

                if (e.getSource() != b7 && balance < Integer.parseInt(amount)){

                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;




                }

                c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");

            }catch (Exception E){
                E.printStackTrace();
            }

            setVisible(false);
            new main_Class(pin);
        }


    }

    public static void main(String[] args){
        new fastCash("");

    }
}

