package TemperatureConverter;
import java.util.*;

public class TemperatureConverter {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int button1, button2;
char option;

System.out.println("------------------TEMPERATURE CONVERTER APP-------------------\n");

do {
	
System.out.println("1: CELSIUS "+"\n2: FAHRENHEIT "+"\n3: KELVIN "+"\n4: RANKINE "+"\n5: REAUMUR "+"\n6: ROMER "+"\n7: DELISLE \n" );

System.out.println("\nChoose the unit which you want to convert:\n");
button1=sc.nextInt();

switch(button1) {
case 1:
System.out.println("1: Celsius(°C) To Fahrenheit(°F) "+"\n2: Celsius(°C) To Kelvin(K) "+"\n3: Celsius(°C) To Rankine(°R) "+"\n4: Celsius(°C) To Reaumur(°N) "+"\n5: Celsius(°C) To Romer(°Rø) "+"\n6: Celsius(°C) To Delisle(°De)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}
else {
	
Celsius temp1=new Celsius();	

if(button2==1) {
temp1.celsiusToFahrenheit(); 	
}

else if(button2==2) {
temp1.celsiusToKelvin(); 		
}

else if(button2==3) {
temp1.celsiusToRankine(); 		
}

else if(button2==4) {
temp1.celsiusToReaumur(); 		
}

else if(button2==5) {
temp1.celsiusToRomer(); 		
}

else if(button2==6) {
temp1.celsiusToDelisle(); 		
}
}
break;

case 2:
System.out.println("1: Fahrenheit(°F) To Celsius(°C) "+"\n2: Fahrenheit(°F) To Kelvin(K) "+"\n3: Fahrenheit(°F) To Rankine(°R) "+"\n4: Fahrenheit(°F) To Reaumur(°N) "+"\n5: Fahrenheit(°F) To Romer(°Rø) "+"\n6: Fahrenheit(°F) To Delisle(°De)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}
else {

Fahrenheit temp2=new Fahrenheit();

if(button2==1) {
temp2.FahrenheitToCelsius(); 	
}

else if(button2==2) {
temp2.FahrenheitToKelvin(); 		
}

else if(button2==3) {
temp2.FahrenheitToRankine(); 		
}

else if(button2==4) {
temp2.FahrenheitToReaumur(); 		
}

else if(button2==5) {
temp2.FahrenheitToRomer(); 		
}

else if(button2==6) {
temp2.FahrenheitToDelisle(); 		
}
}
break;

case 3:
System.out.println("1:Kelvin(K) To Celsius(°C) "+"\n2:Kelvin(K) To Fahrenheit(°F) "+"\n3:Kelvin(K) To Rankine(°R) "+"\n4:Kelvin(K) To Reaumur(°N) "+"\n5:Kelvin(K) To Romer(°Rø) "+"\n6:Kelvin(K) To Delisle(°De)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}
else {

Kelvin temp3=new Kelvin();

if(button2==1) {
temp3.kelvinToCelsius(); 	
}

else if(button2==2) {
temp3.kelvinToFahrenheit(); 		
}

else if(button2==3) {
temp3.kelvinToRankine(); 		
}

else if(button2==4) {
temp3.kelvinToReaumur(); 		
}

else if(button2==5) {
temp3.kelvinToRomer(); 		
}

else if(button2==6) {
temp3.kelvinToDelisle(); 		
}

}
break;

case 4:
System.out.println("1:Rankine(°R) To Celsius(°C) "+"\n2:Rankine(°R) To Fahrenheit(°F) "+"\n3:Rankine(°R) To Kelvin(K) "+"\n4:Rankine(°R) To Reaumur(°N) "+"\n5:Rankine(°R) To Romer(°Rø) "+"\n6:Rankine(°R) To Delisle(°De)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}
else {
	
Rankine temp4=new Rankine();

if(button2==1) {
temp4.rankineToCelsius(); 	
}

else if(button2==2) {
temp4.rankineToFahrenheit(); 		
}

else if(button2==3) {
temp4.rankineToKelvin(); 		
}

else if(button2==4) {
temp4.rankineToReaumur(); 		
}

else if(button2==5) {
temp4.rankineToRomer(); 		
}

else if(button2==6) {
temp4.rankineToDelisle(); 		
}

}
break;


case 5:
System.out.println("1:Reaumur(°N)To Celsius(°C) "+"\n2:Reaumur(°N)To Fahrenheit(°F) "+"\n3:Reaumur(°N)To Kelvin(K) "+"\n4:Reaumur(°N)To Rankine(°R) "+"\n5:Reaumur(°N)To Romer(°Rø) "+"\n6:Reaumur(°N)To Delisle(°De)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}
else {
	
Reaumur temp5=new Reaumur();

if(button2==1) {
temp5.reaumurToCelsius(); 	
}

else if(button2==2) {
temp5.reaumurToFahrenheit(); 		
}

else if(button2==3) {
temp5.reaumurToKelvin(); 		
}

else if(button2==4) {
temp5.reaumurToRankine(); 		
}

else if(button2==5) {
temp5.reaumurToRomer(); 		
}

else if(button2==6) {
temp5.reaumurToDelisle(); 		
}
}
break;

case 6:
System.out.println("1:Romer(°Rø)To Celsius(°C) "+"\n2:Romer(°Rø)To Fahrenheit(°F) "+"\n3:Romer(°Rø)To Kelvin(K) "+"\n4:Romer(°Rø)To Rankine(°R) "+"\n5:Romer(°Rø)To Reaumur(°N) "+"\n6:Romer(°Rø)To Delisle(°De)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}
else {
	
Romer temp6=new Romer();

if(button2==1) {
temp6.romerToCelsius(); 	
}

else if(button2==2) {
temp6.romerToFahrenheit(); 		
}

else if(button2==3) {
temp6.romerToKelvin(); 		
}

else if(button2==4) {
temp6.romerToRankine(); 		
}

else if(button2==5) {
temp6.romerToReaumur(); 		
}

else if(button2==6) {
temp6.romerToDelisle(); 		
}

}

break;

case 7:
System.out.println("1:Delisle(°De)To Celsius(°C) "+"\n2:Delisle(°De)To Fahrenheit(°F) "+"\n3:Delisle(°De)To Kelvin(K) "+"\n4:Delisle(°De)To Rankine(°R) "+"\n5:Delisle(°De)To Reaumur(°N) "+"\n6:Delisle(°De)To Romer(°Rø)\n ");
button2=sc.nextInt();

if(button2 > 6) {
System.out.println("\n\nERROR----Choose the above option\n");	
}

else {
	
Delisle temp7=new Delisle();

if(button2==1) {
temp7.delisleToCelsius(); 	
}

else if(button2==2) {
temp7.delisleToFahrenheit(); 		
}

else if(button2==3) {
temp7.delisleToKelvin(); 		
}

else if(button2==4) {
temp7.delisleToRankine(); 		
}

else if(button2==5) {
temp7.delisleToReaumur(); 		
}

else if(button2==6) {
temp7.delisleToRomer(); 		
}

else {
System.out.println("\n\nERROR----Choose the above option\n");	
}
}
break;

default: System.out.println("\n ERROR---Choose the above option\n");
}

System.out.println("\n\nTo Continue click 'Y' or'y' and To Exit click 'N' OR 'n'\n");
option=sc.next().charAt(0);

}
while(option=='Y'||option=='y');

}
}