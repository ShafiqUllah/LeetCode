import java.util.Arrays;
import java.util.Collections;

public class PalindromNumber_9 {

	public boolean isPalindrom(int x) {
//		if (x < 0)
//			return false;
//		int num = x;
//		int count = 0;
//		while (num > 9) {
//			num = num / 10;
//			count++;
//		}
//		count++;
//
//		num = x;
//
//		int[] arr = new int[count];
//
//		count = 0;
//		while (num > 9) {
//			arr[count++] = num % 10;
//			num = num / 10;
//		}
//
//		arr[count++] = num % 10;
//
//		//System.out.println(Arrays.toString(arr));
//		//System.out.println(count);
//
//		int[] firstPart = new int[count / 2];
//		int[] secondPart = new int[count / 2];
//
//		//System.arraycopy(arr, 0, secondPart, 0, count / 2);
//
//		if (count % 2 == 0) {
//			System.arraycopy(arr, count / 2, firstPart, 0, count / 2);
//		} else {
//			System.arraycopy(arr, count / 2 + 1, firstPart, 0, count / 2);
//		}
//
//		int[] newArray = new int[firstPart.length];
//
//		for (int i = 0; i < firstPart.length; i++) {
//			newArray[firstPart.length - 1 - i] = firstPart[i];
//		}
//		
//		firstPart = newArray;
//
//		//System.out.println(Arrays.toString(firstPart));
//		//System.out.println(Arrays.toString(secondPart));
//		
//		for (int i = 0; i < firstPart.length; i++) {
//			if(firstPart[i] != secondPart[i])
//				return false;
//		}

		String num = x + "";
		for (int i = 0; i < num.length() / 2; i++) {
			// if
			if (num.charAt(i) != num.charAt((num.length() -1 - i))) {
				return false;
			}

			// }
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromNumber_9 obj = new PalindromNumber_9();
		boolean result = obj.isPalindrom(12111121);

		if (result)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
