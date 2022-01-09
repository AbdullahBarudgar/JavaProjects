package library;

import java.util.*;

public class Student {

Scanner sc=new Scanner(System.in);	


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


public void sci() {

System.out.print("\nEnter the Science book name:\n ");
this.bookname=sc.nextLine();
System.out.println(" B: Borrow  R: Return \n");

btn1=sc.nextLine();
switch(btn1) {

case "B":
s.add(bookname);
break;
case "R":
if(!s.contains(bookname))
System.out.println("\n ERROR----THIS BOOK IS NOT BORROWED");
else
s.remove(bookname);	
break;

default: System.out.println("\n ERROR----Enter the correct option");
}	
}
public void maths() {

System.out.print("\nEnter the Mathematics book name: ");
this.bookname=sc.nextLine();
System.out.println(" B: Borrow  R: Return \n");
btn2=sc.nextLine();
switch(btn2) {

case "B":
m.add(bookname);
break;
case "R":
if(!m.contains(bookname))
System.out.println("\n ERROR----THIS BOOK IS NOT BORROWED");
else
m.remove(bookname);
break;

default: System.out.println("\n ERROR----Enter the correct option");
}
}

public void his() {

System.out.print("\nEnter the History book name: ");
this.bookname=sc.nextLine();
System.out.println(" B: Borrow  R: Return \n");
btn3=sc.nextLine();
switch(btn3) {

case "B":
h.add(bookname);
break;
case "R":
if(!h.contains(bookname))
System.out.println("\n ERROR----THIS BOOK IS NOT BORROWED");
else
h.remove(bookname);	
break;

default: System.out.println("\n ERROR-----Enter the correct option");
}
}

public void gk() {

System.out.print("\nEnter the General Knowledge book name: ");
this.bookname=sc.nextLine();
System.out.println(" B: Borrow  R: Return \n");
btn4=sc.nextLine();
switch(btn4) {

case "B":
g.add(bookname);
break;
case "R":
if(!g.contains(bookname))
System.out.println("\n ERROR----THIS BOOK IS NOT BORROWED");
else
g.remove(bookname);	
break;

default: System.out.println("\n ERROR----Enter the correct option");
}
}

public void civ() {

System.out.print("\nEnter the Civices book name: ");
this.bookname=sc.nextLine();
System.out.println(" B: Borrow  R: Return \n");
btn5=sc.nextLine();
switch(btn5) {

case "B":
c.add(bookname);
break;
case "R":
if(!c.contains(bookname))
System.out.println("\n ERROR----THIS BOOK IS NOT BORROWED");
else
c.remove(bookname);	
break;

default: System.out.println("\n ERROR-----Enter the correct option");
}
}


public void BookList() {

System.out.println("\n\n---------BOOK BORROW LIST-------\n"+"\nSCIENCE:"+s +"\nMATHEMATICS: "+ m+"\nHISTORY: "+h+"\nGK:"+g+"\nCIVICES:"+c);	


}
}
