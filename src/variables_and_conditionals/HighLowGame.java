package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		int num;
		Random ran = new Random();
		num = ran.nextInt(101);
	
		System.out.println(num);
		
		for (int i = 0; i < 100; i++) {
		String ans = JOptionPane.showInputDialog("Enter a number between 1 and 100");
		
		int guess = Integer.parseInt(ans);
		
		if (guess > num){
			JOptionPane.showMessageDialog(null,"Too high");
		} else if (guess < num){
			JOptionPane.showMessageDialog(null,"Too low");			
		} else if (guess == num){
			JOptionPane.showMessageDialog(null, "Nice Job!");
			
			i = 100;
}	
}		
}	
}