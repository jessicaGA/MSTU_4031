import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JFrame{
	
	//The constructor
	public GraphicsDemo(){
		setSize(210,210);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g){
		// g.setColor(Color.green); //step 2
		// g.drawLine(55,65,146,156); //step 1
		
		// g.setColor(Color.blue); //step 3
		// g.drawRect(25,40,150,150); //step 3
		
		// g.setColor(Color.red); //step 3
  //       g.drawRoundRect(50,60,100,100,25,25); //step 4

        // Step 5
  //       g.drawString("MSTU 4031 Programmers",15,50);
		// g.drawString("525 West 20th Street",15,65);
		// g.drawString("New York, New York 10027",15,80);
		// g.drawString("java@tc.columbia.edu",15,95);
		
	}
	public static void main(String[] args)
	{
		//Creates an instance of GraphicsDemo4
		GraphicsDemo myPainting = new GraphicsDemo();
	}	
}
