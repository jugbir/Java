import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		
		int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
		Arrays.sort(inputArray);
		System.out.println("Original Array: " + Arrays.toString(inputArray));
		
		int value = 77;
		int index = bs.binarySearch(inputArray, value);
		System.out.println("The value " + value + " is located at index " + index);
	}
	
	private int binarySearch(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(array[mid] < value) {
				low = mid + 1;
			} else if(array[mid] > value) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
