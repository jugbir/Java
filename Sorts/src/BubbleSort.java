// Bubble Sort has O(n^2) - worst case runtime complexity
// O(1) - space complexity

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
		System.out.println("Original Array: " + Arrays.toString(inputArray));
		
		bs.bubbleSort(inputArray);
		System.out.println("Sorted Array: " + Arrays.toString(inputArray));
	}
	
	private void bubbleSort(int[] array) {
		int numberOfSwaps = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=1; j<array.length - i; j++) {
				if(array[j-1] > array[j]) {
					swap(array, j-1, j);
					numberOfSwaps++;
				}
			}
			
			if(numberOfSwaps == 0) {
				break;
			}
			
			numberOfSwaps = 0;
		}
	}
	
	private void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
}
