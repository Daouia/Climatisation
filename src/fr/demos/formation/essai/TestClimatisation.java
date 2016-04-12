package fr.demos.formation.essai;

import fr.demos.formation.Climatisation;

//import fr.demos.formation.Climatisation;

public class TestClimatisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// déclarer et allouer un objet "Climatisaiton"
		Climatisation clim1 = new Climatisation(37);
		Climatisation clim2 = new Climatisation(37,1013,0,"214");
		Climatisation clim3 = new Climatisation(37,1013,30,"213");
		clim2.getPressionPoucesMercure();
        // affichez-le en utilisant System.out.println
		System.out.println(clim1.getDate());
		System.out.println(clim2.getNomAppareil());
		System.out.println(clim3.getNomAppareil());
	}

}
