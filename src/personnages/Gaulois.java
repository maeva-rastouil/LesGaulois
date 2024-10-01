package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois (String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
				+ romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}
	public void boirePotion(int forcePotion){
		this.effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée !");
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
		+ effetPotion + "]";
	}
	public static void main(String[] args) {
		//création de l'objet asterix de la classe Gaulois
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		System.out.println(asterix);
		
		//vérification du fonctionement des méthodes
		asterix.prendreParole();
		asterix.parler("Bonjour");
		asterix.frapper(minus);
		asterix.boirePotion(10);

	}

}


