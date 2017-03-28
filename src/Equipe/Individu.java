package Equipe;
import code.Clavier;


public class Individu {

	/** 
	 * Proprietees
	 */
	private String nom;
	private String prenom;
	private int  age;
	private String shortDesc;


	/**
	 * Getter & Setter
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}


	/**
	 * Constructeur
	 */
	public Individu() {

		System.out.print("Entrer le nom : ");
		this.setNom(Clavier.lireString());

		System.out.print("Entrer le prenom : ");
		this.setPrenom(Clavier.lireString());
		
		System.out.print("Entrer l'age : ");
		this.setAge(Clavier.lireInt());
		
		System.out.print("Entrer la description : ");
		this.setShortDesc(Clavier.lireString());
		
	}	
	
	/**
	 * Methodes qui affiche un Individu
	 */
	public void showIndividu(){
		
		System.out.println("L'individu s'appel "+this.getPrenom()+" "+this.getNom()+" ");
		System.out.println("Il a "+this.getAge()+" ans");
		System.out.print("Il est "+this.getShortDesc());
	}
	
}


