import org.jetbrains.annotations.NotNull;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class loginPage implements ActionListener {
    JFrame frame = new JFrame("Login Page");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordFielD = new JPasswordField();
    JLabel userIDLabel = new JLabel("Username");
    JLabel userPasswordLabel = new JLabel("password");
    JLabel messageLabel = new JLabel("");

    HashMap<String,String> loginInfo;

    loginPage(HashMap<String,String> logininforiginal){

        loginInfo = logininforiginal;
        userIDLabel.setBounds(50,100,75,25);
        userIDLabel.setForeground(Color.BLACK);
        userIDLabel.setFont(new Font("Arial",Font.BOLD,15));
        userPasswordLabel.setBounds(50,150,75,25);
        userPasswordLabel.setFont(new Font("Arial",Font.BOLD,15));
        userPasswordLabel.setForeground(Color.BLACK);

        messageLabel.setBounds(125,270,2500,35);
        messageLabel.setForeground(Color.BLACK);
        messageLabel.setFont(new Font(null,Font.BOLD,25));

        userIDField.setBounds(125,100,200,25);
        userPasswordFielD.setBounds(125,150,200,25);
        userPasswordFielD.setEchoChar('*');

        loginButton.setBounds(225,200,100,25);
        loginButton.setFont(new Font(null,Font.BOLD,18));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        JLabel Sign_up = new JLabel("SIGN UP");
        Sign_up.setForeground(Color.BLACK);
        Sign_up.setFont(new Font("Arial",Font.BOLD,15));
        Sign_up.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Sign_up.setBounds(200, 230, 200, 50);
        Sign_up.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == Sign_up) {
                    SignUp SignUpWindow = new SignUp();
                    frame.dispose();

                }
            }
        });

        Sign_up.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Sign_up.setBounds(200, 230, 200, 50);

        resetButton.setBounds(125,200,100,25);
        resetButton.setFont(new Font(null,Font.BOLD,18));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(loginButton);
        frame.add(Sign_up);
        frame.add(resetButton);
        frame.add(userIDField);
        frame.add(userPasswordFielD);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane();
        Container kdkd = frame.getContentPane();
        kdkd.setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void actionPerformed(@NotNull ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordFielD.setText("");
        }
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordFielD.getPassword());
            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    messageLabel.setForeground(Color.GREEN);
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else {
                    messageLabel.setText("Wrong Password");
                    messageLabel.setForeground(Color.RED);
                }
            }
            else {
                messageLabel.setText("Username Not Found");
                messageLabel.setForeground(Color.RED);
            }
        }
    }
}
