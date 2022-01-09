package Bank;

import java.util.Scanner;

public class WithdrawlorDeposit  extends Account {
Scanner sc=new Scanner(System.in);

private int id;	
private String Aadhaar;	
private Long withdrawlcash;
private Long depositcash;
private Long cash=(long) 0.0;

public void TotalCash() {
System.out.print("\nYour Total Cash IN YOUR ACCOUNT Is : " +cash+" Rupees\n");	
}

public void Pin() {
System.out.print("\nEnter The Aadhaar Number: ");
this.Aadhaar=sc.nextLine();
this.id=(int)(Math.random()*10000)+76;
System.out.print("\nYour Account Pin Number is :"+ id+"\n");
account.add(id);
}

public void withdrawl() {
sc.nextLine();
System.out.print("Enter your pin number :");
this.id=sc.nextInt();
if(!account.contains(id)) 
System.out.print("\nERROR------Enter the right pin  ");
else
System.out.print("\nEnter the amount of withrawl : ");
this.withdrawlcash=sc.nextLong();

if(cash>0 && withdrawlcash <=cash) {
cash-=withdrawlcash;
System.out.print("\nYour remaining cash : "+ cash+" Rupees");
}
else {
System.out.println("\nYou dont have sufficient money");
}
}

public void deposit() {	
sc.nextLine();	
System.out.print("Enter your pin number :");
this.id=sc.nextInt();
if(!account.contains(id)) 
System.out.print("\nERROR------Enter the right pin  ");
else
System.out.print("\nEnter the amount of deposit : ");
this.depositcash=sc.nextLong();

cash+=depositcash;
System.out.print("\nYour upadte cash : "+ cash+" Rupees");
}

public void Balancenquiry() {
sc.nextLine();
System.out.print("\n Enter The Pin Number : ");
this.id=sc.nextInt();
if(!account.contains(id)) 
System.out.print("\nERROR------Enter the right pin  ");
else	
System.out.print("\nYour Total Cash is : " +cash+" Rupees");	
}



}
	

