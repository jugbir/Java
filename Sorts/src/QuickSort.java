// Quick Sort has a O(n^2) - worst case runtime complexity
// O(n log n) - average case runtime complexity
// O(1) - space complexity

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
		System.out.println("Original Array: " + Arrays.toString(inputArray));
		
		qs.quickSort(inputArray);
		System.out.println("Sorted Array: " + Arrays.toString(inputArray));
	}
	
	private void quickSort(int[] array) {
		partition(array, 0, array.length-1);
	}
	
	private void partition(int[] array, int low, int high) {
		if(low < high) {
			int pivot = array[high];
			int pIndex = low;
			
			for(int i=low; i<high; i++) {
				if(array[i] <= pivot) {
					swap(array, pIndex++, i);
				}
			}
			
			swap(array, pIndex, high);
			partition(array, low, pIndex-1);
			partition(array, pIndex+1, high);
		}
	}
	
	private void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
}
