package TemperatureConverter;
import java.util.*;
public class Delisle {

	private  double answer;
	private  double temperature;

	public Delisle() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the temperature in Delisle(°De): ");
	this.temperature=sc.nextDouble();
	}

	public void delisleToCelsius() {
	this.answer= (100 - temperature )*2/3;
	System.out.println("The answer is "+answer+"°C");
	}

	public void delisleToFahrenheit() {
	this.answer=(212 - temperature )*6/5;
	System.out.println("The answer is "+answer+"°F");
	}

	public void delisleToKelvin() {
	this.answer= (373.15 - temperature )* 2/3;
	System.out.println("The answer is "+answer+"K");
	}
	
	public void delisleToRankine() {
	this.answer= ( 671.67 - temperature )*6/5;
	System.out.println("The answer is "+answer+"°R");
	}
	
	public void delisleToReaumur() {
	this.answer= (80 - temperature ) * 8/15;
	System.out.println("The answer is "+answer+"°N");
	}

	public void delisleToRomer() {
	this.answer= (60 - temperature) * 7/20;
	System.out.println("The answer is "+answer+"°Rø");
	}	
}
