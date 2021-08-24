import java.util.*;
public class ReconstructBinaryTree {
    /**
     * 重建二叉树
     * @param pre 前序遍历
     * @param vin 中序遍历
     * @return 二叉树
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        if(pre.length==0||vin.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0 ;i < vin.length;i++){
            if(vin[i]== pre[0]){
                /**
                 * copyOfRange是输入java.util包中的Arrays类的静态内部方法，可以被类直接调用。
                 * 该函数的主要用途是对一个已有的数组进行截取复制，复制出一个左闭右开区间的数组。
                 */
                root.left = reConstructBinaryTree(Arrays.copyOfRange(
                        pre,1,i+1),Arrays.copyOfRange(vin,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(
                        pre,i+1,pre.length),Arrays.copyOfRange(vin,i+1,vin.length));
                break;
            }
        }
        return root;
    }
}
