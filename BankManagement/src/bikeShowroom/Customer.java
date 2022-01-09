package bikeShowroom;
import java.util.*;

public class Customer {

Scanner sc=new Scanner(System.in);

private String bikename="";
private String name;
private long mobile;
private String address;
private long money; 
private long cardnumber;
private  int cvv; 
private char question1;
private int  question2;

Customer(){
System.out.println("\n-------Please Fill The Form----------");	
System.out.println("\nEnter the Motorcycle Name");
this.bikename=sc.nextLine();	

System.out.println("\nEnter Your Name: ");
this.name=sc.nextLine();

System.out.println("\nEnter Your Adress: ");
this.address=sc.nextLine();
	
System.out.println("\nEnter Your Mobile Number: ");
this.mobile=sc.nextLong();

}

public void Payment() {
System.out.println("\nPlease Enter amount for the bike (in INR) : ");
this.money=sc.nextLong();
}

public void DebitCard() {

System.out.println("\nPlease Enter your Debit Card number: ");
this.cardnumber=sc.nextLong();

System.out.println("\nEnter the Cvv");
this.cvv=sc.nextInt();

Payment();

}

public void Bill() {
System.out.println("\n\n--------BILL----------");	
System.out.print("\nCustomer Name: "+name+"\nCustomer Address: "+address+
		"\nCustomer Mobile Number: "+mobile+"\nCustomer Buy Motorcycle: "+bikename+"\nCustomer Card Number: "+cardnumber+"\nCustomer Payment: "+money);	
}

public void ques() {

System.out.println("\nDo want to buy this motorcycle ?"+"\nPlease we are waiting for your answer for 'YES' enter 'Y' and for 'NO' enter 'N'" );
this.question1=sc.next().charAt(0);

if(question1=='Y') {
	
System.out.println("\nPlease select the mod of payment:"+"\n\n1: Debit Card "+"\n2: CashPayment ");
this.question2=sc.nextInt();
if(question2==1) { 
DebitCard();
Bill();
System.out.println("\n\nThankyou Sir Please Visit Next Time Again");
}
else { 
Payment();	
System.out.println("\nThankyou Sir Visit Next Time Again");
}
}
else if(question1=='N'){
System.out.println("\n\nNo Problem Sir Please Visit Next Time Again: ");	
}
}
}
