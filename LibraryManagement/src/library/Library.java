package library;

import java.util.Scanner;

public class Library  {
	private static String name;	
	private static String semester;
	private static String department;
	private static String year;
	private static String id;
	 
public void studentInfo() {

System.out.print("\nStudent Name :"+name+"\nStudent Department : "+department+"\nStudent Year : "+year+"\nStudent Semester : "+semester);	
};

public void librarianInfo() {

System.out.print("\nLibarian Name :"+name+"\nLibrarian Department : "+department+"\nLibrarian Id Number: "+id);	
};	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
char op;
char opp;
int button2;



AddBook book =new AddBook();
Student student =new Student();	
Library library =new Library();

System.out.println("\n\n--------WELCOME TO LIBRARY--------\n\n");

System.out.println("Select one of the following\n");
System.out.println(" 1: LIBRARIAN \n 2: STUDENT\n ");

int button1=sc.nextInt();

if(button1==2) {
	System.out.print("\n Enter Your Name :");
	sc.nextLine();
	name=sc.nextLine();

	System.out.print("\n Enter Your Department :");	
	department=sc.nextLine();

	System.out.print("\n Enter Your Year :");	
	year=sc.nextLine();

	System.out.print("\n Enter Your Semester :");	
	semester=sc.nextLine();	
}
else {
System.out.print("\n Enter Your Name :");
sc.nextLine();
name=sc.nextLine();

System.out.print("\n Enter Your Department :");	
department=sc.nextLine();

System.out.print("\n Enter Your ID Number:");	
id=sc.nextLine();
    	
}
do {

switch(button1){
	
case 1:


System.out.println("\n\n  1:SCIENCE \n  2: MATHEMATICS \n  3: HISTORY \n  4: GK \n  5: CIVICES \n");
System.out.println("\n Select above in which department you want to access : ");
button2=sc.nextInt();

do {
switch(button2) {

case 1:
book.sci();
break;

case 2:
book.maths();
break;

case 3:
book.his();
break;

case 4:
book.gk();
break;

case 5:
book.civ();
break;

}
System.out.print("\nDo you want add or delete more books if YES='Y' AND NO ='N': \n");
op=sc.next().charAt(0);
}while(op == 'Y' );
break;

case 2:


System.out.println("\n\n 1:SCIENCE \n  2: MATHEMATICS \n  3: HISTORY \n  4: GK \n  5: CIVICES \n");
System.out.println("\n Select above in which department you want to access : ");
button2=sc.nextInt();

do {
switch(button2) {

case 1:
 student.sci();
break;

case 2:
student.maths();
break;

case 3:
student.his();
break;

case 4:
student.gk();
break;

case 5:
student.civ();
break;

	
}

System.out.print("\nDo you want borrow or return more books if YES='Y' AND NO ='N': \n");
op=sc.next().charAt(0);
}while(op == 'Y' );

}

System.out.print("\nDo you want access in other department if YES='Y' AND NO ='N': \n");
opp=sc.next().charAt(0);
}while(opp=='Y');

if(button1==2) {	
library.studentInfo();
student.BookList();
}
else
library.librarianInfo();	
book.BookList();	

	}
}

	

