
public class RemoveDuplicatesfromSortedList_83 {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode ans = head;
		
		while (head != null) {
			ListNode previous = head;
			ListNode current = head.next;

			if (current != null && current.val == previous.val) {
				current = current.next;
				head.next = current;
				//head = current;

			} else {
				head = head.next;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		RemoveDuplicatesfromSortedList_83 obj = new RemoveDuplicatesfromSortedList_83();
//
//		//ListNode a = new ListNode();
//
//		obj.deleteDuplicates(a);

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
