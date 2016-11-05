// Selection Sort has O(n^2) - worst case runtime complexity
// O(1) space complexity

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		
		int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
		System.out.println("Original Array: " + Arrays.toString(inputArray));
		
		ss.selectionSort(inputArray);
		System.out.println("Sorted Array: " + Arrays.toString(inputArray));
	}
	
	private void selectionSort(int[] array) {
		for(int i=0; i<array.length; i++) {
			int minValue = array[i];
			int index = i;
			
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < minValue) {
					minValue = array[j];
					index = j;
				}
			}
			
			swap(array, i, index);
		}
	}
	
	private void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
}
