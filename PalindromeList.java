public class PalindromeList {
    public boolean isPail (ListNode head){
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode newList = null;
        while(fast!=null){
            newList = fast.next;
            fast.next = slow;
            slow = fast;
            fast = newList;
        }
        fast = slow;
        while(fast!=null&&head!=null){
            if (fast.val!=head.val){
                return false;
            }
            fast = fast.next;
            head = head.next;
        }
        return  true;
    }
}
