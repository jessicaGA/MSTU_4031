import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class NameEmailGrid
{
	public static void main(String[] args)
	{
		//Create labels and text fields
		JLabel label1 = new JLabel("Name:");
		JTextField field1 = new JTextField(15);
		JLabel label2 = new JLabel("Email:");
		JTextField field2 = new JTextField(15);

		//Create JFrame
		JFrame frame = new JFrame("Name & Email");

		//Grid Layout
		GridLayout layout = new GridLayout();
		layout.setColumns(2);
		layout.setRows(2);
		layout.setVgap(5);
		frame.setLayout(layout);
		
		//Add labels and text fields
		frame.getContentPane().add(label1);
		frame.getContentPane().add(field1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(field2);
		
		//Set JFrame properties
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}