
public class PathSum_112 {

	public boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null) {
			return root.val == targetSum ? true : false;
		}
			

		return recursiveSol(root, 0, targetSum);

	}

	private boolean recursiveSol(TreeNode root, int currentSum, int targetSum) {

		if (root.left == null && root.right == null) {
			return currentSum + root.val == targetSum ? true : false;
		}

		boolean left = false, right = false;
		if (root.left != null)
			left = recursiveSol(root.left, currentSum + root.val, targetSum);
		if (root.right != null)
			right = recursiveSol(root.right, currentSum + root.val, targetSum);

		if (left)
			return left;
		if (right)
			return right;

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
