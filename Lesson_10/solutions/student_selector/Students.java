/*	

WRITE NOTES HERE

*/

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Students {

    private File studentFile;
    private String student;
    private Scanner input;
    private ArrayList<String> studentList;
    
    public Students() throws IOException {
        studentFile = new File ("MSTU_4031.txt");
        input = new Scanner(studentFile);
    }


    public void getStudents(){

        studentList = new ArrayList<String>();

        while (input.hasNext()){

            student = input.nextLine();
            studentList.add(student);
        }  
        
    }

    public String selectStudent(int randNum){

        return studentList.get(randNum);

    }

    public int studentArraySize(){

        return studentList.size();
    }

    public void removeStudent(int removeIndex){

        studentList.remove(removeIndex);
    }

}
