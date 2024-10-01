package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
			this.nom = nom;
			this.effetPotionMin = effetPotionMin;
			this.effetPotionMax = effetPotionMax;
			parler("Bonjour, je suis le druide " + nom
					+ " et ma potion peut aller d'une force " + effetPotionMin + " à "
					+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		Random random = new Random();
		
		int random1 = random.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		random.nextInt(effetPotionMax - effetPotionMin);
		
		while(random1 < effetPotionMin || random1 > effetPotionMax) {
			random1 = random.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		}
		if (random1 > 7) {
			System.out.println("J'ai préparé une super potion de force "+ random1);
		}
		else {
			System.out.println("Je n'ai pas trouvé les ingrédients, ma potion est seulement de force " + random1);
		}
		
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obelix")) {
			System.out.println("Non, Obélix !... Tu n'auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(this.forcePotion);
		}
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}
