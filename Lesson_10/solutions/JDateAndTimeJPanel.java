import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JDateAndTimeJPanel extends JFrame implements ActionListener {
    
    //Creating my components.
    JTextField txtbanner = new JTextField("Date will appear here",20);
    JButton btnPress = new JButton("Press Me");
    
    GregorianCalendar calendar = new GregorianCalendar();
    int hour = calendar.get(calendar.HOUR);
    int minute = calendar.get(calendar.MINUTE);


    public static void main(String[] args) {
        JDateAndTimeJPanel theFrame = new JDateAndTimeJPanel();

        //myTimeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); Step 2
        theFrame.pack();
        theFrame.setLocation(20,20);
        theFrame.setVisible(true);	
    }

    public JDateAndTimeJPanel() {
        super("Date and Time");
        JPanel panel = new JPanel();
        
        panel.add(txtbanner);
        panel.add(btnPress);
        btnPress.addActionListener(this);
        setContentPane(panel);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        //step 1: System.out.println(source);
        
        //step 2:
        if (source == btnPress) {
            txtbanner.setText("It is " + hour + ":" + minute);
        }
    }
    
}
    
