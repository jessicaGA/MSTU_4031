/* Filename: DateAndTime
Your job is to fix the code. There are lines of code that are missing and lines that are incorrect. 
the Java Console and Java API are your friends. This is an exercise in reading the errors and the API. 

Things to keep in mind: 
The title of the frame should be Me Time.
See the slides for a image of what the program should look like.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//DateAndTime class inherits from JFRAME and implements (uses an Action Listener)
public class DateAndTime extends JFrame implements ActionListener { 
    
    //The Components for the DateAndTime Frame
    JLabel lblBanner 
    JButton btnDate //title the buttons
    JButton btnReset
    Font theFont = new Font("Times New Roman",Font.BOLD, 12)

    
    //The calendar variables.
    GregorianCalendar calendar;
    int hour, minute, am, month, day, year;


    public static void main(String[] args) {
        DateAndTime myTimeFrame = new DateAndTime();
        myTimeFrame.pack();
        myTimeFrame.setSize(500, 100);
        myTimeFrame.setLocation(20,20);
        myTimeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myTimeFrame.setVisible(true);	
    }


	//The DateAndTime class constructor.
    public DateAndTime() {
        super("Me Time");
        
        JPanel panel = new JPanel();
        
        lblBanner.setFont(theFont); 
        
        
        //Add my components to the panel (container)
        panel.add(lblBanner);
        panel.add(btnDate);
        panel.add(btnReset);
        
        //Tell java to "Listen" to the btnDate and btnReset
        btnDate.addActionListener(this);
        btnReset.addActionListener(this);
        
        setContentPane(panel);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == btnDate) {
        	calendar = new GregorianCalendar(); //This calls the GregorianCalendar constructor, which retrieves current date and time.
   			hour = calendar.get(calendar.HOUR);
 			minute = calendar.get(calendar.MINUTE);
  			am = calendar.get(calendar.AM_PM);
  			month = calendar.get(calendar.MONTH)+ 1; //Gets the current month
  			day = calendar.get(calendar.DAY_OF_MONTH); // Gets the current day
 			year = calendar.get(calendar.YEAR); // Gets the current year
        
        	String formattedMin = String.format("%02d", minute); //This will format my minutes to include a leading zero.
         
        	if(am == 1) { ampm = "PM"; }
            	lblBanner.setText("Today is " + month + "/" + day + "/" + year + " time is " + hour + ":" + formattedMin + ampm);
        	} else if (source == btnReset){
        		lblBanner.setText("Press Today's Date");
        	}
    	}
    
}
    
