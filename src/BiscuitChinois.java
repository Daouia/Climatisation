
public class BiscuitChinois {
	String[] s = { "grand", "petit", "moyen" };

	public String pr�diction() {
		java.util.Random hasard = new java.util.Random();
		return s[hasard.nextInt(s.length)];
	}

}

/**
 * Ici chaque biscuit est porteur de son propre message (ce qui est le cas
 * dans le monde "r�el").
 *
 * @author pbamade
 */
/*public class UnBiscuitChinois {
	// MEMBRES STATIC  partag� par toutes les instances!
    static String[] pr�dictions = {
            "Attention: travers�e de shadoks!",
            "Vous allez bient�t rencontrer une blonde (une VRAIE blonde!)",
            "Ne sortez pas de votre maison demain!",
            "Essayez encore! le prochain tirage sera b�n�fique!",
            "Le soleil brillera (bient�t)...",
            "Donnez ce biscuit au chien!",
	    "Ne croyez pas ce qui est inscrit ici !",

    } ;
    static java.util.Random rand = new java.util.Random() ;

	// MEMBRE D'INSTANCE
    final String pr�diction ;

    public String getPr�diction() { return this.pr�diction ; }

	// CONSTRUCTEUR
    public UnBiscuitChinois() {
	    this.pr�diction = pr�dictions[rand.nextInt(pr�dictions.length)] ;
    }

    public static void main(String[] args) {
		UnBiscuitChinois biscuit1 = new UnBiscuitChinois() ;
		UnBiscuitChinois biscuit2 = new UnBiscuitChinois() ;
		   System.out.println(" pr�diction :" + biscuit1.getPr�diction());
		   System.out.println(" pr�diction :" + biscuit2.getPr�diction());
	}

}
*/