package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom,argent,boissonFavorite);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent_donner = argent/10;
		parler( beneficiaire.getNom() + " prend ces " + argent_donner + " sous.");
		beneficiaire.recevoir(argent_donner);
		perdreArgent(argent_donner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int forceRonin = honneur*2;
		parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (forceRonin >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza!");
			int argentAdversaire = adversaire.perdre();
			gagnerArgent(argentAdversaire);
			honneur++;
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			adversaire.gagner(argent);
		}
	}
}

