public class Cycle {
    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public Node hasCycleFirst(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow =head;
        while(fast!=slow){
            slow=slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
