package personnages;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageoisMaximum;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois + 1;
	}
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom()  + " vivent les légendaires gaulois :");
		for(int i=0; i<nbVillageois; i++) {
			System.out.println("-" + villageois[i].getNom());
		}
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village Des Irr�ductibles", 30);
		//L'instruction (" Gaulois gaulois = village.trouverHabitant(30); ") affiche l'erreur Index 30 out of bounds for length 30
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		//Gaulois gaulois = village.trouverHabitant(1);      Cette instruction renvoie null ??
		//System.out.println(gaulois);
		village.afficherVillageois();
		
		
	}
}

