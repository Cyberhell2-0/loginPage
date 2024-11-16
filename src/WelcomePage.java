import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    // Creation of the frame
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello");
    JPanel panel ;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;

    WelcomePage(String userID){
        // Welcome label
        welcomeLabel.setBounds(0,0,300,35);
        welcomeLabel.setFont(new Font(null, Font.ITALIC,15));
        welcomeLabel.setForeground(Color.BLUE);
        welcomeLabel.setText("Logged in as "+ userID);
        // Panels
        panel = new JPanel();
        panel.setBounds(300, 20, 1200, 800);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(310,80,273,300);
        panel1.setVisible(true);
        panel1.setBackground(Color.white);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(650,80,800,300);
        panel2.setVisible(true);
        panel2.setBackground(Color.gray);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(310,450,800,100);
        panel3.setVisible(true);
        panel3.setBackground(Color.gray);

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(310,650,800,100);
        panel4.setVisible(true);
        panel4.setBackground(Color.gray);
        // Image icon
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\bmusa\\OneDrive\\Documents\\Cybersecurity\\OIP.jpeg");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());


        JLabel label1 = new JLabel("Home Page");
        label1.setForeground(Color.black);
        label1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.setBounds(20, 50, 300, 30);
        label1.setVisible(true);

        JLabel label2 = new JLabel("My details");
        label2.setForeground(Color.black);
        label2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label2.setBounds(20, 80, 300, 30);
        label2.setVisible(true);

        JLabel label3 = new JLabel("Self_Registration");
        label3.setForeground(Color.black);
        label3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label3.setBounds(20, 110, 300, 30);
        label3.setVisible(true);

        JLabel label4 = new JLabel("Attendance");
        label4.setForeground(Color.black);
        label4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label4.setBounds(20, 140, 300, 30);
        label4.setVisible(true);

        JLabel label5 = new JLabel("Progress Report");
        label5.setForeground(Color.black);
        label5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label5.setBounds(20, 170, 300, 30);
        label5.setVisible(true);

        JLabel label6 = new JLabel("Exam Card");
        label6.setForeground(Color.black);
        label6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label6.setBounds(20, 210, 300, 30);
        label6.setVisible(true);

        JLabel label7 = new JLabel("Fee Structure ");
        label7.setForeground(Color.black);
        label7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label7.setBounds(20, 240, 300, 30);
        label7.setVisible(true);

        JLabel label8 = new JLabel("Fees Statement");
        label8.setForeground(Color.black);
        label8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label8.setBounds(20, 270, 300, 30);
        label8.setVisible(true);

        JLabel label9 = new JLabel("Apply for refund");
        label9.setForeground(Color.black);
        label9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label9.setBounds(20, 300, 300, 30);
        label9.setVisible(true);

        JLabel label10 = new JLabel("Get Completion Report");
        label10.setForeground(Color.black);
        label10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label10.setBounds(20, 330, 300, 30);
        label10.setVisible(true);

        JLabel label11 = new JLabel("Register for graduation");
        label11.setForeground(Color.black);
        label11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label11.setBounds(20, 360, 300, 30);
        label11.setVisible(true);

        JLabel label12 = new JLabel("Log out");
        label12.setForeground(Color.black);
        label12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label12.setBounds(20, 390, 300, 30);
        label12.setVisible(true);

        JLabel label13 = new JLabel("STUDENT PROFILE");
        label13.setForeground(Color.BLUE);
        label13.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label13.setBounds(20, 10, 100, 100);

        JLabel label14 = new JLabel("Academic Programmes ");
        label14.setForeground(Color.BLUE);
        label14.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label14.setBounds(310, 390, 200, 50);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);
        frame.add(label11);
        frame.add(label12);
        frame.add(label14);
        panel.add(label13);
        frame.add(panel);
        frame.add(welcomeLabel);
        panel1.add(imageLabel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //frame.setSize(420,420);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane();
        Container kdkd = frame.getContentPane();
        kdkd.setBackground(Color.LIGHT_GRAY);

    }

}
