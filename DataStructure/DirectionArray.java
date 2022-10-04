
public class DirectionArray {

	// this is for four side (up down left right), you can make it eight side or as many pairs as you want
	int[] fx = { +1, -1, +0, -0 };
	int[] fy = { +0, -0, +1, -1 };

	static int X;
	static int Y;

	private static boolean valid(int x, int y) {
		if (x >= 0 && x < X && y >= 0 && y < Y)
			return true;
		else
			return false;
	}

	public int solveThisGrid(int[][] grid) {
		X = grid.length;
		Y = grid[0].length;

		int ans = 0;

		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {

				//if (grid[i][j] == 1) { Here you put your identifying checking which point you want to start work

					for (int k = 0; k < 4; k++) { // look all four (up down left right), 
						int x = fx[k] + i;
						int y = fy[k] + j;

						if (valid(x, y)) {
							// this block is valid, you can work here 

						}
					}

				//}

			}
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
