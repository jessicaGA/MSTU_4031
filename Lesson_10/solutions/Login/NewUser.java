/*	File: 	Login.java
	Name:	Kenneth Graves
	Comments: We will use this next class and discuss what is going on
*/
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class NewUser extends JFrame implements ActionListener {
    
    public JTextField fnField1;
    public JTextField lnField1;
    public JTextField unField1;
    public JPasswordField passField1;
    public JButton submit1;

public NewUser () {
    
    JLabel firstName1 = new JLabel ("First Name: ");
    fnField1 = new JTextField (15);
    JLabel lastName1 = new JLabel ("Last Name: ");
    lnField1 = new JTextField (15);
    JLabel userName1 = new JLabel ("User Name: ");
    unField1 = new JTextField (10);
    JLabel password1 = new JLabel ("Password: ");
    passField1 = new JPasswordField (10);
    submit1= new JButton ("Submit");
    submit1.addActionListener (this);
    
    JPanel loginInfo1 = new JPanel (new FlowLayout ());
    loginInfo1.add (firstName1);
    loginInfo1.add (fnField1);
    loginInfo1.add (lastName1);
    loginInfo1.add (lnField1);
    loginInfo1.add (userName1);
    loginInfo1.add (unField1);
    loginInfo1.add (password1);
    loginInfo1.add (passField1);
    loginInfo1.add (submit1);
    getContentPane().add (loginInfo1);
    setSize (200,600);
    setTitle ("New User");
    setVisible (true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed (ActionEvent evt) {
    Object source = evt.getSource();
    if (evt.getSource() == submit1) {
        JOptionPane.showMessageDialog(this, "Thank you for registering!");
        try {
            PrintWriter pw = null;
            pw = new PrintWriter ("ICL1.txt");
            pw.println ("First Name: " + fnField1.getText());
            pw.println ("Last Name: " + lnField1.getText());
            pw.println ("Username: " + unField1.getText());
            pw.println ("Password: " + passField1.getText());
            pw.close();
            System.exit(0);
        } catch (Exception ioe) {
            System.out.println ("Exception!");
        }
    }
}

}
