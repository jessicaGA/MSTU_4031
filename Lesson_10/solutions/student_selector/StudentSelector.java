/*	
Student presentation order
*/


import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class StudentSelector extends JFrame implements ActionListener {

	Random rand = new Random(); 
    JButton btnLoadStudents = new JButton ("Load Students");
    JLabel lblWelcome = new JLabel ("Welcome to Student Presenter Selector. Please select Load Students to start.");
    JButton btnNextStudent = new JButton ("Select Student");
    JLabel lblNextStudent = new JLabel("Press Select Student Button so student will appear.");
    JLabel lblStudentLeft = new JLabel();
    JPanel pnlStart = new JPanel ();
    JPanel pnlPresentationOrder = new JPanel();
    static Students objStudents;

	public StudentSelector() {

		btnLoadStudents.addActionListener(this);
        btnNextStudent.addActionListener (this);

        pnlStart.add(lblWelcome);
        pnlStart.add (btnLoadStudents);
        
		pnlPresentationOrder.add(lblNextStudent);
		pnlPresentationOrder.add(btnNextStudent);
		pnlPresentationOrder.add(lblStudentLeft);

        
        getContentPane().add (pnlStart);
        pnlStart.setVisible(true);

	}


    public static void main(String[] args) throws IOException {

    	objStudents = new Students();
        JFrame myFrame = new StudentSelector();
        myFrame.setLocation(20,20);
        myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myFrame.setSize (600,300);
        myFrame.setTitle ("Student Presentation Selector");
        myFrame.setVisible (true);
	}


	public void actionPerformed (ActionEvent e) {
    	Object source = e.getSource();   
        if (e.getSource() == btnLoadStudents) {

			objStudents.getStudents();
          	pnlStart.setVisible(false);
        	getContentPane().add (pnlPresentationOrder);
        	pnlPresentationOrder.setVisible(true);
        	
        }else if (e.getSource() == btnNextStudent){

        	 int studIndex;
 		 
 		 	studIndex = rand.nextInt(objStudents.studentArraySize()); 
    		lblNextStudent.setText("The next student to present is: " + objStudents.selectStudent(studIndex));
    		

    		objStudents.removeStudent(studIndex);
    		if (objStudents.studentArraySize() == 0){
    			lblNextStudent.setText("There are no more students left");
    			pnlPresentationOrder.remove(btnNextStudent);
    			pnlPresentationOrder.remove(lblStudentLeft);
    		}else{

    			lblStudentLeft.setText("The are " + objStudents.studentArraySize() + " students left");
    		}
    		
        }
    }


}
