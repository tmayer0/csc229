import javax.swing.JOptionPane;

public class Project01 
  {
    public static void main(String[] args) 
    {
      // define variables
      String firstName, lastName;
      int p1;
      // prompt user for values
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
      // get numeric values
      String input;
      input = JOptionPane.showInputDialog(null,
          "enter a whole number <=100",
          "grade (project 1)",
          JOptionPane.QUESTION_MESSAGE 
          );
      p1 = Integer.parseInt(input);
      // display input variables and results
      JOptionPane.showMessageDialog(null,
          "       CSC 229 - Project 1" + "\n" +
          "___________________________" + "\n" +
          "     First name  = " + firstName + "\n" +
          "     Last name = " + lastName + "\n" +
          "   Project 1 (100)   ----  " + p1 + "\n"
          , "Project 1 - Seyed",
          JOptionPane.INFORMATION_MESSAGE
          );
    }
  }