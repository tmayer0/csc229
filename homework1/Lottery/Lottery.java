//Develop a complete Java program to generate a lottery of a 
//three-digit number. The program randomly generates a three-digit 
//number (a number between 100 and 999) then prompts the user to 
//enter a three-digit number and determines whether the user wins 
//according to the following rule: 
//
//    If the user input matches the lottery in exact order, 
//    the award is $10,000. 
//
//    If all the digits in the user input match all the digits 
//    in the lottery, the award is $3,000. 
//
//    If one digit in the user input matches a digit in the 
//    lottery, the award is $1,000. 

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Lottery {
	public static void main(String[] args) {
		int lotto, lottoGuess;
		String input, result;
		lotto = ThreadLocalRandom.current().nextInt(100, 1000);
		
    input = JOptionPane.showInputDialog(null, 
    "Enter a 3 digit number",
    "Input Lottery Guess",
    JOptionPane.QUESTION_MESSAGE);
    lottoGuess = Integer.parseInt(input);

    String tempLotto = Integer.toString(lotto);  
    int[] lottoNumList = new int[tempLotto.length()];
    for (int i = 0; i < tempLotto.length(); i++) {
      lottoNumList[i] = tempLotto.charAt(i) - '0';
    }
    String tempGuess = Integer.toString(lottoGuess);  
    int[] lottoGuessList = new int[tempGuess.length()];
    for (int i = 0; i < tempGuess.length(); i++) {
      lottoGuessList[i] = tempGuess.charAt(i) - '0';
    }
  }
}