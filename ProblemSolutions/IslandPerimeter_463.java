
public class IslandPerimeter_463 {

	int[] fx = { +1, -1, +0, -0 };
	int[] fy = { +0, -0, +1, -1 };

	static int X;
	static int Y;

	private static boolean valid(int x, int y) {
		if (x >= 0 && x <= X && y >= 0 && y <= Y)
			return true;
		else
			return false;
	}

	public int islandPerimeter(int[][] grid) {
		X = grid.length-1;
		Y = grid[0].length-1;

		int ans = 0;

		for (int i = 0; i <= X; i++) {
			for (int j = 0; j <= Y; j++) {

				if (grid[i][j] == 1) {
					//System.out.println("calculating for " + i + " " + j);
					ans += 4;
					for (int k = 0; k < 4; k++) {
						int x = fx[k] + i;
						int y = fy[k] + j;
						//System.out.println("checking x , y is " + x + " " + y);
						if (valid(x, y) ) {
							if(grid[x][y] == 1) {
								//System.out.println("valid x , y is " + x + " " + y);
								ans--;
							}
							
						}
					}
					//System.out.println(ans);
				}

			}
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(new IslandPerimeter_463().islandPerimeter(grid));
	}

}
