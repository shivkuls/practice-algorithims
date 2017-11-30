public class deleteDupeNode {
	public ListNode deleteDuplicates(ListNode a) {
	    ListNode start = a;
	    while(a.next != null){
	        if(a.val == a.next.val){
	            a.next = a.next.next;
	            continue;
	        }
	        a = a.next;
	    }
	    return start;
	}
}
