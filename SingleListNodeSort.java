import java.util.Arrays;

public class SingleListNodeSort {
    public ListNode sortInList (ListNode head) {
        ListNode node = head;
        int len = length(node);
        int[] arr = new int[len];
        int i = 0;
        while(head!=null){
            arr[i]= head.val;
            head = head.next;
            i++;
        }
        Arrays.sort(arr);
        int j = 0;
        ListNode newHead = new ListNode(-1);
        ListNode mode = newHead;
        while(j < len){
            mode.next =new ListNode(arr[j]);
            j++;
            mode = mode.next;
        }
        return newHead.next;
    }
    public static int length(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}
