public class TwoListNodeAdd {
    public ListNode addInList (ListNode head1, ListNode head2) {
        if(head1==null||head2==null){
            return null;
        }
        if(head2==null){
            return head1;
        }
        if(head1==null){
            return head2;
        }
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode head = new ListNode(-1);
        ListNode nHead = head;
        int temp = 0;
        while(head1!=null || head2!=null){
            int val = temp;
            if(head1!=null){
                val = val+head1.val;
                head1 = head1.next;
            }
            if(head2!=null){
                val = val+head2.val;
                head2 = head2.next;
            }
            temp = val/10;
            nHead.next = new ListNode(val%10);
            nHead = nHead.next;
        }
        if(temp>0){
            nHead.next = new ListNode(temp);
        }
        return reverse(head.next);
    }
    public static ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur = null;
        while(head!=null){
            ListNode curNext = head.next;
            head.next = cur;
            cur = head;
            head = curNext;
        }
        return cur;
    }
}
