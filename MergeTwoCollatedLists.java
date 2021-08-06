public class MergeTwoCollatedLists {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head = list1.val<list2.val?list1:list2;
        ListNode cur = head;
        if(head==list2){
            list2=list2.next;
        }else{
            list1=list1.next;
        }
        while(list2!=null||list1!=null){
            if(list1==null){
                head.next=list2;
                break;
            }
            if(list2==null){
                head.next=list1;
                break;
            }
            if(list1.val<list2.val){
                head.next=list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        return cur;
    }
}
