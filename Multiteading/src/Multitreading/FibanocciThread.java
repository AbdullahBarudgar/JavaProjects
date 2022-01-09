package Multitreading;

import java.util.Scanner;

public class FibanocciThread extends Thread{

Scanner sc=new Scanner (System.in);	

		
	public void run() {
	try {
	int a=0, b=1,c=0;
	
	System.out.println("Fibanocii Series of 20 is : \n");
	for(int i=1; i<=20; i++) {
	a=b;
	b=c;
	c=a+b;
	System.out.print(c+" ");
	}
	}
	catch(Exception e) {
	System.out.println("Error "+ e);
	}
}
}
