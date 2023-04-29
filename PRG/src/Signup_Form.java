import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup_Form extends JFrame {
    private JTextField SF_Username;
    private JPasswordField SF_Password1;
    private JButton BTS_Check;
    private JButton BTS_Add;
    private JButton BTS_Cancel;
    private JPanel Signup;
    private JPasswordField SF_Password2;

    public Signup_Form(){
        setContentPane(Signup);
        setTitle("Registration/De-Registration");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);


        BTS_Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (SF_Password1 == SF_Password2){

                }
            }
        });


        BTS_Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        BTS_Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin_Page Admin = new Admin_Page();
                Admin.setVisible(true);
                dispose();
            }
        });
    }
}
