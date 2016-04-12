package fr.demos.formation;
public class TestTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = { 1, 2, 3, 5, 6 };
		Climatisation[] clim = { new Climatisation(37, 0, 30, "213"), new Climatisation(37, 1013, 30, "214"),
				new Climatisation(37, 1013, 30, "215"), new Climatisation(37, 1013, 30, "217") };
		System.out.println(tab[2]);
		System.out.println(clim[2]);
		System.out.println(tab[tab.length - 1]);
		System.out.println(clim[clim.length - 1]);
		System.out.println(moyenneTemperature(clim));
		System.out.println(moyennePression(clim));
	}

	public static double moyenneTemperature(Climatisation[] clim) {
		double somme = 0;
		for (Climatisation c : clim) {
			somme = somme + c.getTemperature();
		}
		return somme / clim.length;
	}

	public static double moyennePression(Climatisation[] clim) {
		double somme = 0;
		int taille = 0;
		for (Climatisation c : clim) {
			if (c.getPression() != 0) {
				somme = somme + c.getPression();
				taille++;
			}
		}
		return somme / taille;
	}
}
