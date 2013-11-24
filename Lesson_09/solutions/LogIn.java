import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn{

	static JFrame frame;
	static 	JPanel myPanel, secondPanel;
	
	public static void main(String[] args){
		

		frame = new JFrame("Login Frame");
		
		//Create a label and add the ImageIcon
		JLabel lblUsrName = new JLabel("Username");
		JLabel lblPassword = new JLabel("Password");

		//Create the textFields for user name and password.
		JTextField txtUsrName = new JTextField(25);
		JPasswordField txtPassword = new JPasswordField(25);
		
		//Create the buttons
		JButton btnSubmit = new JButton ("Submit");
		JButton btnCancel = new JButton ("Cancel");
		JButton btnNewUser = new JButton ("New User");
		JButton btnAdd = new JButton ("Add User");
		
		
		//Components
		JLabel lblFirstLastNAme = new JLabel("First and Last Name");
		JTextField txtName = new JTextField(25);
		
		//Using the Flowlayout to position my components.
		FlowLayout flowPanel = new FlowLayout();

		//Specify that we want to use the FlowLayout with our panel. 
		myPanel = new JPanel(flowPanel);
		secondPanel = new JPanel(flowPanel);
		
		//Attach components to the panel
		myPanel.add(lblUsrName);
		myPanel.add(txtUsrName);
		myPanel.add(lblPassword);
		myPanel.add(txtPassword);
		myPanel.add(btnSubmit);
		myPanel.add(btnCancel);
		myPanel.add(btnNewUser);


		secondPanel.add(lblFirstLastNAme);
		secondPanel.add(txtName);
		secondPanel.add(btnAdd);
		
		//Create my Action listener
		ActionListener submitListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Your Log in was successful");
				System.out.println(e.getActionCommand());
			}
		};
	
		//Create Action listener
		ActionListener cancelListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Closing the Application");
				frame.dispose();
				System.out.println(e.getActionCommand());
			}
		};
		
		//Create new user Action listener
		ActionListener newUserListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				frame.getContentPane().remove(myPanel);
				frame.getContentPane().add(secondPanel);
				frame.setVisible(true);
			}
		};
		
		//Add the listener to my button
		btnSubmit.addActionListener(submitListener);
		btnCancel.addActionListener(cancelListener);
		btnNewUser.addActionListener(newUserListener);

		myPanel.setPreferredSize(new Dimension(400,200));
		frame.getContentPane().add(myPanel);
		//Add the attributes to the frame. 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		//try a setSize();
		frame.setVisible(true);

			
	}
}