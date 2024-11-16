import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.awt.*;
import java.util.HashMap;

public class SignUp {
    JFrame SignUpWindow = new JFrame();
    JPanel SignUpPanel = new JPanel();
    JLabel SignUpLabel = new JLabel("Welcome to the Sign Up Page");
    JTextField SignUpText = new JTextField();
    JPasswordField SignUpPassword = new JPasswordField();
    JButton SubmitButton = new JButton("Submit");
    JLabel userIDLabel = new JLabel("Name");
    JLabel userPasswordLabel = new JLabel("Create Password");
    public SignUp() {


        // UserID label and userPassword label
        userIDLabel.setBounds(10,100,200,20);
        userPasswordLabel.setBounds(10,150,200,20);
        SignUpPassword.setEchoChar('*');
        SignUpPassword.setBounds(125,150,200,20);
        SignUpText.setBounds(125,100,200,25);
        // Submit button
        SubmitButton.setBounds(0,0,100,25);
        SubmitButton.setLocation(180,200);
        SubmitButton.setVisible(true);

        //Sign up panel settings
        SignUpPanel.setBackground(Color.LIGHT_GRAY);
        SignUpPanel.setLayout(null);
        SignUpPanel.setBounds(0, 0, 500, 500);
        SignUpPanel.setLocation(550,200);
        SignUpPanel.setVisible(true);
        SignUpLabel.setBounds(0,0,450,35);
        SignUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SignUpLabel.setForeground(Color.black);
        // Usage of container
        SignUpWindow.getContentPane();
        Container kdkd = SignUpWindow.getContentPane();
        kdkd.setBackground(Color.LIGHT_GRAY);

        //SignUpWindow.setSize(500,500);
        SignUpWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        SignUpWindow.setResizable(false);
        SignUpWindow.setLayout(null);
        SignUpWindow.setVisible(true);
        SignUpWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SignUpWindow.add(SignUpPanel);
        SignUpPanel.add(SignUpLabel);
        SignUpPanel.add(SubmitButton);
        SignUpPanel.add(SignUpText);
        SignUpPanel.add(SignUpPassword);
        SignUpPanel.add(userIDLabel);
        SignUpPanel.add(userPasswordLabel);
    }

}
