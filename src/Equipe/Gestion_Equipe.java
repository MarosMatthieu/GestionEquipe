package Equipe;
import java.io.IOException;

import code.Clavier;


public class Gestion_Equipe {

	public static void main (String[] args) throws IOException {

		// Creation de la variable CHOIX pour le case 
		int CHOIX = 0;

		//Creation de l'equipe1 fait d'individu
		Equipe Equipe1 = new Equipe();

		do {
			System.out.println();
			System.out.println("Bienvenue dans le menu de création d'equipe");
			System.out.println("Faite votre choix parmis les proposition suivantes");
			System.out.println(" 1 : Ajout d'un Individu");
			System.out.println(" 2 : Affiche la liste des Individu ");
			System.out.print("Votre choix : ");
			CHOIX = Clavier.lireInt();

			switch (CHOIX) {

			case 1 : Equipe.addIndividu();
			break;

			case 2 : Equipe.showEquipe();
			break;
			default : System.out.println("Cette option n’existe pas ");
			}



		} while (CHOIX != 9);





















		/**
		 * Test d'un individu
		 */
		/*
		// Constructor Use
		 Individu unIndividu = new Individu();

		 // Methode Affichage
		 unIndividu.showIndividu();
		 */	

	}
}
