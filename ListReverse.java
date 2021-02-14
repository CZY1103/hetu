public class ListReverse{
    public static Node reverseList(Node head) {
        Node cur = null;
        Node temp = null;
        while(head!=null){
            if(head.next==null){
                temp=head;
            }
            Node headNext = head.next;
            head.next = cur;
            cur = head;
            head = headNext;
        }
        return temp;
    }
}
class Node{
    public Node next;
}
