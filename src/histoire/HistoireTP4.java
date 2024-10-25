package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof", 54, "Kombucha");
		Commercant marco = new Commercant("Marco", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
	}

}