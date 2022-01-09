package TemperatureConverter;
import java.util.*;
public class Fahrenheit {
	
private  double answer;
private  double temperature;

public Fahrenheit() {
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the temperature in Fahrenheit(°F): ");
this.temperature=sc.nextDouble();
}

public void FahrenheitToCelsius() {
this.answer=(temperature - 32) * 5/9;
System.out.println("The answer is "+answer+"°C");
}

public void FahrenheitToKelvin() {
this.answer=(temperature +459.67) * 5/9;
System.out.println("The answer is "+answer+"K");
}

public void FahrenheitToRankine() {
this.answer= temperature + 459.67;
System.out.println("The answer is "+answer+"°R");
}

public void FahrenheitToReaumur() {
this.answer= (temperature - 32) * 4/9;
System.out.println("The answer is "+answer+"°N");
}

public void FahrenheitToRomer() {
this.answer= (temperature - 32) * 7/24 + 7.5 ;
System.out.println("The answer is "+answer+"°Rø");
}

public void FahrenheitToDelisle() {
this.answer= (212 - temperature) * 5/6;
System.out.println("The answer is "+answer+"°De");
}


}