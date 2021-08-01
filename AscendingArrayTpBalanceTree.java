public class AscendingArrayTpBalanceTree {
    public TreeNode sortedArrayToBST (int[] num) {
        if(num==null){
            return null;
        }
        return net(num,0,num.length-1);
    }
    public static TreeNode net(int[] num,int left,int right){
        if(left>right){
            return null;
        }
        int mid = left+(right-left+1)/2;
        TreeNode lNode = net(num,left,mid-1);
        TreeNode rNode = net(num,mid+1,right);
        TreeNode node = new TreeNode(num[mid]);
        if(lNode!=null){
            node.left = lNode;
        }
        if(rNode!=null){
            node.right = rNode;
        }
        return node;
    }
}
