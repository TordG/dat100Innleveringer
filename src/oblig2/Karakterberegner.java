package oblig2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterberegner {

	public static void main(String[] args) {
		// Karakterberegner
		
		
		for (int i = 0; i < 10;  i++) {
			
			 
		
			int poeng = parseInt(showInputDialog("Vennligst legg inn dine poeng her: "));
			
		
			// Karakter A
			if (poeng <= 100 && poeng >= 90) {
				
				showMessageDialog(null, "Du fikk karakteren A");
				System.out.println("A");
				
			// Karakter B
			} else if (poeng <= 89 && poeng >= 80) {
				
				showMessageDialog(null, "Du fikk karakteren B");
				System.out.println("B");
				
			// Karakter C
			} else if (poeng <= 79 && poeng >= 60) {
				
				showMessageDialog(null, "Du fikk karakteren C");
				System.out.println("C");
	
			// Karakter D
			} else if (poeng <= 59 && poeng >= 50) {
				
				showMessageDialog(null, "Du fikk karakteren D");
				System.out.println("D");
			
			// Karakter E
			} else if (poeng <= 49 && poeng >= 40) {
				
				showMessageDialog(null, "Du fikk karakteren E");
				System.out.println("E");
			
			// Karakter F
			} else if (poeng <= 39 && poeng >= 0) {
				
				showMessageDialog(null, "Du fikk karakteren F");
				System.out.println("F");
				
			} else {
				
				showMessageDialog(null, "Ikke en valid poengsum, prøv på nytt");
				i--;
				
				//System.out.println("Ikke valid");
				
			} 
			}
		

		

		
		
		
		
		
		
}
}
