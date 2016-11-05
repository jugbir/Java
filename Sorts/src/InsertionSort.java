// Insertion Sort has O(n^2) - worst case runtime complexity
// O(1) space complexity

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		
		int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
		System.out.println("Original Array: " + Arrays.toString(inputArray));
		
		is.insertionSort(inputArray);
		System.out.println("Sorted Array: " + Arrays.toString(inputArray));
	}
	
	private void insertionSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			for(int j=i; j>0; j--) {
				if(array[j] < array[j-1]) {
					swap(array, j-1, j);
				} else {
					break;
				}
			}
		}
	}
	
	private void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
}
