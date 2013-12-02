import java.awt.*;
import javax.swing.*;


public class ImagePanel extends JPanel{
	
	
	 public ImagePanel(int width, int height){
		setSize(width,height);
	 }
	
	public Image getImage(String path){
		Toolkit tk = Toolkit.getDefaultToolkit();
    	Image imgForeground = tk.getImage(path);
    	
    	return imgForeground;
	}
}