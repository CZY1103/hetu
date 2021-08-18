public class ListNodeReverseK {
    public ListNode reverseKGroup (ListNode head, int k) {
        if(k<=1||head==null||head.next==null){
            return head;
        }
        ListNode node = head;
        int len = length(head);
        head = node;
        int part = len/k;
        ListNode result = new ListNode(0);
        ListNode now = result;
        for(int i = 0 ;i < part;i++){
            ListNode temp = null;
            for(int j = 0 ;j < k;j++){
                ListNode headNext = head.next;
                head.next = temp;
                temp = head;
                head = headNext;
            }
            now.next = temp;
            while(now.next!=null){
                now = now.next;
            }
        }
        now.next = head;
        return result.next;
    }
    public static int length(ListNode head){
        int cnt = 0;
        if(head!=null){
            cnt = 1;
        }
        while(head.next!=null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}
