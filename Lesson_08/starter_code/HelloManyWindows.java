import javax.swing.JOptionPane;

public class HelloManyWindows
{
public static void main(String[] args)
{
		JOptionPane.showConfirmDialog(); //Confirm that the person would like to start your program.
		
		JOptionPane.showMessageDialog(); //Welcome the user to your program.
		
		String inputValue = JOptionPane.showInputDialog(); //Get the users name
		
		JOptionPane.showMessageDialog(); //Greet the user.
		
		System.exit(0);
}