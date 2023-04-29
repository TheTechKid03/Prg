import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Remove_Form extends JFrame {
    private JTextField RF_Username;
    private JPasswordField RF_Password1;
    private JButton BTR_Check;
    private JButton BTR_Add;
    private JButton BTR_Cancel;
    private JPanel Signup;
    private JPasswordField SF_Password2;
    private JPasswordField RF_Password;
    private JButton BTR_Remove;
    private JPanel Remove;

    public Remove_Form(){
        setContentPane(Remove);
        setTitle("Registration/De-Registration");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);


        BTR_Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        BTR_Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        BTR_Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin_Page Admin = new Admin_Page();
                Admin.setVisible(true);
                dispose();
            }
        });
    }
}
