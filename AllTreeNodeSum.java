import java.util.Stack;

public class AllTreeNodeSum {
    public int sumNumbers (TreeNode root) {
        if(root==null){
            return 0;
        }
        //记录最终结果
        int res = 0;
        //两个栈，一个存储节点，一个存储节点值
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();
        nodeStack.add(root);
        valueStack.add(root.val);
        while(!nodeStack.isEmpty()){
            //出栈
            TreeNode node = nodeStack.pop();
            int value = valueStack.pop();
            //如果为叶子节点
            if(node.left==null&&node.right==null){
                res += value;
            }else{
                //右节点不为空，入栈
                if(node.right!=null){
                    nodeStack.push(node.right);
                    valueStack.push(value*10+node.right.val);
                }
                if(node.left!=null){
                    nodeStack.push(node.left);
                    valueStack.push(value*10+node.left.val);
                }
            }
        }
        return res;
    }
}
