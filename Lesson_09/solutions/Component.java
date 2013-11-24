import javax.swing.*;

public class Component {
	public static void main (String[] args){
		JFrame frame = new JFrame("MyFrame");
		JButton myButton = new JButton ("Submit");
		frame.add(myButton);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
/* “MyFrame” puts these words at the top of the window; 400, 300 sets the size of the window; 
‘null’ puts the window relative to nothing else; 
‘JFrame.EXIT_ON_CLOSE’ 
closes the program when I close the window; and ‘true’ makes the window visible. */