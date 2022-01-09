package MatrixCalculator;
import java.util.Scanner;
public class Multiply {

	Scanner sc=new Scanner(System.in);

	public void MulMatrix(int rows1 ,int columns1,int rows2 ,int columns2) {
    if(rows1!=columns2) {
    System.out.println("\nRows of 1 matrix should be equal to columns of 2 matrix");	
    }
    else {
	int matrix1[][]=new int[rows1][columns1];
	int matrix2[][]=new int[rows2][columns2];
	int matrix3[][]=new int[rows1][columns2];	

	System.out.println("\nEnter the elements of Matrix 1: ");
	for(int i=0; i<rows1; i++) {
		for(int j=0; j<columns1; j++) {
	matrix1[i][j]=sc.nextInt();
	}
	System.out.println();	
	}


	System.out.println("\nEnter the elements of Matrix 2: ");
	for(int i=0; i<rows2; i++) {
		for(int j=0; j<columns2; j++) {
	matrix2[i][j]=sc.nextInt();
	}
	System.out.println();	
	}

	for(int i=0; i<rows1; i++) {
		for(int j=0; j<columns2; j++) {
	matrix3[i][j]=0;		
	for(int k=0; k<rows1; k++) {
		
	matrix3[i][j]+=matrix1[i][j]*matrix2[i][j];
	}
	}
	System.out.println();
	}

	System.out.println("\nMultiply of the matrix is :\n");

	for(int[] r: matrix3) {
		for(int c: r) {
	System.out.print(c+" ");	
	}
	System.out.println("\n");
	}
    }
	}
}
