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

public class Lottery {
	public static void main(String[] args) {
		// initiliaze vars
    int lotto, lottoGuess;
		String input, result;
		// random int
    lotto = ThreadLocalRandom.current().nextInt(100, 1000);
		
    // input guess num
    input = JOptionPane.showInputDialog(null, 
    "Enter a 3 digit number",
    "Input Lottery Guess",
    JOptionPane.QUESTION_MESSAGE);
    lottoGuess = Integer.parseInt(input);

    // split nums into arrays
    String tempLotto = Integer.toString(lotto);  
    int[] lottoNumArr = new int[tempLotto.length()];
    for (int i = 0; i < tempLotto.length(); i++) {
      lottoNumArr[i] = tempLotto.charAt(i) - '0';
    }
    String tempGuess = Integer.toString(lottoGuess);  
    int[] lottoGuessArr = new int[tempGuess.length()];
    for (int i = 0; i < tempGuess.length(); i++) {
      lottoGuessArr[i] = tempGuess.charAt(i) - '0';
    }
    
    // check matches
    if (lottoNumArr[0] == lottoGuessArr[0]
        && lottoNumArr[1] == lottoGuessArr[1]
        && lottoNumArr[2] == lottoGuessArr[2]) {
          result = "1";
      } else if (lottoNumArr[0] == lottoGuessArr[0]||
                  lottoNumArr[0] == lottoGuessArr[1]||
                  lottoNumArr[0] == lottoGuessArr[2] &&
                  lottoNumArr[1] == lottoGuessArr[0]||
                  lottoNumArr[1] == lottoGuessArr[1]||
                  lottoNumArr[1] == lottoGuessArr[2] &&
                  lottoNumArr[2] == lottoGuessArr[0]||
                  lottoNumArr[2] == lottoGuessArr[1]||
                  lottoNumArr[2] == lottoGuessArr[2]) {
                    result = "2";
                  } else if (lottoNumArr[0] == lottoGuessArr[0] ||
                            lottoNumArr[0] == lottoGuessArr[1] ||
                            lottoNumArr[0] == lottoGuessArr[2] ||
                            lottoNumArr[1] == lottoGuessArr[0] ||
                            lottoNumArr[1] == lottoGuessArr[1] ||
                            lottoNumArr[1] == lottoGuessArr[2] ||
                            lottoNumArr[2] == lottoGuessArr[0] ||
                            lottoNumArr[2] == lottoGuessArr[1] ||
                            lottoNumArr[2] == lottoGuessArr[2]) {
                              result = "3";
                            }
    // show results
    if (result == "1") {
      JOptionPane.showMessageDialog(null,
      "Congratulations! You matched all digits in exact order! You win $10,000",
      "Lotto Results",
      JOptionPane.INFORMATION_MESSAGE);
    } else if (result == "2") {
      JOptionPane.showMessageDialog(null,
      "Congratulations! You matched all digits! You win $3,000",
      "Lotto Results",
      JOptionPane.INFORMATION_MESSAGE);
    } else if (result == "3") {
      JOptionPane.showMessageDialog(null,
      "Congratulations! You matched one digit! You win $1,000",
      "Lotto Results",
      JOptionPane.INFORMATION_MESSAGE);
    }
 }
}
