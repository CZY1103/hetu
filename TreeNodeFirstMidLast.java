import java.util.ArrayList;

public class TreeNodeFirstMidLast {
    public static void firstOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        firstOrder(root.left,list);
        firstOrder(root.right,list);
    }
    public static void midOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        midOrder(root.left,list);
        list.add(root.val);
        midOrder(root.right,list);
    }
    public static void lastOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        lastOrder(root.left,list);
        lastOrder(root.right,list);
        list.add(root.val);
    }

    public int[][] threeOrders (TreeNode root) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        firstOrder(root,list1);
        midOrder(root,list2);
        lastOrder(root,list3);
        int[][] arrays = new int[3][list3.size()];
        for(int i = 0;i < list1.size();i++){
            arrays[0][i]= list1.get(i);
            arrays[1][i]= list2.get(i);
            arrays[2][i]= list3.get(i);
        }
        return arrays;
    }
}
