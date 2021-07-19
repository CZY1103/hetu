public class DeleteLastNListNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (n > 0) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
            n--;
        }
        if (fast == null) {
            return head.next;
        }
        ListNode cur = null;
        while (fast != null) {
            fast = fast.next;
            cur = slow;
            slow = slow.next;
            if (fast == null) {
                cur.next = slow.next;
            }
        }
        return head;
    }
}
