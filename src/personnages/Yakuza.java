package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boissonFavorite, String clan) {
		super(nom,argent,boissonFavorite);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ...");
		parler(victime.getNom() + " si tu tiens a la vie, donne moi ta bourse !");
		int perte = victime.argent;
		gagnerArgent(victime.argent);
		reputation++;
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + perte + " sous de " + victime.getNom() + " , ce qui me fait " + argent + " sous dans ma poche. Hi Hi !");
	}
}
