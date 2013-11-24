/*
Why doesn't this program work? 
*/

import javax.swing.*;
import java.awt.*;


public class ImagesAndLabels
{
	public static void main(String[] args)
	{
		
		//Create the frame
		JFrame frame = new JFrame("Lab Frames");
		
		//Create an Image icon and set the image. 
		ImageIcon myIcon = new ImageIcon("java_128.png");
		
		//Create a the label and add the ImageIcon
		JLabel lblPic = new JLabel(myIcon);

		//Adding the middle man JPanel
		JPanel myPanel = new JPanel();
		
		
		//Attach the label to the panel
		panel.add(lblPic);
			
			
		//Attach the panel to the label
		frame.getContentPane().add(myPanel);
		
	}
}