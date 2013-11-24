import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EventsAndButtons{
	
	static JTextField field;
	
	public static void main(String[] args){
		
		//Comments
		JLabel label = new JLabel("Name: ");
		field = new JTextField(15);
		JButton button = new JButton("Submit");

		JFrame frame = new JFrame("Event");
		
		
		//Comments
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					System.out.println("Name: " + field.getText());
					System.exit(0);
			}
		};
		
		button.addActionListener(listener);
		
		GridLayout layout = new GridLayout();
		frame.setLayout(layout);
		layout.setColumns(2);
		layout.setRows(3);
		layout.setVgap(5);
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}