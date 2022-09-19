
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = { 1, 1, 2, 2 };
		System.out.println(new ValidParentheses_20().removeDuplicates(sample));
	}

	public int removeDuplicates(int[] nums) {
		int[] num_2 = new int[nums.length];
		int count = 0;
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int match = nums[count];
		num_2[count] = match;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == match)
				continue;
			else {
				match = nums[i];
				count++;
				num_2[count] = match;
			}
		}

		int[] num3 = new int[count + 1];

		for (int i = 0; i <= count; i++) {
			num3[i] = num_2[i];
		}

		nums = num3;

		System.out.println(Arrays.toString(nums));

		return count + 1;
	}

}
