package Fonction;

import Modele.Calculatrice;

public class FonctionsCalculatrice {

	/*Instanciation d'une calculatrice*/

	public static Calculatrice createCalc() {

		Calculatrice Calculatrice1 = new Calculatrice("CASIO GRAPH 35+",2010,139);
		return Calculatrice1; 
	};

	
	/*Indiçage 1 =>Première Limite max  pour le nombre mystère*/

	public static int nombremax () {
		int min = 0;
		int max = 10000;
		int max1 = min + (int)(Math.random() * ((max - min) + 1));
		return max1;
	}


	/* Générateur du chiffre mystère*/
	public static int nombremystere (int max1) {

		int min = 0;
		int Max = 10000;

		int max = max1;

		int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));
		return nombreAleatoire;}
	
	      
	
		

}
