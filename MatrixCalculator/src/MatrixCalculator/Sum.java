package MatrixCalculator;
import java.util.*;
public class Sum {

Scanner sc=new Scanner(System.in);


public void SumMatrix(int rows ,int columns) {

int matrix1[][]=new int[rows][columns];
int matrix2[][]=new int[rows][columns];
int matrix3[][]=new int[rows][columns];	

System.out.println("\nEnter the elements of Matrix 1: ");
for(int i=0; i<rows; i++) {
	for(int j=0; j<columns; j++) {
matrix1[i][j]=sc.nextInt();
}
System.out.println();	
}


System.out.println("\nEnter the elements of Matrix 2: ");
for(int i=0; i<rows; i++) {
	for(int j=0; j<columns; j++) {
matrix2[i][j]=sc.nextInt();
}
System.out.println();	
}

for(int i=0; i<rows; i++) {
	for(int j=0; j<columns; j++) {
matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
}
System.out.println();	
}

System.out.println("\nSum of the matrix is :\n");

for(int[] r: matrix3) {
	for(int c: r) {
System.out.print(c+" ");	
}
System.out.println();
}

}
}
