/* Filename: DateAndTime.java 
* By: Jessica Thornhill-Skeete
* Email: jt2573@tc.columbia.edu 
* Date: November 20, 2013
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//DateAndTime class inherits from JFRAME and implements (uses an Action Listener)
public class DateAndTime extends JFrame implements ActionListener { 
    
    //The Components for the DateAndTime Frame
    JLabel lblBanner = new JLabel("Date Should Appear Here"); 
    JButton btnDate = new JButton("Today's Date");
    JButton btnReset  = new JButton("Reset");

    //Adding my own custom font.
    Font theFont = new Font("TimesRoman", Font.BOLD, 14);

    
    //The calendar variables.
    GregorianCalendar calendar;
    int hour, minute, am, month, day, year;
    String ampm;


	//This is the main method. This is where the program starts. Even though it is not the first line of code it still executes first.
    public static void main(String[] args) {
        JFrame myTimeFrame = new DateAndTime();
        myTimeFrame.pack();
        myTimeFrame.setSize(500, 100);
        myTimeFrame.setLocation(20,20);
        myTimeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myTimeFrame.setVisible(true);	
    }


	//The DateAndTime class constructor.
    public DateAndTime() {
        super("Date and Time");
        
        JPanel panel = new JPanel();
        
        lblBanner.setFont(theFont); //set the font on our label.
        
        
        //Add my components to the panel (container)
        panel.add(lblBanner);
        panel.add(btnDate);
        panel.add(btnReset);
        
        //Tell java to "Listen" to the btnDate and btnReset
        btnDate.addActionListener(this);
        btnReset.addActionListener(this);
        
        setContentPane(panel);
    }
    
    
    //Mandatory method when you implement an ActionListener. After an event occurs on the screen the program jumps to this method.
    public void actionPerformed(ActionEvent e) {
    
        Object source = e.getSource(); //Store the object(component) that triggered the event. In this case clicking a button.
        
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
    
