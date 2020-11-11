public class RrmoveDuplicates {
    public Node deleteDuplicates(Node head) {
        if(head == null){return null;}
        Node cur = head;
        while(cur!=null&&cur.next!=null){
            if(cur.data==cur.next.data){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
