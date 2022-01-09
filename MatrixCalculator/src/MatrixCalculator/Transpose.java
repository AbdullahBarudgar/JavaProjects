package MatrixCalculator;
import java.util.*;
public class Transpose {

	Scanner sc=new Scanner(System.in);


	public void TransposeMatrix(int rows ,int columns) {

	int matrix1[][]=new int[rows][columns];
	int matrix2[][]=new int[rows][columns];

	System.out.println("\nEnter the elements of Matrix : ");
	for(int i=0; i<rows; i++) {
		for(int j=0; j<columns; j++) {
	matrix1[i][j]=sc.nextInt();
	}
	System.out.println();	
	}


	for(int i=0; i<rows; i++) {
		for(int j=0; j<columns; j++) {
	matrix2[i][j]=matrix1[j][i];
	}
	System.out.println();	
	}



	System.out.println("\nTranspose of the matrix is :\n");

	for(int[] r: matrix2) {
		for(int c: r) {
	System.out.print(c +" ");	
	}
	System.out.println("\n");
	}
	
	}
}
