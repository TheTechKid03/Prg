import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Form extends JFrame {
    private JTextField LF_Username;
    private JTextField LF_Password;
    private JButton BT_Login;
    public JPanel Login;
    private JButton BT_Cancel;
    private JLabel Username;
    private JLabel Password;
    private JLabel Title;

    public Login_Form() {
        setContentPane(Login);
        setTitle("Login Form");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        BT_Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = LF_Username.getText();
                String Password = LF_Password.getText();

                //Checks if Passwords are correct//
                if (Username.equals("Employee") & Password.equals("Default")) {
                    POS Employee = new POS();
                    Employee.setVisible(true);
                    dispose();
                } else if (Username.equals("./admin") & Password.equals("Monday99")) {
                    Admin_Page Admin = new Admin_Page();
                    Admin.setVisible(true);
                    dispose();
                } else JOptionPane.showMessageDialog(Login, "Invalid Username or Password");
                LF_Password.setText("");
                LF_Username.setText("");
            }

        });
        BT_Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    }

