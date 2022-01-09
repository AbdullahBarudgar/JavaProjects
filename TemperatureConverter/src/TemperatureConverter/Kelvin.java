package TemperatureConverter;
import java.util.*;
public class Kelvin {

	private  double answer;
	private  double temperature;

	public Kelvin() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the temperature in Kelvin(K): ");
	this.temperature=sc.nextDouble();
	}

	public void kelvinToCelsius() {
	this.answer= temperature - 273.15;
	System.out.println("The answer is "+answer+"");
	}

	public void kelvinToFahrenheit() {
	this.answer=(temperature * 9/5) - 459.67 ;
	System.out.println("The answer is "+answer+"°F");
	}

	public void kelvinToRankine() {
	this.answer= temperature *  9/5;
	System.out.println("The answer is "+answer+"");
	}

	public void kelvinToReaumur() {
	this.answer= (temperature -  273.15) *4/5;
	System.out.println("The answer is "+answer+"");
	}

	public void kelvinToRomer() {
	this.answer= (temperature - 273.15) *21/40 + 7.5;
	System.out.println("The answer is "+answer+"");
	}

	public void kelvinToDelisle() {
	this.answer= (373.15 - temperature) * 3/2;
	System.out.println("The answer is "+answer+"");
	}
}
