package removedupArray;

import java.util.Arrays;

public class RemoveDuplicatesJavaExample {
	static void removeDuplicates(int[] arrayWithDuplicates) {
		System.out.println("Array With Duplicates : ");

		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.print(arrayWithDuplicates[i] + "\t");
		}

		// Assuming all elements in input array are unique

		int length = arrayWithDuplicates.length;

		// Comparing each element with all other elements

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				// If any two elements are found equal

				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {

					length--;

					// Decrementing j

					j--;
				}
			}
		}

		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates,
				length);

		System.out.println("Array Without Duplicates : ");

		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}

	}

	public static void main(String[] args) {
		// removeDuplicates(new int[] {4, 3, 2, 4, 9, 2,11,11,11});

		// removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});

		removeDuplicates(new int[] { 15, 21, 11, 21, 51, 21, 11, 11 });

		// removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	}
}