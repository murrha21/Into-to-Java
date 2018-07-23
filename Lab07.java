/*Declare an array reference variable arrayInt for an array of integers. Create the array of size 100, and assign it to arrayInt.

Write a method to populate the array with Random numbers between 1 to 25. Signature of the method is: populateArray( int[] ) which 
returns nothing. Call this method from main with  arrayInt-->  populateArray(arrayInt).

Write a method to print an array. Signature of the method is: printArray( int[] ) which returns nothing. Print maximum of ten(10) 
numbers on a line. Call this method from main with arrayInt--> printArray(arrayInt). 

Write a method that finds the average of the array elements. Signature of the method is: findAverage( int[] ) which returns the average 
to the calling program. Call this method from main with arrayInt--> findAverage(arrayInt). 
 * 
 * 
 * 
 */

public class Lab07 {

	public static void main(String[] args) {
		int[] arrayInt = new int[100];
		
		populateArray(arrayInt);
		printArray(arrayInt);
		findAverage(arrayInt);
	}

	
	public static void populateArray(int[] arrayInt) {
		for (int i= 0; i < arrayInt.length; i++) {
			arrayInt[i] = (int) (Math.random() * 25 + 1);
		}
	}
	
	public static void printArray(int[] arrayInt) {
		for(int i= 0; i < 10 ; i++) {
			System.out.print(arrayInt[i] + "");
			System.out.println();
		}
	}
	
	public static void findAverage (int[] arrayInt) {
		int sum = 0;
		for (int i = 0; i < arrayInt.length; i++)
			sum = sum + arrayInt[i];
		int average = sum / arrayInt.length;
		System.out.println(average);
			
	}
}

/*Sample run:
7
15
25
3
11
20
1
1
22
22
13
*/