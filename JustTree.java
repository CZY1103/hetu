import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JustTree {
    /**
     *
     * @param root TreeNode类 the root
     * @return bool布尔型一维数组
     */
    public boolean[] judgeIt (TreeNode root) {
        boolean[] arr = new boolean[2];
        arr[0] = binarySearchTree(root);
        arr[1] = perfectBinaryTree(root);
        return arr;
    }

    /**
     * 中序遍历
     * @param root 根节点
     */
    public static void midTraverse(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        midTraverse(root.left,list);
        list.add(root.val);
        midTraverse(root.right,list);
    }

    /**
     * 判断是否问二叉搜索树
     * 二叉搜索树中序遍历是有序的
     * @param root 根节点
     * @return 是否问二叉搜索树
     */
    public static boolean binarySearchTree(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        midTraverse(root,list);
        if (root==null){
            return true;
        }
        for(int i = 0 ;i < list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否为完全二叉树
     * @param root 根节点
     * @return 结果值
     */
    public static boolean perfectBinaryTree(TreeNode root){
        if (root==null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //标记是否遇到左右孩子不双全的而节点
        boolean flag = false;
        while(!queue.isEmpty()){
            root = queue.poll();
            //左右孩子不双全但不是叶子结点  左孩子为空但右孩子不为空
            if ((flag&&!(root.left==null&& root.right==null))||(root.left==null&&root.right!=null)){
                return false;
            }
            if (root.left!=null){
                queue.add(root.left);
            }
            if (root.right!=null){
                queue.add(root.right);
            }
            if (root.left==null||root.right==null){
                flag = true;
            }
        }
        return true;
    }
}
