package oblig2;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;



public class Trinnskatt {

	public static void main(String[] args) {
		/* 
 		Inntekten mellom 0 - 180 800 kroner	Ingen trinnskatt
		Trinn 1	Inntekten mellom 180 800 � 254 500 kroner	1,9 % trinnskatt
		Trinn 2	Inntekten mellom 254 500 � 639 750 kroner	4,2 %  trinnskatt
		Trinn 3	Inntekten mellom 639 750 � 999 550 kroner	13,2 % trinnskatt *
		Trinn 4	Inntekten over  999 550 kroner	16,2 % trinnskatt*/
		
		double l�nn = parseDouble(showInputDialog("Skriv inn din l�nn her: "));
		
		double trinn1 = (l�nn-180800) * 0.019;
		
		double A = (254500 - 180800) * 0.019;
		
		double trinn2 = (l�nn - 254500) * 0.042;
		
		double B = (639750 - 254500) * 0.042;
		
		double trinn3 = (l�nn - 639750) * 0.132;
		
		double C = (999550 - 639750) * 0.132;
		
		double trinn4 = (l�nn - 999550) * 0.162;
		
		//Trinn 0: ingen trinnskatt
		if (l�nn <= 180800) {
			showMessageDialog(null, "Du betaler ingen trinnskatt");
			
		//Trinn 1: 1,9%
		} else if(l�nn > 180800 && l�nn <= 254500) {
			
			showMessageDialog(null, "Du betaler " + trinn1 + " i trinnskatt");
			
			
		//Trinn 2: 4,2%
		} else if(l�nn > 254500 && l�nn <= 639750 ) {
			
			showMessageDialog(null, "Du betaler " + (A + trinn2));
		
			
		//Trinn 3: 13,2%
		} else if(l�nn > 639_750 && l�nn <= 999550) {
			
			showMessageDialog(null, "Du betaler " + (A + B + trinn3));
		
		//Trinn 4: 16,2%
		}else if(l�nn > 999_550) {
			
			showMessageDialog(null, "Du betaler " + (A + B + C + trinn4));
		}

		}

	
		
	

	
		
			
		

	}



		
	


