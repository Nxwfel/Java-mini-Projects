import java.util.Scanner;
import java.io.*;
public class Main{
	static void Display(int matrix[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	static void Cubic_Value(int matrix[][],int matrix2[][]) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				matrix2[i][j] = matrix[i][j]* matrix[i][j] * matrix[i][j]; 
				}
	}
		
	}
	public static void main(String[] args){
		Scanner Int = new Scanner(System.in);
		int[][] matrix1= new int[3][3];
		int[][] matrix2= new int[3][3];
		System.out.println("Enter the values of the first matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix1[i][j]=Int.nextInt();
			}
			System.out.println(" ");
		}
		System.out.println("the values of the first matrix");
		Display(matrix1);
		Cubic_Value(matrix1,matrix2);
		System.out.println("the cubic value of the first matrix");
		Display(matrix2);
	}
}