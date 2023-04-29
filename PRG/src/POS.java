import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class POS extends JFrame {
    private JPanel POS_Page;
    private JTextField Burger_pos;
    private JTextField Hotdog_pos;
    private JTextField Cooldrink_pos;
    private JTextField Ice_cream_pos;
    private  JTextField Current_total_pos;
    private JTextField Customer_amount_pos;
    public JTextField Change_pos;
    private JButton Calculate;
    private JButton Reset;
    private JButton Total_pos;

    public POS() {
        setContentPane(POS_Page);
        setTitle("Employee POS");
        setSize(700, 500);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //Initialise everything to 0//
        Burger_pos.setText("0");
        Hotdog_pos.setText("0");
        Ice_cream_pos.setText("0");
        Cooldrink_pos.setText("0");
        Current_total_pos.setText("0");
        Customer_amount_pos.setText("");
        Change_pos.setText("N$");


        //Code to work out the Total//
        Total_pos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Convert Things to double//
                Main.BQ1 = Integer.parseInt(Burger_pos.getText());
                Main.HQ1 = Integer.parseInt(Hotdog_pos.getText());
                Main.ICQ1 = Integer.parseInt(Ice_cream_pos.getText());
                Main.CQ1 = Integer.parseInt(Cooldrink_pos.getText());

                //The Mathematical Arithmetics//
                Main.Total = (Main.BQ1 * Main.Hamburgers_price) + (Main.HQ1 * Main.Hotdogs_price)
                        + (Main.CQ1 * Main.Cooldrink_price) + (Main.ICQ1 * Main.Ice_cream_price);

                Current_total_pos.setText(Main.Total+"");
            }
        });


        //Code to Reset all the Quantities in the POS Page//
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Burger_pos.setText("0");
                Hotdog_pos.setText("0");
                Cooldrink_pos.setText("0");
                Ice_cream_pos.setText("0");
                Current_total_pos.setText("");
                Customer_amount_pos.setText("");
                Change_pos.setText("N$");
            }
        });


        //Code to Calculate the change that must be given back//
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.Customer_cash = Double.parseDouble(Customer_amount_pos.getText());
                if (Main.Customer_cash < Main.Total){
                    JOptionPane.showMessageDialog(POS_Page, "Cash Given is too low!");
                    Burger_pos.setText("0");
                    Hotdog_pos.setText("0");
                    Cooldrink_pos.setText("0");
                    Ice_cream_pos.setText("0");
                    Current_total_pos.setText("");
                    Customer_amount_pos.setText("");
                    Change_pos.setText("N$");
                }else Customer_amount_pos.getText();
                Main.Change = Main.Customer_cash - Main.Total;
                Change_pos.setText("N$" + Main.Change);
            }
        });
    }
}
