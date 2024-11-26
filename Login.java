package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;

    JTextField textField2;
    JPasswordField passwordField2;

    JButton button1, button2, button3;
    Login(){
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.ico"));
        Image i2 = i1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 120, 120);
        add(image);
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/cardimage.ico"));
        Image j2 = j1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel jmagee = new JLabel(j3);
        jmagee.setBounds(600, 280, 120, 120);
        add(jmagee);
        label1 = new JLabel("Welcome To ATM");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 24));
        label1.setBounds(320, 140, 400, 40);
        add(label1);
        label2 = new JLabel("CARD NUMBER : ");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Ralway", Font.BOLD, 20));
        label2.setBounds(180, 180, 400, 40);
        add(label2);
        textField2 = new JTextField(15);
        textField2.setBounds(380, 190, 300, 20);
        textField2.setFont(new Font("Arial", Font.BOLD,20));
        add(textField2);
        label3 = new JLabel("PIN : ");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("AvantGarde", Font.BOLD, 20));
        label3.setBounds(180, 220, 400, 20);
        add(label3);
        passwordField2 = new JPasswordField(15);
        passwordField2.setBounds(380,220,300,20);
        passwordField2.setFont(new Font("Arial", Font.BOLD, 20));
        add(passwordField2);
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setBounds(270,270,100,30);
        button1.addActionListener(this);
        add(button1);
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        button2.setBounds(390,270,100,30);
        button2.addActionListener(this);
        add(button2);
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.WHITE);
        button3.setBounds(270,320,220,30);
        button3.addActionListener(this);
        add(button3);
        ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/background.ico"));
        Image k2 = k1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon k3 = new ImageIcon(k2);
        JLabel kmagee = new JLabel(k3);
        kmagee.setBounds(0, 0, 850, 480);
        add(kmagee);
        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1){
                Con c = new Con();
                String cardno = textField2.getText();
                String pin = passwordField2.getText();
                String q = "Select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect card number or pin ");
                }
            }else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField2.setText("");
            }else if (e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Login();
    }
}