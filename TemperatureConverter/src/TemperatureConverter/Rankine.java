package TemperatureConverter;
import java.util.*;
public class Rankine {


	private  double answer;
	private  double temperature;

	public Rankine() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the temperature in Rankine(°R): ");
	this.temperature=sc.nextDouble();
	}

	public void rankineToCelsius() {
	this.answer= (temperature-491.61) *5/9;
	System.out.println("The answer is "+answer+"°C");
	}

	public void rankineToFahrenheit() {
	this.answer=temperature - 459.67 ;
	System.out.println("The answer is "+answer+"°F");
	}

	public void rankineToKelvin() {
	this.answer= temperature *  5/9;
	System.out.println("The answer is "+answer+"K");
	}

	public void rankineToReaumur() {
	this.answer=  (temperature-491.67) *4/9;
	System.out.println("The answer is "+answer+"°R");
	}

	public void rankineToRomer() {
	this.answer=(temperature-491.67)*7/24+2.5;
	System.out.println("The answer is "+answer+"°Rø");
	}

	public void rankineToDelisle() {
	this.answer=  (671.67-temperature)*5/6;
	System.out.println("The answer is "+answer+"°De");
	}
}
