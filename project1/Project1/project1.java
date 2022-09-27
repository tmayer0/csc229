import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Project01 {
    public static void main(String[] args) {
      // define variables
      String firstName, lastName;
      String input;
      List<Integer> projectsList = new ArrayList<>();
      List<Integer> hwList = new ArrayList<>();
      List<Integer> testsList = new ArrayList<>();
      int att;
      double percentProjects = 0, percentHw = 0, percentTests = 0, classAtt = 0;

      // name inputs
      firstName = JOptionPane.showInputDialog(null,
          "enter first name",
          "first name",
          JOptionPane.QUESTION_MESSAGE
          );
      lastName = JOptionPane.showInputDialog(null,
          "enter last name",
          "last name",
          JOptionPane.QUESTION_MESSAGE
        );

      // get projects
      for (int i = 0; i < 5; i++) {
    	  if (i == 0) {
    		  input = JOptionPane.showInputDialog(null,
    		          "enter a whole number <=50 for project " + (i + 1),
    		          "grade for project" + (i + 1),
    		          JOptionPane.QUESTION_MESSAGE); 
    	  } else if (i < 4) {
    		  input = JOptionPane.showInputDialog(null,
    			  "enter a whole number <=100 for project " + (i + 1),
    			  "grade for project" + (i + 1),
    			  JOptionPane.QUESTION_MESSAGE);
    	  } else {
        	  input = JOptionPane.showInputDialog(null,
        			  "enter a whole number <=200 for project " + (i + 1),
        			  "grade for project" + (i + 1),
        			  JOptionPane.QUESTION_MESSAGE); 
    	  }
        int projectNum;
        projectNum = Integer.parseInt(input);
        projectsList.add(projectNum);
      }
      input = JOptionPane.showInputDialog(null, 
    		  "enter a whole number <=200 for bonus project",
    		  "grade for bonus",
    		  JOptionPane.QUESTION_MESSAGE);
      	int bonusNum;
      	bonusNum = Integer.parseInt(input);
      	projectsList.add(bonusNum);
      
     // get HWs
     for (int i = 0; i < 4; i++) {
         input = JOptionPane.showInputDialog(null,
            "enter a whole number <=50 for homework " + (i + 1),
            "grade for homework" + (i + 1),
            JOptionPane.QUESTION_MESSAGE);
                
          int hwNum;
          hwNum = Integer.parseInt(input);
          hwList.add(hwNum);    	 
     }
     for (int i = 0; i < 4; i++) {
         input = JOptionPane.showInputDialog(null,
            "enter a whole number <=100 for test " + (i + 1),
            "grade for test" + (i + 1),
            JOptionPane.QUESTION_MESSAGE);
                
          int testNum;
          testNum = Integer.parseInt(input);
          testsList.add(testNum); 
     }
     
     input = JOptionPane.showInputDialog(null,
             "enter a whole number <=28 for attendance",
             "grade for test",
             JOptionPane.QUESTION_MESSAGE);
                 
           att = Integer.parseInt(input);     
    
    // calculate grade for projects
    int sumProjects = 0;
    for (int i = 0; i < projectsList.size(); i++) {
    	sumProjects += projectsList.get(i);
    }
    percentProjects = sumProjects / 700;
    
    // calculate grade for HW
    int sumHw = 0;
    for (int i = 0; i < hwList.size(); i++) {
    	sumHw += hwList.get(i);
    }
    percentHw = sumHw / 200;
    
    // calculate grade for tests
    int sumTests = 0;
    for (int i = 0; i < testsList.size(); i++) {
    	sumTests += testsList.get(i);
    }
    percentTests = sumTests / 400;
    
    
    // calculate overall grade
    double percentAll = ((percentProjects) * 40 + (percentHw) * 10 + (percentTests) * 50 + (att/28) * 10);
  
    // grade message
    JOptionPane.showMessageDialog(null,
            "       CSC 229 - Project 1" + "\n" +
            "___________________________" + "\n" +
            "     First name  = " + firstName + "\n" +
            "     Last name = " + lastName + "\n" +
            "___________________________" + "\n" +
            "Project Grades" + "\n" +
            "___________________________" + "\n" +
            "Project 1  (50) --- " + projectsList.get(0) + "\n" +
            "Project 2 (100) --- " + projectsList.get(1) + "\n" +
            "Project 3 (100) --- " + projectsList.get(2) + "\n" +
            "Project 4 (100) --- " + projectsList.get(3) + "\n" +
            "Project 5 (200) --- " + projectsList.get(4) + "\n" +
            "Bonus     (200) --- " + projectsList.get(5) + "\n" +
            "___________________________" + "\n" +
            "HomeWork Grades" + "\n" +
            "___________________________" + "\n" +
            "HomeWork 1 (50) --- " + hwList.get(0) + "\n" +
            "HomeWork 2 (50) --- " + hwList.get(1) + "\n" +
            "HomeWork 3 (50) --- " + hwList.get(2) + "\n" +
            "HomeWork 4 (50) --- " + hwList.get(3) + "\n" +
            "___________________________" + "\n" +
            "Test Grades" + "\n" +
            "___________________________" + "\n" +
            "Test 1 (100) --- " + testsList.get(0) + "\n" +
            "Test 2 (100) --- " + testsList.get(1) + "\n" +
            "Test 3 (100) --- " + testsList.get(2) + "\n" +
            "Test 4 (100) --- " + testsList.get(3) + "\n" +
            "___________________________" + "\n" +
            "Attendance --- " + att + " of 28" + "\n" +
            "___________________________" + "\n" +
            "   % Grade from Projects   ----  " + Math.round(percentProjects * 100) + "%" + "\n" +
            "   % Grade from Homework   ----  " + Math.round(percentHw * 100) + "%" + "\n" +
            "   % Grade from Tests   ----  " + Math.round(percentTests * 100) + "%" + "\n" +
            "   % Class Attendance   ----  " + Math.round(att/28 * 100) + "%" + "\n" +
            "===========================" + "\n" +
            "   Percentage for Class   ----  " + Math.round(percentAll) + "%" + "\n" +
            "==========================="
            , "Project 1 - Seyed",
            JOptionPane.INFORMATION_MESSAGE
            );
  }
}
    		

      