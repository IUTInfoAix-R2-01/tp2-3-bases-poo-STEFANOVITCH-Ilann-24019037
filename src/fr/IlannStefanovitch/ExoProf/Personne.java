package fr.IlannStefanovitch.ExoProf;

public class Personne {
	private String Nom;
	private String Prenom;
	
	public Personne(String Nom , String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	public Personne() {
		Nom = "Pas de Nom";
		Prenom = "Pas de Prenom";
	}
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public String toString() {
		return "Le Nom est "+ Nom + " Le prenom est "+Prenom;
	}

}
