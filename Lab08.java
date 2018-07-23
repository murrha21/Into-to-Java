/*
 * Sum elements column by column) Write a method that returns the sum of all the elements in a 
 * specified column in a matrix using the following header: public static double sumColumn( double[][] m, int columnIndex )

Write a test program that reads a 3-by-4 matrix and displays the sum of each column. Here is a sample run:

Enter a 3-by-4 matrix row by row:
1.5   2   3   4
5.5   6   7   8
9.5   1   3   1

Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0
 */

import java.util.Scanner;

public class Lab08 {
	public static void main(String[] args) {
		double [][] m = getArray();
		sumColumn(m,0);
		}
	  
	public static double[][] getArray(){
		Scanner input = new Scanner(System.in);
		double [][] m = new double [3][4];
		System.out.println("Enter " + m.length + "-by-" + m[0].length + " matrix row by row: ");
		for(int row = 0; row < m.length; row++) 
			for (int column = 0; column < m[row].length; column++) 
				m[row][column] = input.nextDouble();
		return m;
			}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		for (columnIndex = 0; columnIndex < m[0].length; columnIndex++) {
			double total = 0;
			for (int row = 0; row < m.length; row ++)
				total += m[row][columnIndex];
			System.out.println("Sum of the elements at column " + columnIndex + " is " + total);
		}
		return columnIndex;
	} 
}

/*Sample run: 
Enter 3-by-4 matrix row by row: 
1.0 2 5 6
2.5 6 9 8
3.6 9 3 5
Sum of the elements at column 0 is 7.1
Sum of the elements at column 1 is 17.0
Sum of the elements at column 2 is 17.0
Sum of the elements at column 3 is 19.0
*/