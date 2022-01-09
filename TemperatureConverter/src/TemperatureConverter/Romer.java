package TemperatureConverter;
import java.util.*;
public class Romer {
	
	private  double answer;
	private  double temperature;

	public Romer() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the temperature in Romer(°Rø): ");
	this.temperature=sc.nextDouble();
	}

	public void romerToCelsius() {
	this.answer= (temperature - 7.5)*40/21;
	System.out.println("The answer is "+answer+"°C");
	}

	public void romerToFahrenheit() {
	this.answer=(temperature - 7.5)*24/7 + 32;
	System.out.println("The answer is "+answer+"°F");
	}

	public void romerToKelvin() {
	this.answer= (temperature - 7.5)* 40/21 + 273.15;
	System.out.println("The answer is "+answer+"K");
	}
	
	public void romerToRankine() {
	this.answer= (temperature - 7.5) * 24/7 + 491.67;
	System.out.println("The answer is "+answer+"°R");
	}
	
	public void romerToReaumur() {
	this.answer= (temperature -7.5)*32/21;
	System.out.println("The answer is "+answer+"°N");
	}

	public void romerToDelisle() {
	this.answer= (60 - temperature) * 20/7;
	System.out.println("The answer is "+answer+"°De");
	}	
}
