package Atm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2, b3;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("/java/Atm/icons/bankImage.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);

        // Welcome Label
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setForeground(new Color(0, 0,255));
        l1.setBounds(210,40,450, 40);
        add(l1);

        // Card Number Label
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setForeground(new Color(34, 139, 34)); // Vibrant green
        l2.setBounds(125, 150, 375, 30);
        add(l2);

        // Card Number TextField
        tf1 = new JTextField(15);
        tf1.setBounds(300, 150, 230, 30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        tf1.setBackground(new Color(240, 248, 255)); // Light blue background
        add(tf1);

        // PIN Label
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setForeground(new Color(255, 69, 0)); // Vibrant orange-red
        l3.setBounds(125, 220, 375, 30);
        add(l3);

        // PIN PasswordField
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300, 220, 230, 30);
        pf2.setBackground(new Color(240, 248, 255)); // Light blue background
        add(pf2);

        // Buttons
        b1 = new JButton("SIGN IN");
        b1.setBackground(new Color(60, 179, 113)); // Light green
        b1.setForeground(Color.WHITE);

        b2 = new JButton("CLEAR");
        b2.setBackground(new Color(255, 99, 71)); // Light red
        b2.setForeground(Color.WHITE);

        b3 = new JButton("SIGN UP");
        b3.setBackground(new Color( 10,  186,  181));
        b3.setForeground(Color.WHITE);

        setLayout(null);

        // Button Fonts and Placement
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300, 300, 100, 30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430, 300, 100, 30);
        add(b2);

        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300, 350, 230, 30);
        add(b3);

        // Adding Action Listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Background Color
        getContentPane().setBackground(new Color(173,216,230));

        setSize(800, 480);
        setLocation(250, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                // Add SIGN IN logic here
            } else if (ae.getSource() == b2) {
                tf1.setText("");
                pf2.setText("");
            } else if (ae.getSource() == b3) {
                setVisible(false);
                // Redirect to sign-up page
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}



