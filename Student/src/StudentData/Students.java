package StudentData;

import java.util.Scanner;

public class Students {
Scanner sc=new Scanner(System.in);	

/* The major advantage of encapsulation in Java is data hiding.
Using encapsulation we can allow the programmer to decide on the
access to data and methods operating on that data. 
For example, if we want a particular piece of data to be 
inaccessible to anyone outside the class, then we make that data private.
 */

    private String name="";	      // Accessible only within the class.
	private String grade;
	private String rollNo;
	private float percentage;
 
	
    public Students() {
    
    // We used " this " keyword to access the private data in constructor.
    	
	System.out.println("\nEnter the Student Name");
	this.name=sc.nextLine();
    
	System.out.println("\nEnter the Student Grade");
	this.grade=sc.nextLine();
	
// encapsulation deals with grouping of related data into a single unit to
// ensure better management and security of data.
 
	System.out.println("\nEnter the Student Roll Number");
	this.rollNo=sc.nextLine();

	System.out.println("\nEnter the Student Percentage");
	this.percentage=sc.nextFloat();

	}

	public void Status() {

	if(percentage>=33) {
	System.out.println("\nStatus: PASS ");
	}
	else {
	System.out.println("\nStatus: FAIL ");	
	}
	}


	public void remark() {

	if(percentage>90 && percentage<=100 ) {
	System.out.println("\nVery Good , Keep it up" );	
	}
	else if(percentage>80 && percentage<=90 ){
	System.out.println( "\nGood , Keep it up can do more" );	
	}
	else if(percentage>70 && percentage<=80 ){
	System.out.println("\nNice , Average performance,keep Hardworking" );	
	}

	else if(percentage>60 && percentage<=70 ){
	System.out.println("\nNot Bad , Average performance" );	
	}

	else if(percentage>50 && percentage<=60 ){
	System.out.println("\nBad , Need more attention" );	
	}

	else if(percentage>40 && percentage<=50 ){
	System.out.println("\nVery Bad , Need more attention and hardworking" );	
	}

	else if(percentage>33 && percentage<=40 ){
	System.out.println("\nVery Bad , poor performance" );
	}

	else if(percentage<33 ){
	System.out.println("\nWorst , Poor Performance" );	
	}
	}
	public void reportCard() {
	System.out.println("\nName of the student: "+name+"\nGrade of the Student: "+grade+"\nRoll Number :  "+rollNo+"\nPercentage of the Student: "+percentage);
	Status();
	remark();
	}

	}
	


