import java.awt.event.*;
import javax.swing.*;

public class Quiz implements ActionListener {
    int score = 0, question = 0;
    JFrame f1 = new JFrame("LOGIN");
    JFrame f2 = new JFrame("Profile");
    JFrame f3 = new JFrame("ONLINE EXAMINATION");
    JLabel l1 = new JLabel("LOGIN CREDENTIALS");
    JLabel l2 = new JLabel("Reg No. :");
    JLabel l3 = new JLabel("Password :");
    JLabel l4 = new JLabel("PROFILE");
    JLabel l5 = new JLabel("Reg No. :");
    JLabel l6 = new JLabel("Password :");
    JLabel l7 = new JLabel();
    JLabel l8 = new JLabel();
    JLabel l10 = new JLabel("Full Name :");
    JLabel l11 = new JLabel("Branch :");
    JLabel l12 = new JLabel("Gender :");
    JLabel l13 = new JLabel("NOT UPDATED");
    JLabel l14 = new JLabel("NOT UPDATED");
    JLabel l15 = new JLabel("NOT UPDATED");
    JLabel l16 = new JLabel();
    JLabel l17 = new JLabel();
    JButton b1 = new JButton("Login");
    JButton b2 = new JButton("Exit");
    JButton b4 = new JButton("Update Profile");
    JButton b5 = new JButton("Change Password");
    JButton b6 = new JButton("Start Exam");
    JButton b7 = new JButton("Check your Score");
    JButton b8 = new JButton("Next");
    JButton b9 = new JButton("Submit");
    JButton b10 = new JButton("Log out");
    ButtonGroup bg = new ButtonGroup();
    JRadioButton r[] = new JRadioButton[5];
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();

