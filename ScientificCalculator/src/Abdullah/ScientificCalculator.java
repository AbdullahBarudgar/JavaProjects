
package Abdullah;

import java.util.Scanner;
public class ScientificCalculator {
	
int multiple=1;	

public float sum(float a,float b) {
return a+b;	
}
public float sub(float a,float b) {
return a-b;	
}
public float mul(float a,float b) {
return a*b;	
}
public float div(float a,float b) {
return a/b;	
}
public double pow(double a,double b) {
	
return Math.pow(a, b);
}
public double square(double a) {
	
return Math.pow(a, 2);
}

public double cube(double a) {
	
return Math.pow(a,3);
}

public double powe(double a,double b) {
	
return Math.pow(a,1/b);
}

public double pow10(double a) {
	
return Math.pow(10,a);
}

public double squareRoot(double a) {
return Math.sqrt(a);	
}

public double cubeRoot(double a) {
return Math.cbrt(a);	
}

public double sine(double a) {

double r=Math.toRadians(a);
return Math.sin(r);
}

public double cose(double a) {

double r=Math.toRadians(a);
return Math.cos(r);
}

public double tane(double a) {

double r=Math.toRadians(a);
return Math.tan(r);
}

public double cosec(double a) {

double r=Math.toRadians(a);
return 1/Math.sin(r);
}

public double sec(double a) {

double r=Math.toRadians(a);
return 1/Math.cos(r);
}

public double cot(double a) {

double r=Math.toRadians(a);
return 1/Math.tan(r);
}

public double expo(double a) {
return Math.exp(a);
}

public double loge(double a) {
return Math.log(a);
}

public double log(double a) {
return Math.log10(a);
}

public double Radian(double a) {
return Math.toRadians(a);
}

public double Degree(double a) {
return Math.toDegrees(a);
}

public int factorial( int a) {
	
for(int i=a; i>=1; i--) {
multiple*=i;	
}
return multiple;
}

public double modulus(double a,double b) {
return a%b;
}

public static void main(String[] args) {

float x,y;
double p,q;
int r;
char ch;
Scanner sc=new Scanner(System.in);

ScientificCalculator calci =new ScientificCalculator();

System.out.println("\n                Scientific Calculator         \n\n ");


System.out.println("1: Addition 2: Substraction  3: Multiplication  4: Division  5: Power x^y  6: Square 7: Cube \n" );
System.out.println("8: Power x^1/b  9: Power 10^x  10: SquareRoot  11: CubeRoot  12: Sin(x)  13: Cos(x)  14: Tan(x)\n" );
System.out.println("15: Cosec(x)  16: Sec(x)  17: Cot(x)  18: Exponential(x)  19: Loge(x)  20: log10(x)  21: Radian(x)\n" );
System.out.println("22: Degree(x)  23: Factorial(x)  24: Modulus(x) " );

System.out.println("\n\nEnter The Button To Perform Function");
int Button=sc.nextInt();
do {

switch(Button){

case 1:
System.out.println("\nEnter the first value");
x=sc.nextInt();
System.out.println("\nEnter the second value");
y=sc.nextInt();
System.out.println("\nThe sum is "+calci.sum(x,y));
break;

case 2:
System.out.println("\nEnter the first value");
x=sc.nextInt();
System.out.println("\nEnter the second value");
y=sc.nextInt();
System.out.println("\nThe subtraction is "+calci.sub(x,y));
break;

case 3:
System.out.println("\nEnter the first value");
x=sc.nextInt();
System.out.println("\nEnter the second value");
y=sc.nextInt();
System.out.println("\nThe multiple is "+calci.mul(x,y));
break;

case 4:
System.out.println("\nEnter the dividend value");
x=sc.nextInt();
System.out.println("\nEnter the divisor value");
y=sc.nextInt();
System.out.println("\nThe Divide is "+calci.div(x,y));
break;

case 5:
System.out.println("\nEnter the base value");
p=sc.nextDouble();
System.out.println("\nEnter the basepower value");
q=sc.nextDouble();
System.out.println("\nThe answere is "+calci.pow(p,q));
break;

case 6:
System.out.println("\nEnter the value");
p=sc.nextDouble();
System.out.println("\nThe Square is "+calci.square(p));
break;

case 7:
System.out.println("\nEnter the value");
p=sc.nextDouble();
System.out.println("\nThe Cube is "+calci.cube(p));
break;

case 8:
System.out.println("\nEnter the base value");
p=sc.nextDouble();
System.out.println("\nEnter the basepower value");
q=sc.nextDouble();
System.out.println("\nThe answere is "+calci.powe(p,q));
break;

case 9:
System.out.println("\nEnter the value");
p=sc.nextDouble();
System.out.println("\nThe answere is "+calci.pow10(p));
break;

case 10:
System.out.println("\nEnter the value");
p=sc.nextDouble();
System.out.println("\nThe Square Root is "+calci.squareRoot(p));
break;

case 11:
System.out.println("\nEnter the value");
p=sc.nextDouble();
System.out.println("\nThe Cube Root is "+calci.cubeRoot(p));
break;

case 12:
System.out.println("\nEnter the Sin Angle");
p=sc.nextDouble();
System.out.println("\nThe value is "+calci.sine(p));
break;

case 13:
System.out.println("\nEnter the Cos Angle");
p=sc.nextDouble();
System.out.println("\nThe value is "+calci.cose(p));
break;

case 14:
System.out.println("\nEnter the Tan Angle");
p=sc.nextDouble();
System.out.println("\nThe value is "+calci.tane(p));
break;

case 15:
System.out.println("\nEnter the Cosec Angle");
p=sc.nextDouble();
System.out.println("\nThe value is "+calci.cosec(p));
break;

case 16:
System.out.println("\nEnter the Sec Angle");
p=sc.nextDouble();
System.out.println("\nThe value is "+calci.sec(p));
break;

case 17:
System.out.println("\nEnter the Cot Angle");
p=sc.nextDouble();
System.out.println("\nThe value is "+calci.cot(p));
break;

case 18:
System.out.println("\nEnter the value ");
p=sc.nextDouble();
System.out.println("\nThe Expontential value is "+calci.expo(p));
break;

case 19:
System.out.println("\nEnter the value ");
p=sc.nextDouble();
System.out.println("\nThe loge value is "+calci.loge(p));
break;

case 20:
System.out.println("\nEnter the value ");
p=sc.nextDouble();
System.out.println("\nThe log10 value is "+calci.loge(p));
break;

case 21:
System.out.println("\nEnter the value ");
p=sc.nextDouble();
System.out.println("\nThe value in Radian is "+calci.Radian(p));
break;

case 22:
System.out.println("\nEnter the value ");
p=sc.nextDouble();
System.out.println("\nThe angle is "+calci.Degree(p));
break;

case 23:
System.out.println("\nEnter the value ");
r=sc.nextInt();
System.out.println("\nThe value im Radian is "+calci.factorial(r));
break;

case 24:
System.out.println("\nEnter the first value(x)");
p=sc.nextDouble();
System.out.println("\nEnter the second value(y)");
q=sc.nextDouble();
System.out.println("\nThe modulus x%y is "+calci.modulus(p,q));
break;

default: 
System.out.println("\nEnter the button which is above mention");	
	}
System.out.println("\nDo you want to continue if yes then press 'Y' or'y' and if NO then press 'N' or 'n'");
ch=sc.next().charAt(0);
}
while(ch=='Y' || ch=='y');
}
}