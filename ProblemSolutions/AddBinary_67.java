
public class AddBinary_67 {
	/*
	 * long numA = 0; // = Integer.parseInt(a); long numB = 0; // =
	 * Integer.parseInt(b);
	 * 
	 * //int x =
	 * 
	 * for (int i = a.length() - 1; i >= 0; i--) { if (a.charAt(i) == '1') { numA =
	 * (long) (numA + Math.pow(2, a.length() - 1 - i)); System.out.println("=> " +
	 * numA); }
	 * 
	 * } System.out.println("=================== ");
	 * 
	 * for (int i = b.length() - 1; i >= 0; i--) { if (b.charAt(i) == '1') { numB =
	 * (long) (numB + Math.pow(2, b.length() - 1 - i)); System.out.println("=> " +
	 * numB); }
	 * 
	 * }
	 * 
	 * // System.out.println(numA + " " + numB);
	 * 
	 * numA += numB;
	 * 
	 * a = Long.toBinaryString(numA);// Integer.toBinaryString(numA);
	 * 
	 * System.out.println("Ans is "); return a;
	 */

	public String addBinary(String a, String b) {

		int isABigger = a.length() > b.length() ? 1 : 0;
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int j = 0;
		if (isABigger == 1) { // compute b
			for (int i = b.length() - 1; i >= 0; i--) {
				if (a.charAt(a.length() - 1 - j) == '1' && b.charAt(i) == '1') { // 1 & 1
					if (carry == 0) {
						sb.append('0');
						carry++;
					} else {
						sb.append('1');
					}
				} else if (a.charAt(a.length() - 1 - j) == '1' && b.charAt(i) == '0') { // 1 & 0
					if (carry == 0) {
						sb.append('1');
					} else {
						sb.append('0');
						//carry--;
					}
				} else if (a.charAt(a.length() - 1 - j) == '0' && b.charAt(i) == '1') { // 0 & 1
					if (carry == 0) {
						sb.append('1');
					} else {
						sb.append('0');
						//carry--;
					}
				} else { // 0 & 0
					if (carry == 0) {
						sb.append('0');
					} else {
						sb.append('1');
						carry--;
					}
				}
				j++;
			}
			
			//compute the rest a
			for(int i = a.length()-1 - j; i>=0 ; i--) {
				if(carry == 0) {
					sb.append(a.charAt(i));
				}else {
					if(a.charAt(i) == '0') {
						sb.append('1');
						carry--;
					}else if(a.charAt(i) == '1') {
						sb.append('0');
					}
				}
			}
			
			if(carry != 0)
				sb.append('1');
			
			
		} else { // compute a
			for (int i = a.length() - 1; i >= 0; i--) {
				if (b.charAt(b.length()-1-j) == '1' && a.charAt(i) == '1') { // 1 & 1
					if (carry == 0) {
						sb.append('0');
						carry++;
					} else {
						sb.append('1');
					}
				} else if (b.charAt(b.length()-1-j) == '1' && a.charAt(i) == '0') { // 1 & 0
					if (carry == 0) {
						sb.append('1');
					} else {
						sb.append('0');
						//carry--;
					}
				} else if (b.charAt(b.length()-1-j) == '0' && a.charAt(i) == '1') { // 0 & 1
					if (carry == 0) {
						sb.append('1');
					} else {
						sb.append('0');
						//carry--;
					}
				} else { // 0 & 0
					if (carry == 0) {
						sb.append('0');
					} else {
						sb.append('1');
						carry--;
					}
				}
				j++;
			}
			
			//compute the rest b
			for(int i = b.length()-1 - j; i>=0 ; i--) {
				if(carry == 0) {
					sb.append(b.charAt(i));
				}else {
					if(b.charAt(i) == '0') {
						sb.append('1');
						carry--;
					}else if(b.charAt(i) == '1') {
						sb.append('0');
					}
				}
			}
			
			if(carry != 0)
				sb.append('1');
		}
		
		StringBuilder res = new StringBuilder();
		
		for(int i =sb.length()-1 ; i>=0; i--) {
			res.append(sb.charAt(i));
		}

		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
//		
//		"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
//		"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"

//		String a = "1100001101";
//		String b = "1011110011";
		System.out.println(new AddBinary_67().addBinary(a, b));
	}

}
