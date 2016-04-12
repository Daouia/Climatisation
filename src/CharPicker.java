/** Cette classe permet de choisir un caract�re au hasard
 * elle est utilis�e sur une cha�ne pour simplifier
 */
public class CharPicker {

	// variable membre initialis�e
	//
	java.util.Random luck = new java.util.Random() ;


	// m�thode membre
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