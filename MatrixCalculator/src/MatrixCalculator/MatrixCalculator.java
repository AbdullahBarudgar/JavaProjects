package MatrixCalculator;
import java.util.*;
public class MatrixCalculator {
	
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);

int row1,column1 , row2 ,column2;
char ch;

System.out.println("--------------===== MATRIX CALCULATOR ========-----------------\n");

do {
System.out.println("\n PLEASE SELECT ONE OF THE OPERATION BELOW : \n");
System.out.println("1: SUM \n2: SUBSTRACT \n3: MULTIPLY \n4: TRANSPOSE \n5: IDENTITY MATRIX\n");

int button=sc.nextInt();

switch(button) {

case 1: 

Sum sum=new Sum();

System.out.println("\nEnter the number of rows ");
row1=sc.nextInt();
System.out.println("\nEnter the number of columns ");
column1=sc.nextInt();

sum.SumMatrix(row1,column1);

break;

case 2:
	
Substraction subs=new Substraction();

System.out.println("\nEnter the number of rows ");
row1=sc.nextInt();
System.out.println("\nEnter the number of columns ");
column1=sc.nextInt();
subs.SubMatrix(row1, column1);

break;


case 3:

Multiply mul=new Multiply();

System.out.println("\nEnter the number of rows in 1 matrix ");
row1=sc.nextInt();
System.out.println("\nEnter the number of columns in 1 matrix ");
column1=sc.nextInt();

System.out.println("\nEnter the number of rows in 2 matrix ");
row2=sc.nextInt();
System.out.println("\nEnter the number of columns in 2 matrix ");
column2=sc.nextInt();

mul.MulMatrix(row1,column1,row2,column2);

break;

case 4:
	
Transpose trans=new Transpose();	

System.out.println("\nEnter the number of rows ");
row1=sc.nextInt();
System.out.println("\nEnter the number of columns ");
column1=sc.nextInt();

trans.TransposeMatrix(row1,column1);

break;


case 5:
	
IdentityMatrixs im=new IdentityMatrixs();

System.out.println("\nEnter the number of rows ");
row1=sc.nextInt();
System.out.println("\nEnter the number of columns ");
column1=sc.nextInt();

im.Identity(row1,column1);

break;

default : {

System.out.println("\nEnter the correct operation given above\n");	
}

}
System.out.println("\nDo you want continue type 'Y' OR 'N'\n"); 
ch=sc.next().charAt(0);
}while(ch=='Y' || ch=='y');

}
}
