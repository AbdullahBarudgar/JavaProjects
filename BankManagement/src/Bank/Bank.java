package Bank;
import java.util.*;

public class Bank extends Account {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int button1;
int button2;
char option ;

WithdrawlorDeposit wd=new WithdrawlorDeposit();	

System.out.println("\n---------WELCOME TO THE CHOTA BHEEM BANK--------\n");	
Account ac=new Account();
ac.AccountInfo();
ac.addAccount();
wd.Pin();

System.out.println("\nDo you want to update or remove account: if yes the select 'Y' OR 'N'");
option=sc.next().charAt(0);

if(option=='Y') {
System.out.print("\n1: REMOVE ACCOUNT "+"\n2: UPDATE ACCOUNT \n");
button2=sc.nextInt();

switch(button2) {

case 1:
ac.removeAccount();
break;

case 2:
ac.updateAccount();	
break;

default : System.out.println("\nError----Select the right option above\n");
}
}

System.out.println("\n---------WELCOME TO THE CHOTA BHEEM ATM--------\n");	

do {
System.out.println("\n1: DEPOSIT MONEY "+"\n2: WITHDRAWL MONEY "+"\n3: BALANCE ENQUIRY "+"\n4: ACCOUNT ENQUIRY");
button1=sc.nextInt();


switch(button1) {

case 1:
do {
	
wd.deposit();
System.out.println("\nDo you want to deposit more money : Select Yes='Y' OR No = 'N'");
option=sc.next().charAt(0);
}while(option=='Y');
ac.Receipt();
wd.TotalCash();
break;

case 2:
do {	
wd.withdrawl();
System.out.println("\nDo you want to withdrawl more money : Select Yes='Y' OR No = 'N'");
option=sc.next().charAt(0);
}while(option=='Y');
ac.Receipt();
wd.TotalCash();
break;

case 3:
wd.Balancenquiry();
break;

case 4:
ac.Receipt();
wd.TotalCash();
break;

default : System.out.println("\nError----Select the right option above\n");

}
System.out.println("\nDo you want check other options :"+"if yes then select 'Y'and 'N' for no ");
option=sc.next().charAt(0);
}while(option=='Y'); 
System.out.println("\nThankyou Sir ,Please come next time again\n ");
}
}

