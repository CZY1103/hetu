public class Depart {
    public Node partition(Node head,int data){
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = head;
        while(cur!=null){
            if(cur.data<data){
                if(bs==null){
                    bs=cur;
                    be=cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else{
                if(as==null){
                    as=cur;
                    ae=cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs==null){
            return as;
        }
        bs.next = as;
        if(as!=null){
            ae.next = null;
        }
        return bs;
    }
}
