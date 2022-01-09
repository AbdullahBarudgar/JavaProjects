package BankingSystem;
import java.util.*;
public class Bank {


	private String name="";
	private int customerNo;
	private String customerId="";
	private float customerBalance;
	private int  id=1000;

	public Bank() {
	Scanner sc=new Scanner(System.in);

	System.out.println("\nEnter the Customer Name");
	this.name=sc.nextLine();

	System.out.println("\nEnter the Customer Number");
	this.customerNo=sc.nextInt();

	System.out.println("\nEnter the Customer Balance");
	this.customerBalance=sc.nextFloat();
	}
	public void setId() {
	this.customerId=id+""+customerNo;
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
	}

	

