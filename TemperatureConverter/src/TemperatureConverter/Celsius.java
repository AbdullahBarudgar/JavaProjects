package TemperatureConverter;
import java.util.*;
public class Celsius {

private  double answer;
private  double temperature;

public Celsius() {
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the temperature in Celsius(°C): ");
this.temperature=sc.nextDouble();
}

public void celsiusToFahrenheit() {
this.answer=(9/5*temperature)+32;
System.out.println("\nThe answer is "+answer+"°F");
}

public void celsiusToKelvin() {
this.answer=temperature+273.15;
System.out.println("The answer is "+answer+"K");
}

public void celsiusToRankine() {
this.answer= (temperature* 1.8000) + 491.67;
System.out.println("The answer is "+answer+"°R");
}

public void celsiusToReaumur() {
this.answer= temperature*4/5;
System.out.println("The answer is "+answer+"°N");
}

public void celsiusToRomer() {
this.answer= temperature * 21/40 + 7.5;
System.out.println("The answer is "+answer+"°Rø");
}

public void celsiusToDelisle() {
this.answer= (100 -temperature )*3/2;
System.out.println("The answer is "+answer+"°De");
}

}

