import java.util.ArrayList;
import java.util.List;

public class SymmetricTree_101 {

	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);

	}

	public boolean isMirror(TreeNode t1, TreeNode t2)
    {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if(t1.val !=t2.val) return false;
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SymmetricTree_101 obj = new SymmetricTree_101();

		// [1,2,2,3,4,4,3]
		

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
