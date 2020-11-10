public class Merge {//合并两个有序链表
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node cur = newHead;
        while(headA!=null&&headB!=null) {
            if (headA.data < headB.data) {
                cur.next = headA;
                headA = headA.next;
            } else {
                cur.next = headB;
                headB = headB.next;
            }
            cur=cur.next;
        }
        if(headA!=null){
            cur.next=headA;
        }
        if (headB!=null){
            cur.next=headB;
        }
        return newHead.next;
    }
}
