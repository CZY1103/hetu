public class Huiwen {
    public Node head;
    public boolean chkPalindrome(){
        if(this.head == null){
            return false;
        }
        if(this.head.next==null){
            return true;
        }
        Node slow = this.head;
        Node fast = this.head;
        while(fast.next!=null&&fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node cur = slow.next;
        while(cur!=null){
            Node curNext =cur.next;
            cur.next = slow;
            slow = cur;
            cur=curNext;
        }
        while(head!=slow){
            if(head.data!=slow.data){
                return false;
            }
            if(head.next==slow){
                return true;
            }
            head = head.next;
            slow =slow.next;
        }
        return true;
    }
}
