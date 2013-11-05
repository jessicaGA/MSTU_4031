import javax.swing.JOptionPane;

public class HelloInputDialog{

	public static void main(String[] args) {
		
		String responseOne = JOptionPane.showInputDialog ("Should President Obama hire MSTU 4031 to fix the Affordable Care website?");

		if(responseOne.equalsIgnoreCase("Yes")){
			JOptionPane.showMessageDialog(null, "Yes, we can do the job");
		} else {
			JOptionPane.showMessageDialog(null, "Have more faith";
		}
	}
}