package histoire;
import personnages.Humain; 
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco =  new Commercant("Marco", 20);
		Commercant chonin =  new Commercant("Chonin", 40);
		Commercant kumi =  new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30,"whisky", "Warsong");
		Ronin roro = new Ronin("Roro", 60, "shochu");
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		yaku.direBonjour();
	}

}
