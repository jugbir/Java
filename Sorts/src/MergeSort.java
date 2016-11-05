// Merge Sort has O(n log n) worst case runtime complexity
// O(n) space complexity

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		
		int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
		System.out.println("Original Array: " + Arrays.toString(inputArray));
		
		ms.mergeSort(inputArray);
		System.out.println("Sorted Array: " + Arrays.toString(inputArray));
	}
	
	private void mergeSort(int[] array) {
		sort(array, 0, array.length - 1);
	}
	
	private void sort(int[] array, int low, int high) {
		if(low < high) {
			int mid = (high + low) / 2;
			sort(array, low, mid);
			sort(array, mid+1, high);
			merge(array, low, mid, high);
		}
	}
	
	private void merge(int[] array, int low, int mid, int high) {
		int[] tempArray = new int[high - low + 1];
		int leftIndex = low;
		int rightIndex = mid + 1;
		int tempIndex = 0;
		
		while(leftIndex <= mid && rightIndex <= high) {
			if(array[leftIndex] <= array[rightIndex]) {
				tempArray[tempIndex++] = array[leftIndex++];
			} else {
				tempArray[tempIndex++] = array[rightIndex++];
			}
		}
		
		while(leftIndex <= mid) {
			tempArray[tempIndex++] = array[leftIndex++];
		}
		
		while(rightIndex <= high) {
			tempArray[tempIndex++] = array[rightIndex++];
		}
		
		for(int i=0; i<tempArray.length; i++) {
			array[low + i] = tempArray[i];
		}
	}
}
