public class Delect {
    public Node deleteDuplication(Node head){
        Node newHead = new Node(-1);
        Node temp = newHead;
        Node cur = head;
        while(cur!=null){
            if (cur.next!=null&&cur.data==cur.next.data){
                while(cur.next!=null&&cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                temp.next=cur;
                temp=temp.next;
                cur=cur.next;
            }
        }
        temp.next=null;
        return newHead.next;
    }
}
