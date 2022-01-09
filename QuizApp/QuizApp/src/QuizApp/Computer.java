package QuizApp;

import java.util.*;
public class Computer {
	
	private int right=0;
	private int wrong=0;
	private int answer;
	
	public Computer () {
	Scanner sc=new Scanner(System.in);	
	System.out.println("\n WELCOME TO THE COMPUTER QUIZ ");	
	
	System.out.println("\nQ.1: The two ways to arrange multiple windows on the desktop are -\r\n"
			+ "\n1) cascade and tile\r\n"
			+ "2) drag and drop\r\n"
			+ "3) point and click\r\n"
			+ "4) minimize and maximize");

	this.answer=sc.nextInt();
	if(answer==1) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: Cascade and tile are two ways to arrange multiple windows on the desktop.");
	this.right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\nNote: Cascade and tile are two ways to arrange multiple windows on the desktop.");
	this.wrong++;	 
	}
	
	System.out.println("\nQ.2 Which of the following is a programming language for creating special programs like applets?\r\n"
			+ "\n1) Java\r\n"
			+ "2) cable\r\n"
			+ "3) domain name\r\n"
			+ "4) Net");
	
	answer=sc.nextInt();
	if(answer==1) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: An applet is a Java program that can be embedded into a web page."+"\nIt runs inside the web browser and works at client side.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: An applet is a Java program that can be embedded into a web page."+" It runs inside the web browser and works at client side.");
	wrong++;	 
	}
	
	System.out.println("\nQ.3 Which of the following is true about Assembly Language?\r\n"
			+ "\n1)It is an object oriented programming language\r\n"
			+ "2) It is a high-level programming language\r\n"
			+ "3) It is a low-level programming language\r\n"
			+ "4) It is a language for assembling computers");

	answer=sc.nextInt();
	if(answer==3) {
	System.out.println("\nCorrect Answer");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");		 
	wrong++;	 
	}
	
	System.out.println("\nQ.4: ER Diagram in DBMS is a graphical method used to represent -\r\n"
			+ "\n1) Primary key and candidate key\r\n"
			+ "2) Entity class and their relationships\r\n"
			+ "3) Objects and methods with functions\r\n"
			+ "4) Entity class and relationship to foreign key only");
	
	answer=sc.nextInt();
	if(answer==2) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: An ER diagram (Entity Relationship Diagram) shows the relationship among entity sets.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: An ER diagram (Entity Relationship Diagram) shows the relationship among entity sets.");
	wrong++;	 
	}
	
	System.out.println("\nQ.5 The set of instructions which tell a computer what to do is called -\r\n"
			+ "\n1) Matter\r\n"
			+ "2) Instructor\r\n"
			+ "3) Compiler\r\n"
			+ "4) Program");
	
	answer=sc.nextInt();
	if(answer==4) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: Software, instructions that tell a computer what to do."+"\nSoftware comprises the entire set of programmes, procedures,"+"\nand routines associated with the operation of a computer system.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: Software, instructions that tell a computer what to do."+"\nSoftware comprises the entire set of programmes, procedures,"+"\nand routines associated with the operation of a computer system.");
	wrong++;	 
	}
	
	
	System.out.println("\nQ.6 What is the other name for addictive manufacturing?\r\n"
			+ "\n1) 3-D printing\r\n"
			+ "2) 2-D printing\r\n"
			+ "3) CPU assembly\r\n"
			+ "4) Memory management");
	
	answer=sc.nextInt();
	if(answer==1) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: Additive Manufacturing is frequently used as a synonym of 3D printing."+"\n Additive technologies are defined as the process of joining materials to make 3D objects.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: Additive Manufacturing is frequently used as a synonym of 3D printing."+"\n Additive technologies are defined as the process of joining materials to make 3D objects.");
	wrong++;	 
	}
	
	System.out.println("\nQ.7 A(n) ...... is an object embedded in a web page or email, which unobtrusively (usually invisibly) allows checking that a user has accessed the content.\r\n"
			+ "\n1) email\r\n"
			+ "2) virus\r\n"
			+ "3) web beacon\r\n"
			+ "4) spam");
	
	answer=sc.nextInt();
	if(answer==3) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: A web beacon is a hidden, transparent, but nonetheless 'graphic' image"+"\nthat finds its way onto computer. It monitors the activity of "+"\nusers at a website for the purpose of web analytics.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: A web beacon is a hidden, transparent, but nonetheless 'graphic' image"+"\nthat finds its way onto computer. It monitors the activity of "+"\nusers at a website for the purpose of web analytics.");
	wrong++;	 
	}
	
	System.out.println("\nQ.8 Which among the following terms is used for unauthorized copying of a software to be used for personal gain instead of personal backup?\r\n"
			+ "\n1) program thievery\r\n"
			+ "2) data snatching\r\n"
			+ "3) software piracy\r\n"
			+ "4) program looting");
	
	
	answer=sc.nextInt();
	if(answer==2) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: The software piracy refers to several practices"+"\nwhich involve the unauthorized copying of computer software."+"\n Copyright infringement of this kind is extremely common.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: The software piracy refers to several practices"+"\nwhich involve the unauthorized copying of computer software."+"\n Copyright infringement of this kind is extremely common.");
	wrong++;	 
	}
	
	System.out.println("\nQ.9 Which of the following is not an in-built software application found in MS Windows?\r\n"
			+ "\n1) Paint\r\n"
			+ "2) CD Player\r\n"
			+ "3) Disk Defragmenter\r\n"
			+ "4) Volume Control");
	
	answer=sc.nextInt();
	if(answer==2) {
	System.out.println("\nCorrect Answer");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");		 
	wrong++;	 
	}
	
	System.out.println("\nQ.10 What is that computer program called which translates one program instruction at a time into machine language?\r\n"
			+ "1) Compiler\r\n"
			+ "2) CPU\r\n"
			+ "3) ROM\r\n"
			+ "4) Interpreter");
	
	

	answer=sc.nextInt();
	if(answer==4) {
	System.out.println("\nCorrect Answer");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");		 
	wrong++;	 
	}
	}
	public void resultComputer() {

		System.out.println("\nTOTAL CORRECT ANSWER ARE: "+right+"\n\nTOTAL WRONG ANSWER ARE: "+wrong);	
		}
}