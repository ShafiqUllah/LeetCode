
public class MaximumDepthOfBinaryTree_104 {

	public int maxDepth(TreeNode root) {
		return recDepth(root, 0);
	}

	private int recDepth(TreeNode root, int depth) {
		if (root == null)
			return 1;

		int first = depth +recDepth(root.left, depth);
		int second = depth +recDepth(root.right, depth);

		return first > second ? first : second;

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
