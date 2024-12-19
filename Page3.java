package cse_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Page3 extends JFrame {

    private Container c;
    private JLabel u, e, t1, t2;
    private Font f;

    Page3() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Comic Sans MS", Font.BOLD, 15);

        u = new JLabel("User ID :  ");
        u.setBounds(50, 50, 200, 50);
        u.setFont(f);
        c.add(u);

        t1 = new JLabel("CSE");
        t1.setBounds(130, 50, 50, 50);
        t1.setFont(f);
        c.add(t1);

        e = new JLabel("EIIN    : ");
        e.setBounds(50, 100, 150, 50);
        e.setFont(f);
        c.add(e);

        t2 = new JLabel("12345");
        t2.setBounds(130, 100, 50, 50);
        t2.setFont(f);
        c.add(t2);
    }

    public static void main(String[] args) {
        Page3 frame = new Page3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 400, 400);
        frame.setTitle("Display Page");
    }
}
