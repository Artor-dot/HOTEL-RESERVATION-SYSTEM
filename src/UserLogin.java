import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel headerLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public UserLogin() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("admin123")) {
                    JOptionPane.showMessageDialog(mainPanel,
                            "Login Successful!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(mainPanel,
                            "Invalid username or password.",
                            "Authentication Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triple Threat - Login");
        frame.setContentPane(new UserLogin().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}