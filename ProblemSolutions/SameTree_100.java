
public class SameTree_100 {

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
	
	
	public boolean recursiveCall(TreeNode p, TreeNode q) {
		if(p == null && q != null ) {
			return false;
		}else if(p != null && q == null) {
			return false;
		}else if(p == null && q == null) {
			return true;
		}
		
		
		if(p.val == q.val) {
			recursiveCall(p.left, q.left);
			recursiveCall(p.right, q.right);
		}else {
			return false;
		}
		
		return false;
		
	}
	
	

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if(p == null && q != null ) {
			return false;
		}else if(p != null && q == null) {
			return false;
		}else if(p == null && q == null) {
			return true;
		}
		
		
		if(p.val == q.val) {
			recursiveCall(p.left, q.left);
			recursiveCall(p.right, q.right);
		}else {
			return false;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
