// // Write a program that generates two integers under 100 
// and prompts the user to enter the sum of these two integers.
//  The program then reports the numbers, their sum and whether 
//  user’s answer was correct.

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class RandomInt {
  public static void main(String[] args) {
    int num1, num2, sum, sumGuess;
    String input;
    String result;

    num1 = ThreadLocalRandom.current().nextInt(0, 101);
    num2 = ThreadLocalRandom.current().nextInt(0, 101);
    sum = num1 + num2;
    
    input = JOptionPane.showInputDialog(null, 
    "Enter sum of " + num1 + " + " + num2,
    "Enter Sum",
    JOptionPane.QUESTION_MESSAGE
    );
    sumGuess = Integer.parseInt(input);

    if (sum == sumGuess) {
      result = "correct";
    } else {
      result = "incorrect";
    }

    JOptionPane.showMessageDialog(null,
     "The sum of " + num1 + " + " + num2 + " is " + sum + "." + "\n" +
     "You entered " + sumGuess + "." + "\n" +
     "Your answer was " + result + ".",
     "RandomInt Results",
     JOptionPane.INFORMATION_MESSAGE);
  }
}