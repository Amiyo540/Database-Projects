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

public class Page1 extends JFrame implements ActionListener {

    private Container c;
    private JLabel l, l1, img_l;
    private ImageIcon img;
    private JButton btn;
    private Font fn, f;
    private Cursor cr;

    Page1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.darkGray);

        fn = new Font("Comic Sans MS", Font.BOLD, 35);
        f = new Font("Tehoma", Font.BOLD, 15);

        cr = new Cursor(Cursor.HAND_CURSOR);

        l = new JLabel("Student Result Recording System");
        l.setBounds(110, 10, 620, 100);
        l.setFont(fn);
        l.setForeground(Color.blue);
        c.add(l);

        img = new ImageIcon(getClass().getResource("rs.jpg"));
        img_l = new JLabel(img);
        img_l.setBounds(15, 10, img.getIconWidth(), 350);
        c.add(img_l);

        l1 = new JLabel("Click the button to go the next page");
        l1.setBounds(15, 350, 300, 50);
        l1.setForeground(Color.white);
        l1.setFont(f);
        c.add(l1);

        btn = new JButton("Next");
        btn.setBounds(280, 400, 80, 30);
        btn.setBackground(Color.green);
        btn.setCursor(cr);
        c.add(btn);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            Page2 frm = new Page2();
            dispose();
            frm.setVisible(true);
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setBounds(50, 50, 800, 600);
            frm.setTitle("Login Page");
        }
    }

    public static void main(String[] args) {
        Page1 frame = new Page1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 500);
        frame.setTitle("Home Page");
    }
}
