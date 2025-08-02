package _03_Intro_to_Enums;

public enum StatesOfMatter {

	
	SOLID(0), LIQUID(25.55), GAS(100);
		
	private double celsiusTemp;
	
	
	StatesOfMatter(double i) {
		// TODO Auto-generated constructor stub
		celsiusTemp = i;
	}


	public void setCelsiusTemp(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	public double getCelsiusTemp() {
		return celsiusTemp;
	}
	public double convertToFarenheit(double celsius) {
		return (celsius * 9/5)+32;
	}
}
