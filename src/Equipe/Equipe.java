package Equipe;

import java.util.Vector;

public class Equipe {

	public class EquipeVector {

		/***
		 * Variable contenant la collection d'individu
		 */
		private Vector<Individu> CurrentEquipe;

		/***
		 * Insertion d'un Indidividu dans MonEquipe
		 */
		public EquipeVector() {
			CurrentEquipe = new Vector<Individu>();	
		}


		/***
		 * Ajout d'un Individu dans MonEquipe
		 */
		public void addIndividu() {
			CurrentEquipe.addElement(new Individu());
		}

		/**
		 * Affiche la composition de MonEquipe
		 */
		public void ShowEquipe() {

			//Si Monequipe est vide alors on affiche un message
			if (CurrentEquipe.isEmpty()) {
				System.out.println("Il n’y a pas d'individu dans cette equipe");
			} else {
				//Sinon pour chaque individu de MonEquipe on utilise l'affichage de l'individu
				for (Individu unIndividu : CurrentEquipe) {
					unIndividu.showIndividu();
				}	
			}
		}
	}
}
