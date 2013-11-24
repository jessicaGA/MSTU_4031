/* In class example of a GUI
* November 1st 2010
*/

import javax.swing.*;
import java.awt.FlowLayout;

public class NameEmail
{
	public static void main(String[] args)
	{
		
		JLabel label = new JLabel("Name: ");
		JTextField field = new JTextField(15);
		
		JLabel label2 = new JLabel("Email:");
		JTextField field2 = new JTextField(15);
		
		//Add a JButton
		//JButton button = new JButton("Submit");
		
		//Create a frame for the GUI
		JFrame frame = new JFrame("User Registration"); 
		
		// Create and set layout usig FlowLayout manager
		FlowLayout layout = new FlowLayout();
		
		frame.setLayout(layout);
		frame.getContentPane().add(label);
		frame.getContentPane().add(field);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(field2);
		//Add the button to the frame
		//frame.getContentPane().add(button);


		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			
	}
}




