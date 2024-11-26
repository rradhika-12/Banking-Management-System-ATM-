package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName ,textfName, textEmail, textAdd, textcity, textpin, textstate;

    JDateChooser dateChooser;
    Random r = new Random();
    long first4 = (Math.abs(r.nextLong()) % 9000L) + 1000L; // Ensure positive value
    String first = " " + first4;

    Signup() {
        super("Application Form");

        // Set up image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.ico"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(35, 10, 120, 120);
        add(image);

        // Add main label
        JLabel label1 = new JLabel("Application Form No.");
        label1.setBounds(160, 20, 400, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 28));
        add(label1);

        JLabel label2 = new JLabel(" Page 1 ");
        label2.setBounds(300, 70, 600, 30);
        label1.setFont(new Font("Ralway", Font.BOLD, 28));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 40);
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(90,180,200,22);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,15));
        textName.setBounds(300,180,300,22);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(90,220,200,22);
        add(labelfName);

        textfName = new JTextField();
        textfName.setFont(new Font("Ralway",Font.BOLD,15));
        textfName.setBounds(300,220,300,22);
        add(textfName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(90,260,200,22);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,260,300,22);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(90,300,200,22);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway", Font.BOLD,14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300,300, 120,22);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway", Font.BOLD,14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450,300, 150,22);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
        labelEmail.setBounds(90,340,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,15));
        textEmail.setBounds(300,340,300,22);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD,20));
        labelMs.setBounds(90,380,200,30);
        add(labelMs);


        m1 = new JRadioButton("Maried");
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Ralway", Font.BOLD,14));
        m1.setBounds(300,380, 100,22);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222, 255, 228));
        m2.setFont(new Font("Ralway", Font.BOLD,14));
        m2.setBounds(400,380, 100,22);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222, 255, 228));
        m3.setFont(new Font("Ralway", Font.BOLD,14));
        m3.setBounds(520,380, 100,22);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD,20));
        labelAdd.setBounds(90,420,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,15));
        textAdd.setBounds(300,420,300,22);
        add(textAdd);


        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD,20));
        labelCity.setBounds(90,460,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Ralway",Font.BOLD,15));
        textcity.setBounds(300,460,300,22);
        add(textcity);


        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD,20));
        labelPin.setBounds(90,500,200,30);
        add(labelPin);

        textpin = new JTextField();
        textpin.setFont(new Font("Ralway",Font.BOLD,15));
        textpin.setBounds(300,500,300,22);
        add(textpin);


        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD,20));
        labelState.setBounds(90,540,200,30);
        add(labelState);

        textstate = new JTextField();
        textstate.setFont(new Font("Ralway",Font.BOLD,15));
        textstate.setBounds(300,540,300,22);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,700,80,30);
        next.addActionListener(this);
        add(next);

        // Display the random number
        JLabel formNumber = new JLabel(first);
        formNumber.setBounds(160, 60, 400, 40);
        formNumber.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(formNumber);

        // Set background color and frame properties
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textfName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";

        }

        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }


        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);



            }

        }catch (Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Signup(); // Launch the Signup form
    }
}
