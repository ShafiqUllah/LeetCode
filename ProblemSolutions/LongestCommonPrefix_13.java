import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix_13 {

	public String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs, Comparator.comparingInt(String::length));
		int count = 0;

		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs[0].length(); j++) {
				count = j;
				if( strs[0].charAt(j) != strs[i].charAt(j) ) {
					
					break;
				}
			}
		}
		
		if(count ==0) {
			if(strs.length ==1)
				return strs[0];
			else
				return "";
		}

		
		return strs[0].substring(0, count+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = { "flower", "flow", "floight" };
		String[] data1 = { "dog", "racecar", "car" };
		String[] data3 = { "a" };
		String[] data5 = { "ab", "bs", "cas" };
		String[] data4 = { "" };
		String[] data6 = { "flower", "flower", "flower" };

		LongestCommonPrefix_13 obj = new LongestCommonPrefix_13();

		System.out.println("Ans is " + obj.longestCommonPrefix(data));

	}

}
