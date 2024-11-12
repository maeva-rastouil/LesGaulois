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
		int perte = victime.getArgent();
		gagnerArgent(victime.getArgent());
		reputation++;
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + perte + " sous de " + victime.getNom() + " , ce qui me fait " + getArgent() + " sous dans ma poche. Hi Hi !");
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(getArgent());
		reputation--;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan" + clan + " ?");
		parler("Je l'ai dépouillé de ses " + gain + " sous");
	}
	
	public int getReputation() {
        return reputation;
    }
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoisson());
		parler("Mon clan est celui de "+ this.clan);
	}

}
