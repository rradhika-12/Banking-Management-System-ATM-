package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton b1, b2;


    Withdrawal(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newatm.png"));
        Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,800);
        add(l3);


        JLabel label1 = new JLabel("Maximum Withdrawal is Rs. 10,000 ");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System", Font.BOLD, 20));
        label1.setBounds(408,250,700,30);
        l3.add(label1);

        JLabel label2 = new JLabel("Please Enter Your Amount ");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System", Font.BOLD, 20));
        label2.setBounds(420,280,400,30);
        l3.add(label2);


        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(410,310,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.add(textField);

        b1 = new JButton("Withdrawal");
        b1.setBounds( 740, 356, 100, 25);
        b1.setBackground(new Color(60,125,120));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds( 742, 394, 100, 25);
        b2.setBackground(new Color(60,125,120));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1400,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1) {


            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }

                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("Insert into bank values('" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }


            } catch (Exception E) {

            }

        }else if (e.getSource()==b2) {
            setVisible(false);
            new main_Class(pin);

        }
    }

    public static void main(String[] args){
        new Withdrawal(" ");
    }
}
