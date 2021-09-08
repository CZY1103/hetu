public class ReverseSpecifiedIntervalsListNode {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        //设置虚拟头节点
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        //记录开始节点的上一个节点
        ListNode cur = newHead;
        for(int i = 0;i < m-1;i++){
            cur = cur.next;
        }
        //记录开始节点
        ListNode start = cur.next;
        //记录结束节点
        ListNode end = head;
        while(n>1){
            end = end.next;
            n--;
        }
        //结束节点的后一个节点
        ListNode last = end.next;
        //截取链表
        end.next = null;
        cur.next =null;
        cur.next = reverseLinkedList(start);
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = last;
        return newHead.next;
    }

    /**
     * 反转链表
     * @param head 头节点
     * @return 反转后的头节点
     */
    public static ListNode reverseLinkedList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur = null;
        while(head!=null){
            ListNode headNext = head.next;
            head.next = cur;
            cur = head;
            head = headNext;
        }
        return cur;
    }
}
