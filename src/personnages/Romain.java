package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements; 
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.isInvariantVerified();
		this.equipements = new Equipement[2];
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	private Boolean isInvariantVerified() {
		if (force >= 0) {
			return true;
		}
		else {
			System.out.println("Négatif \n");
			return false;
		}
	}
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forcedebase = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie !");
		} else {
			parler("J'abandonne...");
		}
		assert forcedebase > force;
	}
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé!");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + "!");
			}
			else {
				equipements[1] = equipement;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement);
			}
			break;
		default:
			equipements[0] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement);
			break;
			
		
		}
	}
	public static void main(String[] args) {
		//cr�ation de l'objet asterix de la classe Gaulois
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		Equipement casque = new Equipement("casque");
		Equipement bouclier = new Equipement("bouclier");
		System.out.println(asterix);
		
		//v�rification du fonctionement des m�thodes
		minus.prendreParole();
		minus.parler("Bonjour, je suis un romain");
		minus.recevoirCoup (2);
		minus.sEquiper(bouclier);
		minus.sEquiper(casque);
		
		
	}
}