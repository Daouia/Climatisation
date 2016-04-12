/** Cette classe permet de choisir un caractère au hasard
 * elle est utilisée sur une chaîne pour simplifier
 */
public class CharPicker {

	// variable membre initialisée
	//
	java.util.Random luck = new java.util.Random() ;


	// méthode membre
	public char pickCharIn(String aString) {
		int length = aString.length() ;
		int index = luck.nextInt(length);
		return aString.charAt(index) ;
	}


	@Override
	public String toString() {
		return "CharPicker [luck=" + luck + "]";
	}
}