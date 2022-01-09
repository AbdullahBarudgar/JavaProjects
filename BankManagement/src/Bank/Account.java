package Bank;
import java.util.*;
import java.util.LinkedList;

public class Account {
Scanner sc=new Scanner(System.in);	
List<Integer> account=new LinkedList<>();

private String name;
private int accnumber;
private int newaccnumber;
private String pan;
private String phone;
private String email;
char ch;

public void AccountInfo(){

System.out.print("\nEnter The Name: ");
this.name=sc.nextLine();

System.out.print("\nEnter The Account Number: ");
this.accnumber=sc.nextInt();
sc.nextLine();
System.out.print("\nEnter The Pancard Number: ");
this.pan=sc.nextLine();

System.out.print("\nEnter The Mobile Number: ");
this.phone=sc.nextLine();

System.out.print("\nEnter The Email Id: ");
this.email=sc.nextLine();

}

public void addAccount() {
account.add(accnumber);
}

public void removeAccount() {
if(!account.contains(accnumber))	
System.out.println("\nERROR----Account doesnot exist ");
else
account.remove(accnumber);

}

public void updateAccount() {
if(!account.contains(accnumber))	
System.out.println("\nERROR----Account doesnot exist ");
else 
System.out.print("\nEnter your new account number :");
sc.nextLine();
this.newaccnumber=sc.nextInt();
account.set(account.indexOf(accnumber),newaccnumber);	
}

public void Receipt() {

System.out.print("\nAccount Holder Name: "+ name + "\nAccount Holder Pancard: "+pan+"\nMobile Number: "+phone+"\nEmail Id: "+email);
if(ch=='A')
System.out.print("\nAccount Number: "+newaccnumber);
else
System.out.print("\nAccount Number: "+accnumber);	

}
}