public class MergeList {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head = (l1.val<l2.val)?l1:l2;
        ListNode cur = head;
        l1 = (head==l1)?l1.next:l1;
        l2 = (head==l2)?l2.next:l2;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else{
                cur.next= l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        cur.next = (l1==null)?l2:l1;
        return head;
    }
}
