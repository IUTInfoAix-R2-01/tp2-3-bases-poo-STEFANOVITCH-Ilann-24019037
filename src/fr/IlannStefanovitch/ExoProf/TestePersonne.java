package fr.IlannStefanovitch.ExoProf;

public class TestePersonne {
	
	public static void main (String [] args) {
		Personne p1 = new Personne("Ilann","Stef");
		Personne p2 = new Personne();
		System.out.println(p1.getNom());
		System.out.println(p1.getPrenom());
		System.out.println(p1.toString());
		System.out.println(p2.getNom());
		System.out.println(p2.getPrenom());
		System.out.println(p2.toString());
	}
}
