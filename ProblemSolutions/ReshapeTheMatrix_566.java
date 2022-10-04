import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReshapeTheMatrix_566 {

	public int[][] matrixReshape(int[][] mat, int r, int c) {
		
		if(mat.length * mat[0].length != r * c)
			return mat;
		
		int[][] ans = new int[r][c];
		LinkedList< Integer> temp = new LinkedList<>();
		
		for(int i =0 ; i< mat.length ; i++) {
			for(int j =0 ; j < mat[0].length; j++) {
				temp.add(mat[i][j]);
			}
		}
		
		for(int i =0 ; i< r ; i++) {
			for(int j =0 ; j < c; j++) {
				ans[i][j] = temp.getFirst();
				temp.removeFirst();
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = {{1,2},{3,4}};
		int r = 1, c = 4;
		
		//System.out.println(Arrays.toString(new ReshapeTheMatrix_566().matrixReshape(mat, r, c)));
		mat = new ReshapeTheMatrix_566().matrixReshape(mat, r, c);
		
		System.out.println(Arrays.toString(new ReshapeTheMatrix_566().matrixReshape(mat, r, c)));
	}

}
