package cse_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Page4 extends JFrame implements ActionListener{
    private Container c;
    private JLabel l, fn, ln, id, g, phone, un, ein, ban, eng, math, sci, ict, rel, total, avg, rank,star;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, user;
    private Font f1, f2;
    private JComboBox bx;
    private JButton result, marksheet, reset, clear, exit;
    private JTextArea ta;
    private Cursor cr1, cr2;
    private JPasswordField pass;
    private String[] gender = {"Male", "Female", "Others"};
    private double[] r = new double[8];
    
    Page4(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        f1 = new Font("Comic Sans MS", Font.BOLD, 24);
        f2 = new Font("Tehoma", Font.BOLD, 16);

        cr1 = new Cursor(Cursor.HAND_CURSOR);
        cr2 = new Cursor(Cursor.TEXT_CURSOR);

        l = new JLabel("-- STUDENT RESULT RECORD BOOK --");  //JLabel
        l.setBounds(200, 6, 500, 50);
        l.setFont(f1);
        l.setForeground(Color.blue);
        c.add(l);

        fn = new JLabel("*First Name :");                //JLabel
        fn.setBounds(20, 50, 100, 50);
        fn.setFont(f2);
        c.add(fn);

        tf1 = new JTextField();                         //JTextField
        tf1.setBounds(130, 60, 120, 30);
        tf1.setFont(f2);
        tf1.setToolTipText("Enter your first name");
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        ln = new JLabel("*Last Name :");                 //JLabel
        ln.setBounds(20, 95, 100, 50);
        ln.setFont(f2);
        c.add(ln);

        tf2 = new JTextField();                         //JTextField
        tf2.setBounds(130, 105, 120, 30);
        tf2.setFont(f2);
        tf2.setToolTipText("Enter your last name");
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

        id = new JLabel("*Student ID :");                //JLabel
        id.setBounds(20, 145, 100, 50);
        id.setFont(f2);
        c.add(id);

        tf3 = new JTextField();                         //JTextField
        tf3.setBounds(130, 155, 120, 30);
        tf3.setFont(f2);
        tf3.setToolTipText("Enter your ID");
        tf3.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf3);

        phone = new JLabel("Phone No  :");              //JLabel
        phone.setBounds(20, 190, 100, 50);
        phone.setFont(f2);
        c.add(phone);

        tf4 = new JTextField();                         //JTextField
        tf4.setBounds(130, 200, 120, 30);
        tf4.setFont(f2);
        tf4.setToolTipText("Enter your phone number");
        tf4.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf4);

        g = new JLabel("*Gender       :");               //JLabel
        g.setBounds(20, 235, 110, 50);
        g.setFont(f2);
        c.add(g);

        bx = new JComboBox(gender);                     //JComboBox
        bx.setBounds(130, 245, 120, 30);
        bx.setCursor(cr1);
        bx.setFont(f2);
        bx.setToolTipText("Choose your gender");
        c.add(bx);       
        
        ban = new JLabel("*Bangla       :");             //JLabel
        ban.setBounds(20, 280, 100, 50);
        ban.setFont(f2);
        c.add(ban);

        tf5 = new JTextField();                         //JTextField
        tf5.setBounds(130, 290, 120, 30);
        tf5.setFont(f2);
        tf5.setToolTipText("Enter the mark of Bangla");
        tf5.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf5);

        eng = new JLabel("*English      :");             //JLabel
        eng.setBounds(20, 325, 100, 50);
        eng.setFont(f2);
        c.add(eng);

        tf6 = new JTextField();                        //JTextField
        tf6.setBounds(130, 335, 120, 30);
        tf6.setFont(f2);
        tf6.setToolTipText("Enter the mark of English");
        tf6.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf6);

        math = new JLabel("*Math           :");          //JLabel
        math.setBounds(20, 370, 100, 50);
        math.setFont(f2);
        c.add(math);

        tf7 = new JTextField();                         //JTextField
        tf7.setBounds(130, 380, 120, 30);
        tf7.setFont(f2);
        tf7.setToolTipText("Enter the mark of Math");
        tf7.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf7);

        sci = new JLabel("*Science     :");              //JLabel
        sci.setBounds(20, 410, 100, 50);
        sci.setFont(f2);
        c.add(sci);

        tf8 = new JTextField();                         //JTextField
        tf8.setBounds(130, 425, 120, 30);
        tf8.setFont(f2);
        tf8.setToolTipText("Enter the mark of Science");
        tf8.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf8);

        ict = new JLabel("*ICT              :");         //JLabel
        ict.setBounds(20, 455, 100, 50);
        ict.setFont(f2);
        c.add(ict);

        tf9 = new JTextField();                         //JTextField
        tf9.setBounds(130, 470, 120, 30);
        tf9.setFont(f2);
        tf9.setToolTipText("Enter the mark of ICT");
        tf9.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf9);

        rel = new JLabel("*Religion     :");             //JLabel
        rel.setBounds(20, 500, 100, 50);
        rel.setFont(f2);
        c.add(rel);

        tf10 = new JTextField();                        //JTextField
        tf10.setBounds(130, 515, 120, 30);
        tf10.setFont(f2);
        tf10.setToolTipText("Enter the mark of Religion");
        tf10.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf10);

        result = new JButton("Result");                 //JButton    
        result.setBounds(40, 590, 100, 30);
        result.setFont(f2);
        result.setToolTipText("Click to see your result");
        result.setCursor(cr1);
        c.add(result);

        marksheet = new JButton("Marksheet");           //JButton
        marksheet.setBounds(190, 590, 120, 30);
        marksheet.setFont(f2);
        marksheet.setToolTipText("Click to view your marksheet");
        marksheet.setCursor(cr1);
        c.add(marksheet);

        clear = new JButton("Clear");                   //JButton
        clear.setBounds(360, 590, 100, 30);
        clear.setFont(f2);
        clear.setToolTipText("Click to clear your marks");
        clear.setCursor(cr1);
        c.add(clear);

        reset = new JButton("Reset");                   //JButton
        reset.setBounds(510, 590, 100, 30);
        reset.setFont(f2);
        reset.setToolTipText("Click to reset");
        reset.setCursor(cr1);
        c.add(reset);

        exit = new JButton("Exit");                     //JButton
        exit.setBounds(680, 590, 100, 30);
        exit.setFont(f2);
        exit.setToolTipText("Click to exit");
        exit.setCursor(cr1);
        c.add(exit);

        total = new JLabel("Total Marks :");            //JLabel
        total.setBounds(350, 50, 120, 50);
        total.setFont(f2);
        c.add(total);

        tf11 = new JTextField();                        //JTextField
        tf11.setBounds(480, 60, 150, 30);
        tf11.setForeground(Color.BLUE);
        tf11.setHorizontalAlignment(JTextField.CENTER);
        tf11.setEditable(false);
        tf11.setFont(f2);
        tf11.setCursor(cr2);
        c.add(tf11);

        avg = new JLabel("Average       :");            //JLabel
        avg.setBounds(350, 100, 120, 50);
        avg.setFont(f2);
        c.add(avg);

        tf12 = new JTextField();                        //JTextField
        tf12.setBounds(480, 110, 150, 30);
        tf12.setForeground(Color.BLUE);
        tf12.setHorizontalAlignment(JTextField.CENTER);
        tf12.setEditable(false);
        tf12.setFont(f2);
        tf12.setCursor(cr2);
        c.add(tf12);

        rank = new JLabel("Grade           :");         //JLabel
        rank.setBounds(350, 150, 120, 50);
        rank.setFont(f2);
        c.add(rank);

        tf13 = new JTextField();                        //JTextField
        tf13.setBounds(480, 160, 150, 30);
        tf13.setForeground(Color.BLUE);
        tf13.setHorizontalAlignment(JTextField.CENTER);
        tf13.setEditable(false);
        tf13.setFont(f2);
        tf13.setCursor(cr2);
        c.add(tf13);

        ta = new JTextArea();                          //JTextArea
        ta.setBounds(350, 220, 410, 340);
        ta.setBackground(Color.white);
        ta.setForeground(Color.BLUE);
        ta.setCursor(cr2);
        ta.setEditable(false);
        ta.setFont(f2);
        c.add(ta);
        
        star=new JLabel("*Required");
        star.setBounds(10,560,80,20);
        star.setForeground(Color.blue);
        c.add(star);

        result.addActionListener(this);   //Action listener with buttons
        exit.addActionListener(this);
        marksheet.addActionListener(this);
        reset.addActionListener(this);
        clear.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == result) {      //when result button will be clicked                         
            if (tf1.getText().length() == 0 || tf2.getText().length() == 0 || tf3.getText().length() == 0 || tf5.getText().length() == 0 || tf6.getText().length() == 0 || tf7.getText().length() == 0 || tf8.getText().length() == 0 || tf9.getText().length() == 0 || tf10.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Information", "Error", JOptionPane.QUESTION_MESSAGE);
                tf11.setText("");
                tf12.setText("");
                tf13.setText("");
                ta.setText("");
            } 
            else {
                r[0] = Double.parseDouble(tf5.getText());
                r[1] = Double.parseDouble(tf6.getText());
                r[2] = Double.parseDouble(tf7.getText());
                r[3] = Double.parseDouble(tf8.getText());
                r[4] = Double.parseDouble(tf9.getText());
                r[5] = Double.parseDouble(tf10.getText());
                r[6] = r[0] + r[1] + r[2] + r[3] + r[4] + r[5];
                r[7] = (r[0] + r[1] + r[2] + r[3] + r[4] + r[5]) / 6;

                String total = String.format("%.0f", r[6]);
                tf11.setText(total);
                String average = String.format("%.2f", r[7]);
                tf12.setText(average);

                if (r[6] < 350) {
                    tf11.setForeground(Color.RED);
                    tf12.setForeground(Color.RED);
                    tf13.setForeground(Color.RED);
                } 
                else if (r[6] >= 350 && r[6] <= 600) {
                    tf11.setForeground(Color.BLUE);
                    tf12.setForeground(Color.BLUE);
                    tf13.setForeground(Color.BLUE);
                }
                if (r[0] > 100 || r[1] > 100 || r[2] > 100 || r[3] > 100 || r[4] > 100 || r[5] > 100) {
                    JOptionPane.showMessageDialog(null, "Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);
                    tf11.setText("");
                    tf12.setText("");
                    tf13.setText("");
                    ta.setText("");
                } 
                else if (r[0] < 0 || r[1] < 0 || r[2] < 0 || r[3] < 0 || r[4] < 0 || r[5] < 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);
                    tf11.setText("");
                    tf12.setText("");
                    tf13.setText("");
                    ta.setText("");
                } 
                else if (r[0] < 35 || r[1] < 35 || r[2] < 35 || r[3] < 35 || r[4] < 35 || r[5] < 35) {
                    tf13.setText("Fail");
                    tf11.setForeground(Color.RED);
                    tf12.setForeground(Color.RED);
                    tf13.setForeground(Color.RED);
                } 
                else if (r[6] >= 550 && r[6] <= 600) {
                    tf13.setText("1st Class First");
                } 
                else if (r[6] >= 500 && r[6] <= 550) {
                    tf13.setText("1st Class Second");
                } 
                else if (r[6] >= 450 && r[6] <= 500) {
                    tf13.setText("2nd Class First");
                } 
                else if (r[6] >= 400 && r[6] <= 450) {
                    tf13.setText("2nd Class Second");
                } 
                else if (r[6] >= 350 && r[6] <= 400) {
                    tf13.setText("3rd Class");
                } 
                else if (r[6] < 350) {
                    tf13.setText("Fail");
                    tf11.setForeground(Color.RED);
                    tf12.setForeground(Color.RED);
                    tf13.setForeground(Color.RED);
                }
            }
        }
        
        else if (e.getSource() == marksheet) {  //when marksheet button will be clicked            
            if (tf1.getText().length() == 0 || tf2.getText().length() == 0 || tf3.getText().length() == 0 || tf5.getText().length() == 0 || tf6.getText().length() == 0 || tf7.getText().length() == 0 || tf8.getText().length() == 0 || tf9.getText().length() == 0 || tf10.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Information", "Error", JOptionPane.QUESTION_MESSAGE);
                tf11.setText("");
                tf12.setText("");
                tf13.setText("");
                ta.setText("");
            } 
            else {
                r[0] = Double.parseDouble(tf5.getText());
                r[1] = Double.parseDouble(tf6.getText());
                r[2] = Double.parseDouble(tf7.getText());
                r[3] = Double.parseDouble(tf8.getText());
                r[4] = Double.parseDouble(tf9.getText());
                r[5] = Double.parseDouble(tf10.getText());
                r[6] = r[0] + r[1] + r[2] + r[3] + r[4] + r[5];
                r[7] = (r[0] + r[1] + r[2] + r[3] + r[4] + r[5]) / 6;

                String total = String.format("%.0f", r[6]);
                tf11.setText(total);
                String average = String.format("%.2f", r[7]);
                tf12.setText(average);

                if (r[0] > 100 || r[1] > 100 || r[2] > 100 || r[3] > 100 || r[4] > 100 || r[5] > 100) {
                    JOptionPane.showMessageDialog(null, "Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);
                    tf11.setText("");
                    tf12.setText("");
                    tf13.setText("");
                    ta.setText("");
                } 
                else if (r[0] < 0 || r[1] < 0 || r[2] < 0 || r[3] < 0 || r[4] < 0 || r[5] < 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);
                    tf11.setText("");
                    tf12.setText("");
                    tf13.setText("");
                    ta.setText("");
                } 
                else {
                    ta.setText("");
                    ta.append("                           MARKSHEET\n"
                    + "     ------------------------------------------------------------------\n"
                    + "    Name            :     " + tf1.getText() + " " + tf2.getText()
                    + "\n    Student ID   :     " + tf3.getText()
                    + "\n    Gender         :     " + bx.getSelectedItem()
                    + "\n    Bangla         :     " + tf5.getText()
                    + "\n    English        :     " + tf6.getText()
                    + "\n    Math             :      " + tf7.getText()
                    + "\n    Science       :      " + tf8.getText()
                    + "\n    ICT                :     " + tf9.getText()
                    + "\n    Religion       :     " + tf10.getText()
                    + "\n    ------------------------------------------------------------------"
                    + "\n    Toal Marks  :    " + tf11.getText()
                    + "\n     Average      :    " + tf12.getText()
                    + "\n    Grade           :    " + tf13.getText());
                }
            }
        } 
        
        else if (e.getSource() == clear) {     //when clear button will be clicked
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tf10.setText("");            
        } 
        
        else if (e.getSource() == reset) {  //when reset button will be clicked
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tf10.setText("");
            tf11.setText("");
            tf12.setText("");
            tf13.setText("");
            ta.setText("");           
        } 
        
        else if (e.getSource() == exit) {   //when exit button will be clicked
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
    
    //Creating the main method
    public static void main(String[] args) {
        Page4 fr=new Page4();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(50, 40, 850, 690);
        fr.setTitle("Result Sheet Page");
   }
}
