import javax.swing.*;
import java.awt.*;

public class ImagesAndBorders
{
	public static void main(String[] args)
	{
		BorderLayout layout = new BorderLayout();
		JFrame frame = new JFrame("Picture Frames");
		
		ImageIcon junk = new ImageIcon("junk-food.jpg");
		ImageIcon kale = new ImageIcon("kale.jpeg");
		
		JLabel label = new JLabel(junk);
		JLabel label2 = new JLabel(kale);
		JPanel panel = new JPanel(layout);

		panel.add(label, BorderLayout.NORTH);
		panel.add(label2, BorderLayout.SOUTH);

		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);				
	}
}