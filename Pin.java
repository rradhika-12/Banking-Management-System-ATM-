package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;

    String pin;

    Pin(String pin){
        this.pin =pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newatm.png"));
        Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,800);
        add(l3);


        JLabel label1 = new JLabel("Change your PIN");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System", Font.BOLD, 20));
        label1.setBounds(360,240,400,30);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN : ");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System", Font.BOLD, 20));
        label2.setBounds(360,270,400,30);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(360,300,320,25);
        p1.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN : ");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("System", Font.BOLD, 20));
        label3.setBounds(360,330,400,30);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(360,360,320,25);
        p2.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.add(p2);

        b1 = new JButton("Change");
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

        try{

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args){
        new Pin("");
    }
}
