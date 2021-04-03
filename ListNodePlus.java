public class ListNodePlus {
    public ListNode plusAB(ListNode a, ListNode b) {
        int aValue = listNodeConvertIntValue(a);
        int bValue = listNodeConvertIntValue(b);
        int sumValue = aValue+bValue;
        return intValueConvertListNode(sumValue);
    }

    private int listNodeConvertIntValue(ListNode node) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = node;
        while(cur!=null){
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    private ListNode intValueConvertListNode(int value){
        char[] chars = String.valueOf(value).toCharArray();
        ListNode node = new
                ListNode(Integer.parseInt(String.valueOf(chars[chars.length - 1])));
        ListNode cur = node;
        for (int i = chars.length-2;i>=0;i--){
            ListNode newNode =new
                    ListNode(Integer.parseInt(String.valueOf(chars[i])));
            cur.next = newNode;
            cur = newNode;
        }
        return node;
    }
}
