package Abdullah;

import java.util.*;

public class CurrencyConverter {
	
public double SAR(double num) {
return num*19.83;	
}

public double BHD(double num) {
return num*197.23;	
}

public double AED(double num) {
return num*20.24;	
}

public double OMR(double num) {
return num*193.14;	
}

public double ILS(double num) {
return num*22.59;	
}

public double IQD(double num) {
return num*00.62;	
}

public double IRR(double num) {
return num*0.0018;	
}

public double JOD(double num) {
return num*104.75;	
}

public double KWD(double num) {
return num*246.22;	
}

public double LBP(double num) {
return num*0.049;	
}

public double QAR(double num) {
return num*20.42;	
}

public double LYD(double num) {
return num*16.41;	
}

public double AFN(double num) {
return num*0.94;	
}

public double BDT(double num) {
return num*0.88;	
}

public double CNY(double num) {
return num*11.35;	
}

public double GEL(double num) {
return num*21.61;	
}

public double JPY(double num) {
return num*0.68;	
}

public double LKR(double num) {
return num*0.37;	
}

public double PKR(double num) {
return num*0.49;	
}

public double RUB(double num) {
return num*0.97;	
}

public double TRY(double num) {
return num*9.10;	
}

public double EGP(double num) {
return num*4.47;	
}

public double CLP(double num) {
return num*0.10;	
}

public double NOK(double num) {
return num*8.78;	
}

public double USD(double num) {
return num*74.35;	
}

public double ZAR(double num) {
return num*5.11;	
}


public double AUD(double num) {
return num*56.73;	
}

public double NZD(double num) {
return num*52.25;	
}

public double MXN(double num) {
return num*52.25;	
}

public double CAD(double num) {
return num*58.97;	
}

public double SARD(double num) {
return num*0.27;	
}

public double BHDD(double num) {
return num*2.65;	
}

public double AEDD(double num) {
return num*0.27;	
}

public double OMRD(double num) {
return num*2.60;	
}

public double ILSD(double num) {
return num*0.31;	
}

public double IQDD(double num) {
return num*0.00068;	
}

public double IRRD(double num) {
return num*0.000024;	
}

public double JODD(double num) {
return num*1.41;	
}

public double KWDD(double num) {
return num*3.32;	
}

public double LBPD(double num) {
return num*0.00066;	
}

public double QARD(double num) {
return num*0.27;	
}

public double LYDD(double num) {
return num*0.22;	
}

public double AFND(double num) {
return num*0.013;	
}

public double BDTD(double num) {
return num*0.012;	
}

public double CNYD(double num) {
return num*0.16;	
}

public double GELD(double num) {
return num*0.32;	
}

public double JPYD(double num) {
return num*0.0091;	
}

public double LKRD(double num) {
return num*0.0050;	
}

public double PKRD(double num) {
return num*0.0063;	
}

public double RUBD(double num) {
return num*0.014;	
}

public double TRYD(double num) {
return num*0.11 ;	
}

public double EGPD(double num) {
return num*0.064 ;	
}

public double CLPD(double num) {
return num*0.0014;	
}

public double NOKD(double num) {
return num*0.12 ;	
}

public double USDD(double num) {
return num;	
}

public double ZARD(double num) {
return num*0.071;	
}


public double AUDD(double num) {
return num*0.76;	
}

public double NZDD(double num) {
return num*0.70 ;	
}

public double MXND(double num) {
return num*0.049;	
}

public double CADD(double num) {
return num*0.81;	
}


public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
CurrencyConverter Barudgar=new  CurrencyConverter();
int money;
int option;
double value;
System.out.println("\n                   CURRENCY CONVERTER IN INR AND USD  \n\n");

System.out.println("1: Saudi Arabian Riyal  2: Bahraini Dinar 3: Emirati Dirham  4: Omani Rial  5: 	Israeli Shekel"+
"\n\n6: Iraqi Dinar  7: Iranian Rial  8: Jordanian Dinar  9: Kuwaiti Dinar  10: Lebanese Pound"+
"\n\n11: Qatari Riyal  12: 	Libyan Dinar 13: Afghan Afghani  14: Bangladeshi Taka  15: Chinese Yuan"+
"\n\n16: Georgian Lari  17: Japanese Yen  18: Sri Lankan Rupee  19: Pakistani Rupee 20: Russian Ruble"+
"\n\n21: Turkish Lir  22: Egyptian Pound  23: Chilean Peso  24: Norwegian Krone 25: United States Dollar"+
"\n\n26: South African Rand  27: Australian Dollar  28: New Zealand Dollar  29: Mexican Peso  30: Canadian Dollar");

do {
	
System.out.println("\n\nChoose the currency above to convert in Indian Rupees or US Doller");

money=sc.nextInt();

switch(money) {	

case 1:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.SAR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.SARD(value)+" Doller");	
}
break;

case 2:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.BHD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.BHDD(value)+" Doller");	
}
break;

case 3:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.AED(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.AEDD(value)+" Doller");	
}
break;

case 4:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.OMR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.OMRD(value)+" Doller");	
}
break;

case 5:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.ILS(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.ILSD(value)+" Doller");	
}
break;

case 6:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.IQD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.IQDD(value)+" Doller");	
}
break;

case 7:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.IRR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.IRRD(value)+" Doller");	
}
break;

case 8:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.JOD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.JODD(value)+" Doller");	
}
break;

case 9:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.KWD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.KWDD(value)+" Doller");	
}
break;

case 10:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.LBP(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.LBPD(value)+" Doller");	
}
break;

case 11:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.QAR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.QARD(value)+" Doller");	
}
break;

case 12:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.LYD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.LYDD(value)+" Doller");	
}
break;

case 13:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.AFN(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.AFND(value)+" Doller");	
}
break;

case 14:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.BDT(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.BDTD(value)+" Doller");	
}
break;

case 15:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.CNY(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.CNYD(value)+" Doller");	
}
break;

case 16:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.GEL(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.GELD(value)+" Doller");	
}
break;

case 17:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.JPY(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.JPYD(value)+" Doller");	
}
break;

case 18:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.LKR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.LKRD(value)+" Doller");	
}
break;

case 19:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.PKR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.PKRD(value)+" Doller");	
}
break;

case 20:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.RUB(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.RUBD(value)+" Doller");	
}
break;

case 21:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.TRY(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.TRYD(value)+" Doller");	
}
break;

case 22:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.EGP(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.EGPD(value)+" Doller");	
}
break;

case 23:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.CLP(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.CLPD(value)+" Doller");	
}
break;

case 24:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.NOK(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.NOKD(value)+" Doller");	
}
break;

case 25:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.USD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.USDD(value)+" Doller");	
}
break;

case 26:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.ZAR(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.ZARD(value)+" Doller");	
}
break;

case 27:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.AUD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.AUDD(value)+" Doller");	
}
break;

case 28:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.NZD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.NZDD(value)+" Doller");	
}
break;

case 29:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.MXN(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.MXND(value)+" Doller");	
}
break;

case 30:
System.out.println("1: Indian Rupee(INR)"+"\n2: USD Doller(USD)");
option=sc.nextInt();
System.out.println("\nEnter the Value");
value=sc.nextDouble();
if(option==1) {
System.out.println("\n"+Barudgar.CAD(value)+" Rupees");
}
else {
System.out.println("\n"+Barudgar.CADD(value)+" Doller");	
}
break;

default:
System.out.println("\n\n ERROR-- Choose the above option");
}
}while(money>0);
}                          

}
