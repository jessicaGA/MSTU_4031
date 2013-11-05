import javax.swing.JOptionPane;

public class HelloManyWindows
{
public static void main(String[] args)

{
        do{
                int response = JOptionPane.showConfirmDialog(null, "Would you like to start this program?"); //Confirm that the person would like to start your program.


                if (response == 1) 
                	{System.exit(0);}

                else if (response == 2)
                	{JOptionPane.showMessageDialog(null, "Aw, come on! Let's continue!");}

                else {
             
                JOptionPane.showMessageDialog(null, "Welcome!"); //Welcome the user to your program.
                
                String inputValue = JOptionPane.showInputDialog(null, "What is your name"); //Get the users name
                
                JOptionPane.showMessageDialog(null, "Welcome " + inputValue + "!"); //Greet the user.
                
                System.exit(0);
        }
}while (response == 2)
}
}