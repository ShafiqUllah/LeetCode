import java.util.Arrays;

/**
 * 
 */

/**
 * @author User // long sum = 0; // int multiplier = 0; // for(int i =
 *         digits.length-1; i >= 0 ;--i) { // sum += digits[i] * Math.pow(10,
 *         multiplier++); // //System.out.println("SUM is "+ sum); // } // //
 *         sum++; // // String temp = sum +""; // //System.out.println("Result
 *         str " + temp); // int[] result = new int[temp.length()]; // //
 *         for(int i = 0 ; i < temp.length() ; i++) { // result[i] = (int)
 *         temp.charAt(i) - 48; // } // // return result;
 *
 */
public class PlusOne_66 {

	public int[] plusOne(int[] digits) {
		int dig = digits[digits.length - 1];
		//System.out.println("Digit " + dig);

		if (dig < 9) {

			digits[digits.length - 1] = dig + 1;
			return digits;
		} else {
			int index = digits.length - 1;
			digits[index] = 0;
			index--;

			while (index >= 0) {

				dig = digits[index];
				if (dig < 9) {
					digits[index] = ++dig;
					break;
				} else {
					digits[index] = 0;
				}
				index--;
			}
			
			if(digits[0] == 0) {
				int[] temp = new int[digits.length + 1];
				temp[0] = 1;
				System.arraycopy(digits, 1, temp, 1, digits.length-1);
				digits = temp;
			}
			
			return digits;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits = { 9, 9, 9 };
		System.out.println(Arrays.toString(new PlusOne_66().plusOne(digits)));

	}

}
