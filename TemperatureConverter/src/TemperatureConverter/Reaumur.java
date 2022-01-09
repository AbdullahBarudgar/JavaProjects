package TemperatureConverter;
import java.util.*;
public class Reaumur {
	
	private  double answer;
	private  double temperature;

	public Reaumur() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the temperature in Reaumur(°N): ");
	this.temperature=sc.nextDouble();
	}

	public void reaumurToCelsius() {
	this.answer= temperature * 5/4;
	System.out.println("The answer is "+answer+"°C");
	}

	public void reaumurToFahrenheit() {
	this.answer=(temperature * 9/4)+32;
	System.out.println("The answer is "+answer+"°F");
	}

	public void reaumurToKelvin() {
	this.answer= temperature * 5/4 + 273.15;
	System.out.println("The answer is "+answer+"K");
	}
	
	public void reaumurToRankine() {
	this.answer= temperature *  9/4 + 491.67;
	System.out.println("The answer is "+answer+"°R");
	}
	
	public void reaumurToRomer() {
	this.answer= (temperature * 21/32)+7.5;
	System.out.println("The answer is "+answer+"°Rø");
	}

	public void reaumurToDelisle() {
	this.answer= (80 - temperature) * 15/3;
	System.out.println("The answer is "+answer+"°De");
	}	

}
