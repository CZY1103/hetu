import java.util.HashSet;

public class EntryPointLinked {
    //哈希法
//    public ListNode EntryNodeOfLoop(ListNode pHead) {
//        HashSet<ListNode> set = new HashSet<>();
//        ListNode cur = pHead;
//        while(cur!=null){
//            if(set.contains(cur)){
//                return cur;
//            }else{
//                set.add(cur);
//            }
//            cur = cur.next;
//        }
//        return null;
//    }

    /**
     * 快慢指针
     * @param pHead 头节点
     * @return 入环结点
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null||pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        ListNode cur = pHead;
        while(cur!=slow){
            cur = cur.next;
            slow = slow.next;
        }
        return cur;
    }
}
