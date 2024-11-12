package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	
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
	public String getBoisson() {
		return boissonFavorite;
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
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		parler("bonjour");
		memoriser(autreHumain);
		nbConnaissance++;
		repondre(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = autreHumain;
		}
		else {
			//Humain[] temp = new Humain[1];
			for (int i=0; i<nbConnaissance-1;i++) {
				//temp[0] = memoire[i];
				memoire[i]= memoire[i+1];
			}
			memoire[nbConnaissance-1] = autreHumain;
		}
		
	}
	
	private void repondre(Humain autreHumain) {
		autreHumain.parler("bonjour");
		autreHumain.memoire[autreHumain.nbConnaissance] = this;
		autreHumain.nbConnaissance++;
		
	}
	
	public void listerConnaissance(){
		if (nbConnaissance == 1) {
			parler("Je connais beaucoup de monde dont : ");
			System.out.print(memoire[0].getNom());
		}
		else if (nbConnaissance > 1) {
			parler("Je connais beaucoup de monde dont : ");
			for (int i=0; i<nbConnaissance-1;i++) {
				System.out.print( memoire[i].getNom() + " , ");
			}
			System.out.println();
			//System.out.println(memoire[nbConnaissance-1].getNom());
		}
	}
}

