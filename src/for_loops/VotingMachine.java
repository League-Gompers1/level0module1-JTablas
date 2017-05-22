package for_loops;

import javax.swing.JOptionPane;

public class VotingMachine {
	public static void main(String[] args) {
		
	String people = JOptionPane.showInputDialog("How many people will be voting today?");
	int amount = Integer.parseInt(people);
	System.out.println(amount);
	
	int rock = 0;
	int bill = 0;
	
	for (int i = amount;i>0;i--){
	String answer = JOptionPane.showInputDialog("Who do you vote for, The Rock, or Bill Nye?");		
	
	if (answer.equals("Bill Nye")){
		bill++;
	} else if (answer.equals("The Rock")){
		rock++;
	}
	
} if (rock>bill){
	JOptionPane.showMessageDialog(null,"The winner is The Rock" );
	} else if (bill>rock){
	JOptionPane.showMessageDialog(null, "The winner is Bill Nye");
	} else if (bill==rock){
	JOptionPane.showMessageDialog(null, "It's a tie");
	}
	
	
}	
}
