public class Reverse {
    public  Node head;//链表逆置
    public Node reverseNode(Node head){
        Node newHead = null;
        Node prev = null;
        Node cur = this.head;
        while(cur!=null){
            Node curNext = cur.next;
            if (curNext==null){
                newHead=cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}
