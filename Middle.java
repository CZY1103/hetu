public class Middle {
    public Node middleNode(Node head) {
        Node cur = head;
        Node tex = head;
        while(tex!=null&&tex.next!=null){
            cur=cur.next;
            tex=tex.next.next;
        }
        return cur;
    }
}
