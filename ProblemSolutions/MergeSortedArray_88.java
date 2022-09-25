import java.util.Arrays;

public class MergeSortedArray_88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
		
		//System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] nums1 = {1,2,3,0,0,0};
		 int m = 3;
		 int[] nums2 = {2,5,6};
		 int n = 3;
		
		MergeSortedArray_88 obj = new MergeSortedArray_88();
		
		obj.merge(nums1, m, nums2, n);
	}

}
