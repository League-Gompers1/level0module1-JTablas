
package variables_and_conditionals;

import javax.swing.JOptionPane;

public class HoroScope {
public static void main(String[] args) {
	String january = "Capricorn";
	String february = "Aquarius";
	String march = "Pisces";
	String april = "Aries";
	String may = "Taurus";
	String june = "Gemini";
	String july = "Cancer";
	String augest = "Leo";
	String september = "Virgo";
	String october = "Libre";
	String november = "Scorpio";
	String december = "Sagittarius";

	String month = JOptionPane.showInputDialog("Enter month");
	if (month.equals("January")){
    JOptionPane.showMessageDialog(null, "You are a  "+ january);    
	} else if (month.equals("February")){
	    JOptionPane.showMessageDialog(null, "You are a "+ february);    
	} else if (month.equals("March")){
	    JOptionPane.showMessageDialog(null, "You are a "+ march);    
	} else if (month.equals("April")){
	    JOptionPane.showMessageDialog(null, "You are a "+ april);    
	} else if (month.equals("May")){
	    JOptionPane.showMessageDialog(null, "You are a "+ may);    
	} else if (month.equals("June")){
	    JOptionPane.showMessageDialog(null, "You are a "+ june);    
	} else if (month.equals("July")){
	    JOptionPane.showMessageDialog(null, "You are a "+ july);    
	} else if (month.equals("Augest")){
	    JOptionPane.showMessageDialog(null, "You are a "+ augest);    
	} else if (month.equals("September")){
	    JOptionPane.showMessageDialog(null, "You are a "+ september);    
	} else if (month.equals("October")){
	    JOptionPane.showMessageDialog(null, "You are a "+ october);    
	} else if (month.equals("November")){
		    JOptionPane.showMessageDialog(null, "You are a "+ november);    
	} else if (month.equals("December")){
		    JOptionPane.showMessageDialog(null, "You are a "+ december);    
	}
		
	
	
	
	
	
	
}
}
