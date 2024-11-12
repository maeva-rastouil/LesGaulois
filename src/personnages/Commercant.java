package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom,argent,"thé");
	}
	
	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(getArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste");
		return somme;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler( argent + " sous ! Je te remercie généreux donateur !");
	}
}
