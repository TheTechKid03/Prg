import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Page extends JFrame {

    private JTextField Burger_quantity;
    public JTextField Hotdogs_quantity;
    public JTextField Cooldrink_quantity;
    public JTextField Ice_cream_quantity;
    public JTextField Total_Profit;
    public JPanel Admin;
    private JButton addUserButton;
    private JButton removeUserButton;
    private JButton logOutButton;

    public Admin_Page() {
        setContentPane(Admin);
        setTitle("Admin Page");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        //Updates Quantities//
        Burger_quantity.setText(Main.BQ1 + "");
        Hotdogs_quantity.setText(Main.HQ1 + "");
        Cooldrink_quantity.setText(Main.CQ1 + "");
        Ice_cream_quantity.setText(Main.ICQ1 + "");
        Total_Profit.setText(Main.TP1 + "");


        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signup_Form Signup = new Signup_Form();
                Signup.setVisible(true);
                dispose();
            }
        });

        removeUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Remove_Form Remove = new Remove_Form();
               Remove.setVisible(true);
               dispose();
            }
        });

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_Form Login = new Login_Form();
                Login.setVisible(true);
                dispose();
            }
        });
    }
}