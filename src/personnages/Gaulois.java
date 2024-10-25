package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois (String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//	}
	public void frapper(Romain romain){
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] recup = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; recup != null && i < recup.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = recup[i];
		}
	}
	public void boirePotion(int forcePotion){
		this.effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + forcePotion + " fois d�cupl�e !");
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
		+ effetPotion + "]";
	}
	public static void main(String[] args) {
		//cr�ation de l'objet asterix de la classe Gaulois
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		System.out.println(asterix);
		
		//v�rification du fonctionement des méthodes
		asterix.prendreParole();
		asterix.parler("Bonjour");
		asterix.frapper(minus);
		asterix.boirePotion(10);

	}

}


