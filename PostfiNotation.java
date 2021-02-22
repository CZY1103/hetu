import java.util.Stack;

public class PostfiNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer>  s = new Stack<>();
        for (int i = 0;i<tokens.length;i++){
            if (tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int nums1 = s.peek();
                s.pop();
                int nums2 = s.peek();
                s.pop();
                if (tokens[i].equals("+")){
                    s.push(nums1+nums2);
                }
                if (tokens[i].equals("-")){
                    s.push(nums2-nums1);
                }
                if (tokens[i].equals("*")){
                    s.push(nums1*nums2);
                }
                if (tokens[i].equals("/")){
                    s.push(nums2/nums1);
                }
            }else{
                s.push(Integer.valueOf(tokens[i]));
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String[] nums = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(nums));
    }
}
