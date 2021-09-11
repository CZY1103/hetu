public class LastNodes {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if(pHead==null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        int m = 0;
        while(pHead!=null){
            pHead = pHead.next;
            m++;
        }
        if(m<k){
            return null;
        }
        while(k>0){
            fast = fast.next;
            k--;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
