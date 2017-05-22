package methods;

import javax.swing.JOptionPane;

public class Milk {
public static void main(String[] args) {
	
	for (int i = 9; i > 0; i--) {
		System.out.println(i);
		//code goes here
		String milk;
		milk = " Bottles of milk on the wall.";
		JOptionPane.showMessageDialog(null, i + milk);
		if (i == 1) {
			JOptionPane.showMessageDialog(null, i + " Bottle of milk on the wall.");
		}
	
	}
	}
	}
