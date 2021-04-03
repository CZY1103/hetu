public class ListNodeApart {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode OneHead = new ListNode(-1);
        ListNode TwoHead = new ListNode(-1);
        ListNode cur = pHead;
        ListNode Onecur = OneHead;
        ListNode Twocur = TwoHead;
        while(cur!=null){
            if(cur.val<x){
                Onecur.next= new ListNode(cur.val);
                Onecur = Onecur.next;
            }else{
                Twocur.next = new ListNode(cur.val);
                Twocur = Twocur.next;
            }
            cur = cur.next;
        }
        cur = OneHead;
        while(cur.next!=null&&cur.next.val!=-1){
            cur = cur.next;
        }
        cur.next= TwoHead.next;
        return OneHead.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
