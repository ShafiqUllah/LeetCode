
public class Sqrt_69 {

	public int binary(int[] arr, int start, int end, int x, int closeValue, int closeValueIndex) {

		if (end >= start) {
			int mid = start + (end - start) / 2;
			
			long sqValue = arr[mid] * arr[mid];

			if (sqValue == x) {
				//return arr[mid];
				return mid;
			}

			if (sqValue > x) {
				//closeValue = ((sqValue - x) < closeValue) ? (sqValue - x) : closeValue;
				return binary(arr, start, mid - 1, x, closeValue, closeValueIndex);
			} else {
				closeValue = (int) (((x-sqValue ) < closeValue) ? (x-sqValue ) : closeValue);
				return binary(arr, mid + 1, end, x, closeValue, mid);
			}
		}

		return closeValueIndex;
	}

	public int mySqrt(int x) {
		
		if(x <= 1)
			return x;

		int[] arr = new int[x / 2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		return arr[binary(arr, 0, arr.length-1, x, x+1, 0)];

		// return (int) Math.sqrt(x);
	}
	
	public int balUseKoraJabeNa(int x) {
		 return (int) Math.sqrt(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sample = 2147395599;
		System.out.println(new Sqrt_69().mySqrt(sample));
		System.out.println(new Sqrt_69().balUseKoraJabeNa(sample));

	}

}
