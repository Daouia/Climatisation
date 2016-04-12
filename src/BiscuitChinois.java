
public class BiscuitChinois {
	String[] s = { "grand", "petit", "moyen" };

	public String prédiction() {
		java.util.Random hasard = new java.util.Random();
		return s[hasard.nextInt(s.length)];
	}

}

/**
 * Ici chaque biscuit est porteur de son propre message (ce qui est le cas
 * dans le monde "réel").
 *
 * @author pbamade
 */
/*public class UnBiscuitChinois {
	// MEMBRES STATIC  partagé par toutes les instances!
    static String[] prédictions = {
            "Attention: traversée de shadoks!",
            "Vous allez bientôt rencontrer une blonde (une VRAIE blonde!)",
            "Ne sortez pas de votre maison demain!",
            "Essayez encore! le prochain tirage sera bénéfique!",
            "Le soleil brillera (bientôt)...",
            "Donnez ce biscuit au chien!",
	    "Ne croyez pas ce qui est inscrit ici !",

    } ;
    static java.util.Random rand = new java.util.Random() ;

	// MEMBRE D'INSTANCE
    final String prédiction ;

    public String getPrédiction() { return this.prédiction ; }

	// CONSTRUCTEUR
    public UnBiscuitChinois() {
	    this.prédiction = prédictions[rand.nextInt(prédictions.length)] ;
    }

    public static void main(String[] args) {
		UnBiscuitChinois biscuit1 = new UnBiscuitChinois() ;
		UnBiscuitChinois biscuit2 = new UnBiscuitChinois() ;
		   System.out.println(" prédiction :" + biscuit1.getPrédiction());
		   System.out.println(" prédiction :" + biscuit2.getPrédiction());
	}

}
*/