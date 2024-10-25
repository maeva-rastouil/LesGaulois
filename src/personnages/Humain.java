package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argent;
	
	public Humain(String nom, int argent, String boissonFavorite) {
		this.nom = nom;
		this.argent = argent;
		this.boissonFavorite = boissonFavorite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " " + texte + " ");
	}
	
	private String prendreParole() {
		return "L'humain " + nom + " : ";
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent > prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que  " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");
		}
		
	}
	
	protected void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	protected void perdreArgent(int perte) {
		argent = argent - perte;
	}

}

