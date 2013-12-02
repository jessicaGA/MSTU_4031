import java.awt.*;
import javax.swing.JFrame;

public class ThanksgivingDinner extends JFrame{
	
	public static final String JFRAME_TITLE = "Thanksgiving Dinner";
   		
   	public static final int
		JFRAME_POSITION_X = 100, 
		JFRAME_POSITION_Y = 100, 
		JFRAME_WIDTH = 920, 
		JFRAME_HEIGHT = 330;
	
	public static void main(String[] args) {
   		//Declare Final Variables (Constants)
		new ThanksgivingDinner();
   }
   
   public ThanksgivingDinner (){
   		setTitle(JFRAME_TITLE);
		setBounds(JFRAME_POSITION_X,JFRAME_POSITION_Y, JFRAME_WIDTH, JFRAME_HEIGHT);
		setResizable(true);
		setLayout(null);
		setBackground(Color.white);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//BackGroundPanel myBackground = new BackGroundPanel();
   }
   
}
	

