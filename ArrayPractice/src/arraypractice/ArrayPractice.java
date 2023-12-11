package arraypractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void printArray(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			String item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Index:0  1 2 3 4
		// Array:[0,5,3,2,1] --> length 5

		// index: 0        1      2
		// Array:["bob","sally","max"] --> length 3

		int[] intArray1;
		int[] intArray2 = new int[4];
		printArray(intArray2);
		int[] intArray3 = { 5, 2, 9, 1, 3 };

		String[] shoppingList = { "bananas", "apple", "pears" };

		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;

		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out.println();
		// Custom print
		printArray(intArray2);
		printArray(intArray3);
		
		System.out.println(intArray2[3]);
		
		Arrays.sort(intArray3);
		printArray(intArray3);
		System.out.println();
		
		printArray(shoppingList);
		
		//Special for loop: foreach
		for (String s : shoppingList) {
			System.out.println(s);
		}
	}

}
