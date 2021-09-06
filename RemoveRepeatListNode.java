public class RemoveRepeatListNode {
    public ListNode deleteDuplicates (ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        ListNode cur = head;
        while(cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                temp.next = cur;
                temp = cur;
                cur = cur.next;
            }
        }
        temp.next = null;
        return newHead.next;
    }
}
