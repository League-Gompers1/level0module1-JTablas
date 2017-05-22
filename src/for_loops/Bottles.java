package for_loops;

import javax.swing.JOptionPane;

public class Bottles {
public static void main(String[] args) {
	int bottles = 99;
	for (int i = bottles; i > 0; i--) {
	
	JOptionPane.showMessageDialog(null, bottles +" bottles of milk on the wall,");
	JOptionPane.showMessageDialog(null, bottles +" bottles of milk, take one down, drink it, I don't know,");
	bottles--;
	JOptionPane.showMessageDialog(null, bottles +" bottles of milk on the wall");
	if(bottles == 0){
	JOptionPane.showMessageDialog(null, "No more bottles of milk on the wall");
	}

}
}
}