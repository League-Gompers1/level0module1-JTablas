package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
    	String nickles = JOptionPane.showInputDialog("How many nickles do you have?") ;
    	String dimes = JOptionPane.showInputDialog("How many dimes do you have?") ;
    	String quarters = JOptionPane.showInputDialog("How many quarters do you have?") ;
    	
        // Convert their answer to an int using Integer.parseInt()
    	int numberOfNickles = Integer.parseInt(nickles);
    	System.out.println(nickles);
        // Ask the user how many dimes they have, and convert their answer
    	int numberOfDimes = Integer.parseInt(dimes);
    	System.out.println(dimes);
        // Ask the user how many quarters they have, and convert their answer
    	int numberOfQuarters = Integer.parseInt(quarters);
    	System.out.println(quarters);
        // Calculate how much money the user has and save it in a double variable 
    	double total = (numberOfNickles*.05) + (numberOfDimes*.10) + (numberOfQuarters*.25);
        // Tell the user how much money they have
    	JOptionPane.showMessageDialog(null, "You have $" + total);
    }
}