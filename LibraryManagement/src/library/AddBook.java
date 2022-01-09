package library;
import java.util.*;
public class AddBook  {
	

private String newbookname;
private String bookname;

public String btn1;
public String btn2;
public String btn3;
public String btn4;
public String btn5;
List<String> s=new LinkedList<>();
List<String> m=new LinkedList<>();
List<String> h=new LinkedList<>();
List<String> g=new LinkedList<>();
List<String> c=new LinkedList<>();

Scanner sc=new Scanner(System.in);

public void sci() {

System.out.print("\nEnter the Science book name:\n ");
this.bookname=sc.nextLine();
System.out.println(" A: Add  D: Delete  U: UPDATE \n");

btn1=sc.nextLine();
switch(btn1) {

case "A":
s.add(bookname);
break;
case "D":
if(!s.contains(bookname))
System.out.println("\nBook is not available");
else
s.remove(bookname);	
break;

case "U":
if(!s.contains(bookname))
System.out.println("\nBook is not available");	
else
System.out.println("\n Enter new name of the book :");
this.newbookname=sc.nextLine();
s.set(s.indexOf(bookname),newbookname); 
}
}
public void maths() {

System.out.print("\nEnter the Mathematics book name: ");
this.bookname=sc.nextLine();
System.out.println(" A: Add  D: Delete  U: UPDATE \n");
btn2=sc.nextLine();
switch(btn2) {

case "A":
m.add(bookname);
break;
case "B":
if(!m.contains(bookname))
System.out.println("\nBook is not available");
else
m.remove(bookname);
break;

case "U":
if(!m.contains(bookname))
System.out.println("\nBook is not available");	
else
System.out.println("\n Enter new name of the book :");
this.newbookname=sc.nextLine();
m.set(m.indexOf(bookname),newbookname); 
break;
default: System.out.println("\nEnter the correct option");
}
}

public void his() {

System.out.print("\nEnter the History book name: ");
this.bookname=sc.nextLine();
System.out.println(" A: Add  D: Delete  U: UPDATE \n");
btn3=sc.nextLine();
switch(btn3) {

case "A":
h.add(bookname);
break;
case "D":
if(!h.contains(bookname))
System.out.println("\nBook is not available");
else
h.remove(bookname);	
break;

case "U":
if(!h.contains(bookname))
System.out.println("\nBook is not available");	
else
System.out.println("\n Enter new name of the book :");
this.newbookname=sc.nextLine();
h.set(h.indexOf(bookname),newbookname); 
break;

default: System.out.println("\nEnter the correct option");
}
}

public void gk() {

System.out.print("\nEnter the General Knowledge book name: ");
this.bookname=sc.nextLine();
System.out.println(" A: Add  D: Delete  U: UPDATE \n");
btn4=sc.nextLine();
switch(btn4) {

case "A":
g.add(bookname);
break;
case "D":
if(!g.contains(bookname))
System.out.println("\nBook is not available");
else
g.remove(bookname);	
break;

case "U":
if(!g.contains(bookname))
System.out.println("\nBook is not available");	
else
System.out.println("\n Enter new name of the book :");
this.newbookname=sc.nextLine();
g.set(g.indexOf(bookname),newbookname); 
break;

default: System.out.println("\nEnter the correct option");
}
}

public void civ() {

System.out.print("\nEnter the Civices book name: ");
this.bookname=sc.nextLine();
System.out.println(" A: Add  D: Delete U: UPDATE \n");
btn5=sc.nextLine();
switch(btn5) {

case "A":
c.add(bookname);
break;
case "D":
if(!c.contains(bookname))
System.out.println("\nBook is not available");
else
c.remove(bookname);	
break;

case "U":
if(!c.contains(bookname))
System.out.println("\nBook is not available");	
else
System.out.println("\n Enter new name of the book :");
this.newbookname=sc.nextLine();
c.set(c.indexOf(bookname),newbookname); 
break;

default: System.out.println("\nEnter the correct option");
}
}

public void BookList() {

System.out.println("\n\n--------BOOK LIST YOU ADD--------\n"+"\nSCIENCE:"+s +"\nMATHEMATICS: "+ m+"\nHISTORY: "+h+"\nGK:"+g+"\nCIVICES:"+c);	


}
}