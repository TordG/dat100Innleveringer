package oblig2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class n_Fakultet {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("skriv inn et heltall"));
		
		int fak = 1;
		
		if (n >= 0) {
			
			for ( ; n > 0; n--) {
				
				fak = fak * n;
				
				System.out.println(fak);
				
				
				
			}
			
		} else {
			
			System.out.println("Ikke valid");

		}
		

	}

}
