public class Remove {
    public Node head;
    public void removeAllKey(int key){
        if (this.head == null){
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null){
            if(cur.data == key){
                prev.next = cur.next;
                cur=cur.next;
            }else{
                prev = cur;
                cur=cur.next;
            }
        }
        if (this.head.data == key){
            this.head = this.head.next;
        }
    }
}
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}


