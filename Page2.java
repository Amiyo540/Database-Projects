package cse_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Page2 extends JFrame implements ActionListener {

    private Container c;
    private JLabel l1, l2, l3, imgl;
    private JTextField f1;
    private JPasswordField p1;
    private Font fn1, fn2, fn3;
    private JButton submit, reset, forget, back;
    private Cursor cr;
    private ImageIcon img;

    Page2() {
        c = this.getContentPane();
        c.setLayout(null);

        fn1 = new Font("Arial", Font.BOLD, 25);
        fn2 = new Font("Tehoma", Font.BOLD, 15);
        fn3 = new Font("Tehoma", Font.BOLD, 12);

        cr = new Cursor(Cursor.HAND_CURSOR);

        img = new ImageIcon(getClass().getResource("pic1.png"));
        imgl = new JLabel(img);
        imgl.setBounds(10, 20, img.getIconWidth(), 320);
        c.add(imgl);

        l1 = new JLabel("*Please Enter the User ID and EIIN of your school to get your result.  Click the Forget button if you forget them.");
        l1.setBounds(30, 360, 700, 50);
        l1.setForeground(Color.red);
        l1.setFont(fn3);
        c.add(l1);

        l2 = new JLabel("User ID");
        l2.setBounds(200, 400, 100, 50);
        l2.setFont(fn2);
        l2.setForeground(Color.blue);
        c.add(l2);

        f1 = new JTextField();
        f1.setBounds(300, 410, 120, 30);
        f1.setBackground(Color.lightGray);
        f1.setForeground(Color.black);
        f1.setFont(fn2);
        f1.setToolTipText("Enter the User ID");
        c.add(f1);

        l3 = new JLabel("EIIN");
        l3.setBounds(200, 450, 100, 50);
        l3.setFont(fn2);
        l3.setForeground(Color.blue);
        c.add(l3);

        p1 = new JPasswordField();
        p1.setBounds(300, 460, 120, 30);
        p1.setBackground(Color.lightGray);
        p1.setFont(fn2);
        p1.setToolTipText("Enter the EIIN");
        c.add(p1);

        submit = new JButton("Submit");
        submit.setBounds(300, 505, 75, 30);
        submit.setCursor(cr);
        submit.setBackground(Color.green);
        submit.setFont(fn3);
        submit.setToolTipText("Click to submit");
        c.add(submit);

        reset = new JButton("Reset");
        reset.setBounds(390, 505, 75, 30);
        reset.setCursor(cr);
        reset.setBackground(Color.orange);
        reset.setFont(fn3);
        reset.setToolTipText("Click to reset");
        c.add(reset);
        
        forget = new JButton("Forget");
        forget.setBounds(480, 505, 75, 30);
        forget.setCursor(cr);
        forget.setBackground(Color.darkGray);
        forget.setForeground(Color.white);
        forget.setToolTipText("Click to see EIIN and User ID");
        forget.setFont(fn3);
        c.add(forget);
        
        back = new JButton("Back");
        back.setBounds(680, 505, 75, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(fn3);
        back.setCursor(cr);
        back.setToolTipText("Click to back previous page");
        c.add(back);

        submit.addActionListener(this);
        reset.addActionListener(this);
        forget.addActionListener(this);        
        back.addActionListener(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String uname = f1.getText();
            String pass = p1.getText();

            if (uname.equals("CSE") && pass.equals("12345")) {
                int ch = JOptionPane.showConfirmDialog(null, " Do you want to enter to next page?", "Successfully logged in", JOptionPane.YES_NO_OPTION);
                if (ch == JOptionPane.YES_OPTION) {
                    dispose();
                    Page4 frm = new Page4();
                    frm.setVisible(true);
                    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frm.setBounds(50, 40, 850, 690);
                    frm.setTitle("Result Record Page");
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid User ID or EIIN", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if (e.getSource() == reset) {
            f1.setText("");
            p1.setText("");
        }
        
        else if(e.getSource()==forget){
            Page3 frame=new Page3();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setBounds(50,50,400,400);
            frame.setTitle("Display Page");
        }
        
        else if(e.getSource()==back){
            Page1 fr = new Page1();
            dispose();
            fr.setVisible(true);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setBounds(50, 50, 800, 500);
            fr.setTitle("Home Page");
        }
    }

    public static void main(String[] args) {
        Page2 frame = new Page2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setTitle("Login Page");
    }
}
