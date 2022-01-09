package Multitreading;

import java.util.Scanner;

public class ReverseThread extends Thread {
	
	Scanner sc=new Scanner (System.in);	
	
	public void run() {
    try {
    
    System.out.println("\n\nReverse of series 20 is : \n");
	for(int i=20; i>=0; i--) {
	System.out.print(i+" ");
	}
    }catch(Exception e) {
	System.out.println("Error "+ e);
	}
	}
}
