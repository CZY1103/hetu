public class LastButK {
    public Node FindKthToTail(Node head,int k) {
        if(k<=0||head == null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        while(k-1>0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                return null;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
