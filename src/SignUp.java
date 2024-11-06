import javax.swing.*;
import java.awt.*;

public class SignUp {
    JFrame SignUpWindow = new JFrame();
    JPanel SignUpPanel = new JPanel();
    JLabel SignUpLabel = new JLabel("Welcome to the Sign Up Page");
    JTextField SignUpText = new JTextField();
    JButton SubmitButton = new JButton("Submit");
    public SignUp() {

        SignUpLabel.setBounds(0,0,450,35);
        SignUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SignUpLabel.setForeground(Color.black);
        SignUpWindow.getContentPane();
        Container kdkd = SignUpWindow.getContentPane();
        kdkd.setBackground(Color.LIGHT_GRAY);



        SignUpWindow.setSize(500,500);
        SignUpWindow.setResizable(false);
        SignUpWindow.setLayout(null);
        SignUpWindow.setVisible(true);
        SignUpWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        SignUpWindow.add(SignUpLabel);
    }

}
