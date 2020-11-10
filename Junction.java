public class Junction {//找到两个链表的交点
    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA==null||headB==null){return null;}
        Node cur1 = headA;
        Node cur2 = headB;
        int k1=0;
        int k2=0;
        while(cur1!=null){
            k1++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            k2++;
            cur2=cur2.next;
        }
        cur1=headA;
        cur2=headB;
        int k = 0;
        if(k1<k2){
            k=k2-k1;
            while(k>0){
                cur2=cur2.next;
                k--;
            }
        }else{
            k=k1-k2;
            while(k>0){
                cur1=cur1.next;
                k--;
            }
        }
        while(cur1!=null&&cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        if(cur1==cur2&&cur1!=null){return cur1;}
        return null;
    }
}
