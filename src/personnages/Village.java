package personnages;

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
	public static void main(String[] args) {
		Village village = new Village("Village Des Irréductibles", 30);
		
		//L'instruction (" Gaulois gaulois = village.trouverHabitant(30); ") affiche l'erreur Index 30 out of bounds for length 30
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		//Gaulois asterix = new Gaulois("Asterix", 8, village);
	}
}

