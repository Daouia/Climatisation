import java.awt.Color;

public class Chemise {
String modele;
Color couleur;
Taille taille;
public Chemise(String modele, Color couleur, Taille taille) {
	this.modele = modele;
	this.couleur = couleur;
	this.taille = taille;
}
public Chemise() {
}
@Override
public String toString() {
	return "Chemise [modele=" + modele + ", couleur=" + couleur + ", taille=" + taille + "]";
}


}
