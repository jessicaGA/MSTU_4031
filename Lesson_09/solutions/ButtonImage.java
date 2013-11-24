import javax.swing.*;
import java.awt.*;

public class ButtonImage
{
	public static void main(String[] args)
	{
		BorderLayout layout = new BorderLayout();
		JFrame frame = new JFrame("Picture Frames");
		
		ImageIcon junk = new ImageIcon("junk-food.jpg");
		ImageIcon healthy = new ImageIcon("kale.jpeg");
		
		JButton btnJunk = new JButton(junk);
		JButton btnHealthy = new JButton(healthy);
		JPanel panel = new JPanel(layout);

		panel.add(btnJunk, BorderLayout.EAST);
		panel.add(btnHealthy, BorderLayout.WEST);

		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);				
	}
}