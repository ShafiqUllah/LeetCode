
public class SearchInsertPosition_35 {

	public int binarySearch(int[] arr, int startInx, int endInx, int findNum) {
		if (endInx >= startInx) {
			int mid = startInx + (endInx - startInx) / 2;

			if (arr[mid] == findNum)
				return mid;

			if (arr[mid] > findNum)
				return binarySearch(arr, startInx, mid - 1, findNum);
			else
				return binarySearch(arr, mid + 1, endInx, findNum);
		}

		return startInx;
	}

	public int searchInsert(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length-1, target);
	}

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		int target = 1;
		
		
		System.out.println(new SearchInsertPosition_35().searchInsert(nums, target));;

	}
}