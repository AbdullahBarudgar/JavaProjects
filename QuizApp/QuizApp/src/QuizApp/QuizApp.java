package QuizApp;

import java.util.*;
public class QuizApp {

public static void main(String[] args) {
char choice;
Scanner sc=new Scanner(System.in);	

System.out.println("\n=========== WELCOME TO THE QUIZGAME============== ");

do {
System.out.println("\n\n1: AGRICULTURE "+"\n2: HISTORY "+"\n3: COMPUTER"+"\n4: SPORTS\n");

System.out.println("\nSelect the one of the above category you want to play quizgame ");
int button=sc.nextInt();

switch(button) {

case 1:

Agriculture quiz1=new Agriculture();
quiz1.resultAgriculture();
break;

case 2:

History quiz2=new History();
quiz2.resultHistory();
break;

case 3:

Computer quiz3=new Computer();
quiz3.resultComputer();
break;

case 4:
Sports quiz4=new Sports();
quiz4.resultSports();
break;

default: System.out.println("ERROR....Choose from above option");
}
System.out.println("\nDo you want to try another category if yes then click 'Y'OR 'y', if no click 'N' Or 'n'");
choice=sc.next().charAt(0);
}while(choice=='Y' || choice=='y');
}
}