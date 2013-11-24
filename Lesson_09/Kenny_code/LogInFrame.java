/*	File: 	Login.java
	Name:	Kenneth Graves
	Comments: We will use this next class and discuss what is going on
*/


import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class LogInFrame extends JFrame implements ActionListener {
    
    public JTextField fnField;
    public JTextField lnField;
    public JTextField unField;
    public JPasswordField passField;
    public JButton submitButton;
    public JButton button2;
    public JButton newUser;
    
public LogInFrame () {
    
    JLabel firstName = new JLabel ("First Name: ");
    fnField = new JTextField (20);
    JLabel lastName = new JLabel ("Last Name: ");
    lnField = new JTextField (20);
    JLabel userName = new JLabel ("User Name: ");
    unField = new JTextField (10);
    JLabel password = new JLabel ("Password: ");
    passField = new JPasswordField (8);
     
    ImageIcon submitPic = new ImageIcon ("resources/submit.jpeg");
    
    submitButton = new JButton ();
    submitButton.addActionListener (this);
    button2 = new JButton ("Cancel");
    button2.addActionListener (this);
    newUser = new JButton ("New User");
    newUser.addActionListener (this);
    
    JPanel loginInfo = new JPanel (new GridLayout (4,4));
    JPanel submit = new JPanel (new GridLayout (1,2));
    
    loginInfo.add (firstName);
    loginInfo.add (fnField);
    loginInfo.add (lastName);
    loginInfo.add (lnField);
    loginInfo.add (userName);
    loginInfo.add (unField);
    loginInfo.add (password);
    loginInfo.add (passField);
    getContentPane().add (loginInfo);
    loginInfo.setVisible (true);
    
    submit.add (submitButton);
    submitButton.setIcon(submitPic);
    submit.add (button2);
    submit.add (newUser);
    getContentPane().add (submit);
    submit.setVisible(true);
    
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo (null);
    setSize (600,300);
    setTitle ("Login Screen");
    setVisible (true);
    setLayout (new GridLayout (2,1));
}

public void someMethod(){

}

public void actionPerformed (ActionEvent e) {
    Object source = e.getSource();   
    if (e.getSource() == submitButton) {
        if (unField.getText().equalsIgnoreCase("kgraves") && passField.getText().equals("1234")) {
            JOptionPane.showMessageDialog(null, "Congrats. You are now logged in.");
            System.exit (0);
        } else {
            int i = JOptionPane.showConfirmDialog(null, "Do you want to enter your info again?", "Again?", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                unField.setText (null);
                passField.setText (null);
            } else if (i ==1) {
                System.exit (0);
            }    
        }
    } else if (e.getSource () == button2) {
        System.exit (0);
    }
    if (e.getSource() == newUser) {
        setVisible (false);
        new NewUser();
    }
}

}//end of LogInFrame ();
