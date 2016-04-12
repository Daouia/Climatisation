package fr.demos.formation;
import java.io.Serializable;
import java.util.Date;
public class Climatisation implements java.io.Serializable{

	private double temperature; // (mesur�e en degr� Celsius)
	private double pression; // (en hectoPascal)
	private double tauxHumidit�; // (un simple pourcentage)
	private String nomAppareil; // (qui cr�e la donn�e).
	public double getTemperature() {
		return temperature;
	}

	public double getPression() {
		return pression;
	}

	public double getTauxHumidit�() {
		return tauxHumidit�;
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
		return "Climatisation \ntemperature=" + temperature + " en Farenheit : "+this.getTemperatureFarenheit()+",\npression=" + pression +  ",  "+this.getPressionPoucesMercure()+", tauxHumidit�="
				+ tauxHumidit� + ", Date=" + date + ", nomAppareil=" + nomAppareil + "";
	}

	public Climatisation(double temperature, double pression, double tauxHumidit�, String nomAppareil) {
		this.temperature = temperature;
		this.pression = pression;
		this.tauxHumidit� = tauxHumidit�;
		//super(temperature,pression,tauxHumidit�);
		this.nomAppareil = nomAppareil;
	}

	public Climatisation(double temperature, double pression, double tauxHumidit�) {
		this(temperature,pression,tauxHumidit�,"");
		//super();
		//this.tauxHumidit�=tauxHumidit�;
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
