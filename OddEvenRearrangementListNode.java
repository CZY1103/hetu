public class OddEvenRearrangementListNode {
    public ListNode oddEvenList (ListNode head) {
        if(head==null){
            return head;
        }
        ListNode evenHead = head.next;
        ListNode odd = head;//奇数位
        ListNode even = evenHead;//偶数位
        while(even!=null&&even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
//    public ListNode oddEvenList (ListNode head) {
//        ListNode odd = head;//奇数位
//        ListNode even = head.next;//偶数位
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = newHead;
//        while(odd.next!=null&&odd.next.next!=null){
//            cur.next = odd;
//            cur = cur.next;
//            odd = odd.next.next;
//        }
//        while(even.next!=null&&even.next.next!=null){
//            cur.next = even;
//            cur = cur.next;
//            even = even.next.next;
//        }
//        cur.next = null;
//        return newHead.next;
//    }
}
