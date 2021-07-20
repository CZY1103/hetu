import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeZigzagOrder {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(pRoot);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0;i < size;i++){
                TreeNode node = queue.poll();
                if (node == null){
                    continue;
                }
                if (!reverse){
                    list.add(node.val);
                }else{
                    list.add(0,node.val);
                }
                queue.add(node.left);
                queue.add(node.right);
            }
            if (list.size()>0){
                result.add(list);
            }
            reverse=!reverse;
        }
        return result;
    }
}
