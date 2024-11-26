package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;


    JRadioButton r1,r2,e1,e2;
    JButton next;

    String formno;

    Signup2(String formno){
        super ("Application Form");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.ico"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120, 10, 120, 120);
        add(image);

        this.formno = formno;


        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(300, 40, 600, 50);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(300, 70, 600, 50);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(120,140, 140, 30);
        add(l3);

        String religion [] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,70));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350,140,300,35);
        add(comboBox);


        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(120,190, 140, 30);
        add(l4);


        String Category [] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,70));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350,190,300,35);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(120, 240, 140, 30);
        add(l5);

        String income [] = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,70));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350,240,300,35);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(120, 290, 140, 30);
        add(l6);

        String educational [] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,70));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350,290,300,35);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(120, 340, 140, 30);
        add(l7);

        String occupation [] = {"Salarised", "Self-Employed", "Business", "Student", "Retired", "Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,70));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350,340,300,35);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(120, 390, 140, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Ralway",Font.BOLD,15));
        textPan.setBounds(350,390,300,35);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(120, 440, 160, 30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Ralway",Font.BOLD,15));
        textAadhar.setBounds(350,440,300,35);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen  : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(120, 490, 160, 30);
        add(l10);


        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 70));
        r1.setBounds(350, 490, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 70));
        r2.setBounds(500, 490, 100, 30);
        add(r2);



        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(120, 540, 160, 30);
        add(l11);


        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 70));
        e1.setBounds(350, 540, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 70));
        e2.setBounds(500, 540, 100, 30);
        add(e2);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 12));
        l12.setBounds(660, 30, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        l13.setBounds(760, 30, 60, 30);
        add(l13);


        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(580,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(900,750);
        setLocation(360,80);
        getContentPane().setBackground(new Color(251,220,75));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = String.valueOf(comboBox.getSelectedIndex());
        String cate = String.valueOf(comboBox2.getSelectedIndex());
        String inc = String.valueOf(comboBox.getSelectedIndex());
        String edu = String.valueOf(comboBox2.getSelectedIndex());
        String occ = String.valueOf(comboBox.getSelectedIndex());


        String pan = textPan.getText();
        String aadhar = textPan.getText();

        String scitizen = "";
        if ((r1.isSelected())){
            scitizen = "Yes";
        }else if (r2.isSelected()){
            scitizen = "No";
        }
        String eAccount = "";
        if ((r1.isSelected())){
            eAccount = "Yes";
        }else if (r2.isSelected()) {
            eAccount = "No";
        }
        try {
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into Signuptwo values('" + formno + "', '" + rel + "', '" + cate + "', '" + inc + "', '" + edu + "', '" + occ + "', '" + pan + "', '" + aadhar + "', '" + scitizen + "', '" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);


            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }


}