    public Quiz() {
        l1.setBounds(230, 50, 200, 30);
        l2.setBounds(100, 150, 100, 30);
        l3.setBounds(100, 200, 100, 30);
        l4.setBounds(70, 20, 100, 30);
        l5.setBounds(20, 100, 80, 30);
        l6.setBounds(20, 150, 80, 30);
        l7.setBounds(100, 100, 100, 30);
        l8.setBounds(100, 150, 100, 30);
        l10.setBounds(20, 200, 100, 30);
        l11.setBounds(20, 250, 100, 30);
        l12.setBounds(20, 300, 100, 30);
        l13.setBounds(100, 200, 100, 30);
        l14.setBounds(100, 250, 100, 30);
        l15.setBounds(100, 300, 100, 30);
        l16.setBounds(30, 40, 500, 30);
        l17.setBounds(250, 100, 130, 30);
        tf1.setBounds(250, 150, 150, 30);
        tf2.setBounds(250, 200, 150, 30);
        b1.setBounds(300, 300, 100, 30);
        b2.setBounds(100, 300, 100, 30);
        b4.setBounds(20, 350, 150, 30);
        b5.setBounds(20, 400, 150, 30);
        b6.setBounds(250, 100, 150, 30);
        b7.setBounds(250, 150, 150, 30);
        b8.setBounds(100, 250, 100, 30);
        b9.setBounds(250, 250, 100, 30);
        b10.setBounds(250, 200, 150, 30);

        for (int i = 0; i < 5; i++) {
            r[i] = new JRadioButton();
            f3.add(r[i]);
            bg.add(r[i]);
        }

        r[0].setBounds(50, 80, 250, 30);
        r[1].setBounds(50, 120, 250, 30);
        r[2].setBounds(50, 160, 250, 30);
        r[3].setBounds(50, 200, 250, 30);

        set();
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(tf1);
        f1.add(tf2);
        f1.add(b1);
        f1.add(b2);
        f2.add(l4);
        f2.add(l5);
        f2.add(l6);
        f2.add(l7);
        f2.add(l8);
        f2.add(l10);
        f2.add(l11);
        f2.add(l12);
        f2.add(l13);
        f2.add(l14);
        f2.add(l15);
        f2.add(l17);
        f2.add(b4);
        f2.add(b5);
        f2.add(b6);
        f2.add(b7);
        f2.add(b10);
        f3.add(l16);
        f3.add(b8);
        f3.add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b9.setVisible(false);
        f1.setLayout(null);
        f1.setSize(600, 650);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String s1 = tf2.getText();
            String s2 = "21B01A0566";
            String s3 = tf1.getText();
            l7.setText(s3);
            l8.setText(s1);
            if (s1.equals(s2) && s3.length() > 3) {
                f2.setSize(600, 650);
                f2.setLayout(null);
                f2.setVisible(true);
                f1.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect details", "Invalid Details", JOptionPane.ERROR_MESSAGE);
            }
        } else if (ae.getSource() == b2) {
            f1.setVisible(false);
        } else if (ae.getSource() == b4) {
            String st2 = JOptionPane.showInputDialog("Enter your Full Name");
            l13.setText(st2);
            String st3 = JOptionPane.showInputDialog("Enter your Branch");
            l14.setText(st3);
            String st4 = JOptionPane.showInputDialog("Enter your Gender");
            l15.setText(st4);
        } else if (ae.getSource() == b5) {
            String st1 = JOptionPane.showInputDialog("Enter your new Password");
            l8.setText(st1);
        } else if (ae.getSource() == b6) {
            f3.setSize(600, 650);
            f3.setLayout(null);
            f3.setVisible(true);
        } else if (ae.getSource() == b7) {
            JOptionPane.showMessageDialog(f3, "You scored " + score + " / 100");
        } else if (ae.getSource() == b8) {
            if (check()) {
                score += 10;
            }
            question++;
            set();
            if (question == 9) {
                b8.setVisible(false);
                b9.setVisible(true);
            }
        } else if (ae.getSource() == b9) {
            if (check()) {
                score += 10;
            }
            JOptionPane.showMessageDialog(f3, "You scored " + score + " / 100");
            f3.setVisible(false);
            b6.setVisible(false);
            l17.setText("Exam completed");
        } else if (ae.getSource() == b10) {
            JOptionPane.showMessageDialog(f2, "Logged out successfully. Thank You.");
            f2.setVisible(false);
        }
    }

    public void set() {
        r[4].setSelected(true);
        if (question == 0) {
            l16.setText("1) Automatic type conversion is possible in which of the possible cases in Java ?");
            r[0].setText("Bye to int");
            r[1].setText("Long to Int");
            r[2].setText("Int to long");
            r[3].setText("None of the above.");
        }
        if (question == 1) {
            l16.setText("2) What are the two components involved in executing a java program ?");
            r[0].setText("package and class");
            r[1].setText("compiler and interpreter");
            r[2].setText("JDK and notepad");
            r[3].setText("compiler and notepad");
        }
        if (question == 2) {
            l16.setText("3) When an array is passed to a method, what does the method receive ?");
            r[0].setText("A copy of the array");
            r[1].setText("Length of the array");
            r[2].setText("Copy of first element");
            r[3].setText("The reference of the array");
        }
        if (question == 3) {
            l16.setText("4) All standard classes of java are included within a package called _ ");
            r[0].setText("java.io");
            r[1].setText("java.standard");
            r[2].setText("java.lang");
            r[3].setText("java.util");
        }
        if (question == 4) {
            l16.setText("5) Can abstract class have main() function defined inside it ?");
            r[0].setText("No");
            r[1].setText("Yes, depending on return type of main()");
            r[2].setText("Yes");
            r[3].setText("Yes, if main is declared abstract");
        }
        if (question == 5) {
            l16.setText("6) The methods of an interface are by default _");
            r[0].setText("public abstract final");
            r[1].setText("public and abstract");
            r[2].setText("public final static");
            r[3].setText("private and static");
        }
        if (question == 6) {
            l16.setText("7) What is the return type of program's main() method ?");
            r[0].setText("int");
            r[1].setText("Object");
            r[2].setText("class");
            r[3].setText("void");
        }
        if (question == 7) {
            l16.setText("8) In which of the following is toString() method defined?");
            r[0].setText("java.lang.String");
            r[1].setText("java.lang.Object");
            r[2].setText("java.lang.util");
            r[3].setText("None");
        }
        if (question == 8) {
            l16.setText("9) Which of the following may be a part of class definition ?");
            r[0].setText("instance variables");
            r[1].setText("instance methods");
            r[2].setText("constructors");
            r[3].setText("all of the above");
        }
        if (question == 9) {
            l16.setText("10) What is static variable ?");
            r[0].setText("constant");
            r[1].setText("local variable");
            r[2].setText("shared by all instances of a class");
            r[3].setText("instance variable");
        }
    }

    boolean check() {
        if (question == 0) {
            return (r[3].isSelected());
        }
        if (question == 1) {
            return (r[1].isSelected());
        }
        if (question == 2) {
            return (r[3].isSelected());
        }
        if (question == 3) {
            return (r[2].isSelected());
        }
        if (question == 4) {
            return (r[2].isSelected());
        }
        if (question == 5) {
            return (r[1].isSelected());
        }
        if (question == 6) {
            return (r[3].isSelected());
        }
        if (question == 7) {
            return (r[1].isSelected());
        }
        if (question == 8) {
            return (r[3].isSelected());
        }
        if (question == 9) {
            return (r[2].isSelected());
        }
        return false;
    }

    public static void main(String args[]) {
        new Quiz();
    }
}
