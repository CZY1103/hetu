public class ListAnd {
    public ListNode plusAB(ListNode a, ListNode b) {
        if(a==null||b==null){
            return null;
        }
        ListNode c=new ListNode(0);
        c.val=a.val+b.val;
        ListNode cur=c;
        while(a!=null){
            cur.val=a.val+b.val;
            cur=cur.next;
            a=a.next;
            b=b.next;
        }
        return c;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode cur=new ListNode(0);
        cur.val=a.val;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

