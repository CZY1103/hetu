import java.util.ArrayList;
import java.util.List;

public class FindFaultyInSearchTree {
    public static List<Integer> list = new ArrayList<>();
    public static void  midTree(TreeNode  root){
        if(root!=null){
            midTree(root.left);
            list.add(root.val);
            midTree(root.right);
        }
    }
    public int[] findError (TreeNode root) {
        int[] arr = new int[2];
        if(root==null){
            return arr;
        }
        midTree(root);
        int i,j;
        for(i = 0;i < list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                arr[1]=list.get(i);
                break;
            }
        }
        for(j = list.size()-1;j>i;j--){
            if(list.get(j)<list.get(j-1)){
                arr[0]=list.get(j);
                break;
            }
        }
        return arr;
    }
}
