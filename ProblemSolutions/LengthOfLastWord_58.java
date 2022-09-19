
public class LengthOfLastWord_58 {

	
	
	public int lengthOfLastWord(String s) {
		int count = 0;
		for(int i = s.length()-1 ; i >=0 ; i--) {
			if(s.charAt(i) == ' ' && count == 0) {
				continue;
			}else if(s.charAt(i) == ' ' && count != 0) {
				break;
			}else {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "luffy is still joyboy";
		
		System.out.println(new LengthOfLastWord_58().lengthOfLastWord(s));

	}

}
