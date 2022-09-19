
public class BinarySearch {

	// Returns index of x if it is present in arr[l..
	// , else return -1
	int binarySearch(int arr[], int startIndex, int endIndex, int findNumber) {
		if (endIndex < startIndex)
			return -1;
		int mid = (endIndex + startIndex) / 2;

		// If the element is present at the
		// middle itself
		if (arr[mid] == findNumber)
			return mid;

		// If element is smaller than mid, then
		// it can only be present in left subarray
		if (arr[mid] > findNumber)
			return binarySearch(arr, startIndex, mid - 1, findNumber);

		// Else the element can only be present
		// in right subarray
		return binarySearch(arr, mid + 1, endIndex, findNumber);

		// We reach here when element is not present
		// in array

	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result;
		if (arr == null || arr.length == 0)
			result = -1;
		else
			result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
