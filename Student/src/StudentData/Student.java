package StudentData;
import java.util.*;
public class Student {




	private String name="";	
	private int grade;
	private int rollNo;
	private float percentage;

	public Student() {
	Scanner sc=new Scanner(System.in);	

	System.out.println("\nEnter the Student Name");
	this.name=sc.nextLine();

	System.out.println("Enter the Student Grade");
	this.grade=sc.nextInt();

	System.out.println("Enter the Student Roll Number");
	this.rollNo=sc.nextInt();

	System.out.println("Enter the Student Percentage");
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
	

