package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arrayI = {"Zero", "One", "Two", "Three", "Four"};
		//2. print the third element in the array
		System.out.println(arrayI[2]);
		//3. set the third element to a different value
		arrayI[2] = "Five";
		//4. print the third element again
		System.out.println(arrayI[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arrayI.length; i++) {
			System.out.println(arrayI[i]);
		}
		//6. make an array of 50 integers
		int[] arrayII = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for (int i = 0; i < arrayII.length; i++) {
			arrayII[i] = random.nextInt();
		}
		//8. with out printing the entire array, print only the smallest number in the array
		int smallest = arrayII[0];
		for (int i = 1; i < arrayII.length; i++) {
			if (arrayII[i] < smallest) {
				smallest = arrayII[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < arrayII.length; i++) {
			System.out.println(arrayII[i]);
		}
		//10. print the largest number in the array.
		int largest = arrayII[0];
		for (int i = 1; i < arrayII.length; i++) {
			if (arrayII[i] > largest) {
				largest = arrayII[i];
			}
		}
		System.out.println(largest);
	}
}
