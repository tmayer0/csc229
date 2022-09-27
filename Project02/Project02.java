import javax.swing.JOptionPane;

public class Project02 {
  public static void main(String[] args) {
    int phoneCode = 5;
    int sCode = 1;
    int eCode = 4;
    String phoneName = "", sName = "", eName = "", uFname = "", uLname = "", uAddress = "", uCity = "", uState = "", uZip = "";
    double phoneCost = 0.00, sCost = 0.00, eCost = 0.00, discount = 0.00, total = 0.00;
    int nServices = 1;
    String input;

    // user input name, address, city, zip
    input =JOptionPane.showInputDialog(null,
    "Please Enter Your First Name", "First Name", JOptionPane.QUESTION_MESSAGE);
    uFname = input;

    input =JOptionPane.showInputDialog(null,
    "Please Enter Your Last Name", "Last Name", JOptionPane.QUESTION_MESSAGE);
    uLname = input;

    input =JOptionPane.showInputDialog(null,
    "Please Enter Your Address", "Address", JOptionPane.QUESTION_MESSAGE);
    uAddress = input;

    input =JOptionPane.showInputDialog(null,
    "Please Enter Your City", "City name", JOptionPane.QUESTION_MESSAGE);
    uCity = input;

    input =JOptionPane.showInputDialog(null,
    "Please Enter Your State", "Two Letter State Code", JOptionPane.QUESTION_MESSAGE);
    uState = input;

    input =JOptionPane.showInputDialog(null,
    "Please Enter Your Zip Code", "Zip Code", JOptionPane.QUESTION_MESSAGE);
    uZip = input;
    
    // user input services
    input = JOptionPane.showInputDialog(null,
    "         Please Select Your Smartphone" + "\n" +
    "           Price/Month for 24 Months" + "\n" +
    "    _________________________________________________" + "\n" +
    "       1. Apple iPhone 14 Pro              $99.33" + "\n" +
    "       2. Samsung Galaxy S20 FE 5g UW      $83.55" + "\n" +
    "       3. Google Pixel 6 Pro               $50.72" + "\n" +
    "       4. Motorola Moto g pure             $41.25" + "\n" +
    "       5. No Service" + "\n" +
    "    _________________________________________________",
    " Smart Phone",
    JOptionPane.QUESTION_MESSAGE
    );
    phoneCode = Integer.parseInt(input);

    input = JOptionPane.showInputDialog(null,
    "   Please Select Your Service Plan" + "\n" +
    "             Monthly Cost" + "\n" +
    "_____________________________________________________" + "\n" +
    "       1. Unlimited (Start)                $35.00" + "\n" +
    "       2. Unlimited (Play More)            $55.00" + "\n" +
    "       3. Unlimited (Get More)             $65.00" + "\n" +
    "       4. Shared Data (S 5GB)              $75.00" + "\n" +
    "       5. Shared Data (M 10GB)             $85.00" + "\n" +
    "_____________________________________________________",
    "Service Plan",
    JOptionPane.QUESTION_MESSAGE
    );
    sCode = Integer.parseInt(input);
    
    input = JOptionPane.showInputDialog(null,
    "    Please Select Your Entertainment Service" + "\n" +
    "                 Monthly Cost" + "\n" +
    " ____________________________________________________" + "\n" +
    "       1. Disney                           $ 5.99" + "\n" +
    "       2. Hulu                             $ 7.99" + "\n" +
    "       3. Sports + Disney + Hulu           $10.99" + "\n" +
    "       4. No Service" + "\n" +
    " ____________________________________________________",
    "Entertainment Service",
    JOptionPane.QUESTION_MESSAGE
    );
    eCode = Integer.parseInt(input);

    // phone code switch
    switch(phoneCode) {
      case 1: {
    	  phoneName = "Apple iPhone 14 Pro";
    	  phoneCost = 99.33;
    	  nServices++;
    	  break;
    }  case 2: {
        phoneName = "Samsung Galaxy S20 FE 5g UW";
        phoneCost = 83.55;
        nServices++;
        break;
    } case 3: {
        phoneName = "Google Pixel 6 Pro";
    	  phoneCost = 50.72;
    	  nServices++;
    	  break;
    } case 4: {
    	  phoneName = "Motorola Moto g pure";
    	  phoneCost = 41.25;
    	  nServices++;
    	  break;
    } case 5:
        phoneName = "";
        phoneCost = 0;
        break;
    };
    
    // services code switch
    switch (sCode) {
      case (1): {
        sName = "Unlimited (Start)";
        sCost = 35.00;
        nServices++;
    } case (2): {
        sName = "Unlimited (Play More)";
        sCost = 55.00;
        nServices++;
    } case (3): {
      sName = "Unlimited (Get More)";
      sCost = 65.00;
      nServices++;
    } case (4): {
      sName = "Shared Data (S 5GB)";
      sCost = 75.00;
      nServices++;
    }  case (5): {
      sName = "Shared Data (M 10GB)";
      sCost = 85.00;
      nServices++;
    }
    }

    // entertainment code switch
    switch(eCode) {
      case (1): {
        eName = "Disney";
        eCost = 5.99;
        nServices++;
        break;
    } case (2): {
        eName = "Hulu";
        eCost = 7.99;
        nServices++;
        break;
    } case (3): {
        eName = "Sports + Disney + Hulu";
        eCost = 10.99;
        nServices++;
        break;
    } case (4): {
        eName = "";
        eCost = 0;
        break;
    }
    }
    // calculate total
    total = phoneCost + sCost + eCost;
    // services discount
    if (nServices == 2) {
      discount = 0.20;
    } else if (nServices > 3) {
      discount = 0.25;
    } else {
      discount = 0.00;
    }
    JOptionPane.showMessageDialog(null, 
    "                   CSC 229 - Project 02" + "\n" +
    "_____________________________________________________________" + "\n" +
    "First Name : " + uFname + "\n" +
    "Last Name  : " + uLname + "\n" +
    "Address    : " + uAddress + "\n" +
    "             " + uCity + "," + uState + uZip + "\n" +
    "_____________________________________________________________" + "\n" +
    "                       Service List" + "\n" +
    "_____________________________________________________________" + "\n" +
    "Phone                 :" + phoneName + "       ---" + phoneCost + "\n" +
    "Service Plan          :" + sName + "           ---" + sCost + "\n" +
    "Entertainment Service :" + eName + "           ---" + eCost + "\n" +
    "_____________________________________________________________" + "\n" +
    "                       Total Cost: $" + total + "\n" +
    "                       % Discount: %" + discount * 100 + "\n" +
    "                       Final Cost: $" + (total - total * discount) + "\n" +
    "_____________________________________________________________" + "\n",
    "Final Cost of Services",
    JOptionPane.INFORMATION_MESSAGE
    );
  }
}