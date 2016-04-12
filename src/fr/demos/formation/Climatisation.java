package fr.demos.formation;
import java.io.Serializable;
import java.util.Date;
public class Climatisation implements java.io.Serializable{

	private double temperature; // (mesurée en degré Celsius)
	private double pression; // (en hectoPascal)
	private double tauxHumidité; // (un simple pourcentage)
	private String nomAppareil; // (qui crée la donnée).
	public double getTemperature() {
		return temperature;
	}

	public double getPression() {
		return pression;
	}

	public double getTauxHumidité() {
		return tauxHumidité;
	}

	public String getNomAppareil() {
		return nomAppareil;
	}

	private final Date date = new Date();
	public Date getDate() {
		return date;
	}

	static final int CST1 = 40;
	static final double CST2 = 1.8;
	static final double CST3= 0.0295299831;

	@Override
	public String toString() {
		return "Climatisation \ntemperature=" + temperature + " en Farenheit : "+this.getTemperatureFarenheit()+",\npression=" + pression +  ",  "+this.getPressionPoucesMercure()+", tauxHumidité="
				+ tauxHumidité + ", Date=" + date + ", nomAppareil=" + nomAppareil + "";
	}

	public Climatisation(double temperature, double pression, double tauxHumidité, String nomAppareil) {
		this.temperature = temperature;
		this.pression = pression;
		this.tauxHumidité = tauxHumidité;
		//super(temperature,pression,tauxHumidité);
		this.nomAppareil = nomAppareil;
	}

	public Climatisation(double temperature, double pression, double tauxHumidité) {
		this(temperature,pression,tauxHumidité,"");
		//super();
		//this.tauxHumidité=tauxHumidité;
	}
	public Climatisation(double temperature, double pression) {
		this(temperature,pression,0);
		//super();
		//this.pression=pression;
		
	}
	public Climatisation(double temperature) {
		this(temperature,0);
		//super();
		//this.temperature=temperature;
	}
	public Climatisation() {
		this(0);
	
	}


	public double getTemperatureFarenheit() {

		return ((this.temperature + CST1) * CST2) - CST1;
	}
	
	public double getPressionPoucesMercure(){
		return Math.rint(this.pression*CST3*100)/100;
	}
}
