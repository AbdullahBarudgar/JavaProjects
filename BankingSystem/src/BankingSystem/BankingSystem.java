package BankingSystem;
import java.util.*;
public class BankingSystem {

/*	The major advantage of encapsulation in Java is data hiding. 
 * Using encapsulation we can allow the programmer to decide on 
 * the access to data and methods operating on that data. 
 * For example, if we want a particular piece of data to be inaccessible
 *  to anyone outside the class, then we make that data private.
 */
	
private String name="";                            
private String customerNo;
private String customerId="";
private float customerBalance;
private int  id=1000;	

public BankingSystem() {                // Constructor and name will be class name
	Scanner sc=new Scanner(System.in);

 // We are using this key word to remove the confusion between class attribute and function parameter

	System.out.println("\nEnter the Customer Name:  ");
	this.name=sc.nextLine();                              

	System.out.println("\nEnter the Customer Number: ");
	this.customerNo=sc.nextLine();

	System.out.println("\nEnter the Customer Balance :");
	this.customerBalance=sc.nextFloat();
	}

	public void setId() {
	this.customerId=id+""+customerNo.hashCode();      /* We are using hashCode() function as 
	                                                   a object identifier  which give unique identy
	                                                    to the customer ID. */
   System.out.println("Customer ID :"+customerId);
	}
	

	public void deposit() {
	float amount;	
	Scanner sc=new Scanner(System.in);
	do {
	System.out.print("\nDeposit the amount(0 to quit)");
	amount=sc.nextFloat();

	if(amount!=0) {
	customerBalance+=amount;
	}
	else {
	break;	
	}
	}while(amount!=0);
	}

	public void withdraw() {
	float num;	
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("\nWithdrawn the amount(0 to quit)");
	 num=sc.nextFloat();
	 
	if(num!=0) {
	customerBalance-=num;	
	}
	else {
	break;
	}
	}while(num!=0);
	}

	public void receipt() {

	System.out.println("\nName of the Customer: "+name+"\nCustomer Balance: "+customerBalance);
	setId();
	}
	
	public static void main(String[] args) {


	BankingSystem obj=new BankingSystem();
	obj.deposit();
	obj.withdraw();
	obj.receipt();
		}

	}		
	


